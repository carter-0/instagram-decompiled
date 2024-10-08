package X;

import java.util.Observable;

/* renamed from: X.3LD  reason: invalid class name */
public final class AnonymousClass3LD extends Observable implements C61110lV {
    public static AnonymousClass3LD A02;
    public String A00 = "";
    public boolean A01 = true;

    public final void A00(String str, String str2, String str3) {
        if (str == null) {
            str = "null";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = str2;
        }
        this.A00 = 0mp.A06("%s\nV1: %s\nV2: %s", new Object[]{str, str2, str3});
        setChanged();
        notifyObservers();
    }

    public AnonymousClass3LD() {
        14i.A03(15Y.A03, this);
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(999799061);
        this.A01 = false;
        setChanged();
        notifyObservers();
        AnonymousClass0fD.A0A(-1889941938, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1913549138);
        this.A01 = true;
        setChanged();
        notifyObservers();
        AnonymousClass0fD.A0A(-162586604, A03);
    }
}
