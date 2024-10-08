package X;

import com.facebook.msys.mci.Database;

/* renamed from: X.6Ei  reason: invalid class name */
public final class AnonymousClass6Ei implements C3029065w {
    public final /* synthetic */ C3029065w A00;
    public final /* synthetic */ C300435xB A01;

    public AnonymousClass6Ei(C3029065w r1, C300435xB r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Database.SchemaDeployer BGf() {
        return new C304626Eo(this);
    }

    public final Database.SchemaDeployer BGg() {
        return new C304606Em(this);
    }

    public final Database.SchemaDeployer BGh() {
        return new C304616En(this);
    }

    public final Database.SchemaDeployer BWV() {
        return this.A00.BWV();
    }

    public final Database.SchemaDeployer Bbq() {
        return this.A00.Bbq();
    }

    public final Database.VirtualTableModuleRegistrator CFU() {
        return this.A00.CFU();
    }
}
