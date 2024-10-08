package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;

/* renamed from: X.McR  reason: case insensitive filesystem */
public final class C66780McR implements C46199DQb {
    public final /* synthetic */ C74401PuH A00;
    public final /* synthetic */ AnonymousClass2Ep A01;
    public final /* synthetic */ C66815Md1 A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;

    public C66780McR(C74401PuH puH, AnonymousClass2Ep r2, C66815Md1 md1, Long l, String str) {
        this.A02 = md1;
        this.A00 = puH;
        this.A04 = str;
        this.A03 = l;
        this.A01 = r2;
    }

    public final void DOY(C257443xP r9) {
        Integer num;
        XSV xsv;
        C69354Njt njt;
        if (r9.A06()) {
            C66815Md1 md1 = this.A02;
            if (182.A06(0Tu.A05, md1.A02, 36310989255410065L)) {
                N3L n3l = (N3L) r9.A03();
                md1.A01 = n3l;
                Integer num2 = null;
                if (n3l != null) {
                    num = n3l.A02;
                } else {
                    num = null;
                }
                if (num == AnonymousClass05K.A01) {
                    C14038Tof tof = md1.A03;
                    if (n3l != null) {
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        A1H.put(DialogModule.KEY_TITLE, n3l.A0D);
                        A1H.put("subtitle", n3l.A06);
                        A1H.put("context", n3l.A09);
                        String str = n3l.A08;
                        String str2 = "";
                        if (str == null) {
                            str = str2;
                        }
                        A1H.put(Pxd.A00(98), str);
                        String str3 = n3l.A0B;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        A1H.put(Pxd.A00(267), str2);
                        C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, tof.A02, "com.bloks.www.proactive_warning.composer_block.action", 0Yt.A0B(A1H));
                        A022.A00(new C15409UcL(0, n3l, tof));
                        1ES.A03(A022);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    if (n3l != null) {
                        num2 = n3l.A02;
                    }
                    if (num2 != AnonymousClass05K.A0C) {
                        C66813Mcz mcz = md1.A04;
                        String str4 = this.A04;
                        Long l = this.A03;
                        0qQ.A0A(l);
                        long longValue = l.longValue();
                        if (this.A01.CUG()) {
                            xsv = XSV.A05;
                        } else {
                            xsv = XSV.A06;
                        }
                        N3L n3l2 = md1.A01;
                        if (n3l2 == null || (njt = n3l2.A01) == null) {
                            njt = C69354Njt.UNDEFINED;
                        }
                        mcz.A01(xsv, njt, str4, longValue);
                        this.A00.DoM(md1);
                        return;
                    }
                }
            }
        }
        this.A00.onFailure();
    }
}
