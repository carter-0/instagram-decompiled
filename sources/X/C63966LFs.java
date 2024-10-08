package X;

/* renamed from: X.LFs  reason: case insensitive filesystem */
public final class C63966LFs {
    public C62530KhM A00;
    public boolean A01;
    public final String A02;

    public C63966LFs(String str) {
        C62530KhM khM = C62530KhM.UNKNOWN;
        this.A02 = str;
        this.A00 = khM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A02.equals(((C63966LFs) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final String toString() {
        return 0mp.A06("Participant(id=%s, state=%s)", new Object[]{this.A02, this.A00.name()});
    }
}
