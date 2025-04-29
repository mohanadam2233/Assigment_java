package Assigment_ca2213;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Service
public class StaffService {
    private final Map<Long, Staff> staffMap = new HashMap<>();
    private Long nextId = 1L;

    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffMap.values());
    }

    public Staff getStaffById(Long id) {
        return staffMap.get(id);
    }

    @PostConstruct
    public void init() {
        Staff s1 = new Staff();
        s1.setName("Ahmed Ali");
        s1.setRole("Manager");
        createStaff(s1);

        Staff s2 = new Staff();
        s2.setName("Ayaan Yusuf");
        s2.setRole("Developer");
        createStaff(s2);
    }


    public Staff createStaff(Staff staff) {
        staff.setId(nextId++);
        staffMap.put(staff.getId(), staff);
        return staff;
    }

    public Staff updateStaff(Long id, Staff updatedStaff) {
        Staff existingStaff = staffMap.get(id);
        if (existingStaff != null) {
            updatedStaff.setId(id);
            staffMap.put(id, updatedStaff);
            return updatedStaff;
        }
        return null;
    }

    public boolean deleteStaff(Long id) {
        return staffMap.remove(id) != null;
    }
}
