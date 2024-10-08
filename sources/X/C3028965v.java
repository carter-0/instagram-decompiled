package X;

import com.facebook.msys.mci.Database;
import com.facebook.systrace.Systrace;

/* renamed from: X.65v  reason: invalid class name and case insensitive filesystem */
public final class C3028965v implements C3029065w {
    public final Database.SchemaDeployer BGf() {
        return (Database.SchemaDeployer) C3028365p.A01.getValue();
    }

    public final Database.SchemaDeployer BGg() {
        return (Database.SchemaDeployer) C3028365p.A02.getValue();
    }

    public final Database.SchemaDeployer BGh() {
        return (Database.SchemaDeployer) C3028365p.A03.getValue();
    }

    public final Database.SchemaDeployer BWV() {
        if (Systrace.A0E(1)) {
            0fS.A01("getNonVirtualTablePersistentSchemaDeployer", 1532518241);
        }
        C71727Opm opm = C71727Opm.A00;
        if (Systrace.A0E(1)) {
            0fS.A00(1816255984);
        }
        return opm;
    }

    public final Database.SchemaDeployer Bbq() {
        return (Database.SchemaDeployer) C3028365p.A04.getValue();
    }

    public final Database.VirtualTableModuleRegistrator CFU() {
        return (Database.VirtualTableModuleRegistrator) C3028365p.A05.getValue();
    }
}
