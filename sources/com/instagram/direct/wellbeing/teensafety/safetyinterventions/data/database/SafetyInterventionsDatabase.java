package com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database;

import X.C332387Uu;
import X.C332407Ux;
import com.instagram.roomdb.IgRoomDatabase;

public abstract class SafetyInterventionsDatabase extends IgRoomDatabase {
    public static final C332387Uu A00 = new Object();

    public final C332407Ux A00() {
        C332407Ux r0;
        SafetyInterventionsDatabase_Impl safetyInterventionsDatabase_Impl = (SafetyInterventionsDatabase_Impl) this;
        if (safetyInterventionsDatabase_Impl.A01 != null) {
            return safetyInterventionsDatabase_Impl.A01;
        }
        synchronized (safetyInterventionsDatabase_Impl) {
            if (safetyInterventionsDatabase_Impl.A01 == null) {
                safetyInterventionsDatabase_Impl.A01 = new C332407Ux(safetyInterventionsDatabase_Impl);
            }
            r0 = safetyInterventionsDatabase_Impl.A01;
        }
        return r0;
    }
}
