package X;

public final class HID extends HQ2 {
    public final C56105Hss A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HID) && 0qQ.A0K(this.A00, ((HID) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public HID(C56105Hss hss) {
        this.A00 = hss;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EmuFlashScreen(flashGeneratedImage=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public HID() {
        this((C56105Hss) null);
    }
}
