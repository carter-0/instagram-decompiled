package X;

import java.util.List;

/* renamed from: X.IbO  reason: case insensitive filesystem */
public final class C57478IbO implements AnonymousClass8Wm {
    public final /* synthetic */ C57106IOu A00;
    public final /* synthetic */ String A01;

    public final String AbO() {
        return "live_comment_create";
    }

    public final /* synthetic */ void Cxz() {
    }

    public final /* synthetic */ void DND() {
    }

    public final /* synthetic */ void E09() {
    }

    public final /* synthetic */ void E0A() {
    }

    public C57478IbO(C57106IOu iOu, String str) {
        this.A00 = iOu;
        this.A01 = str;
    }

    public final void DuW() {
        C57106IOu iOu = this.A00;
        C60291Jio A002 = C57106IOu.A00(iOu);
        String str = this.A01;
        0qQ.A0B(str, 0);
        C60291Jio.A00((M0V) null, A002, str, 15, false, false, false);
        AnonymousClass7TF.A0D().postDelayed(new C57758Ifz(iOu), 100);
    }

    public final void E3I() {
        C57106IOu iOu = this.A00;
        C60291Jio A002 = C57106IOu.A00(iOu);
        H80 h80 = iOu.A0B;
        long A003 = h80.A00();
        int i = h80.A00;
        h80.A00 = 0;
        A002.A01(this.A01, i, A003, false);
    }

    public final List getContent() {
        return AnonymousClass7TE.A1I(this.A01);
    }
}
