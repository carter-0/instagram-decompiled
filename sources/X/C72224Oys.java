package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oys  reason: case insensitive filesystem */
public final class C72224Oys implements AnonymousClass11X {
    public Object A00;
    public Object A01 = AnonymousClass7TE.A1C();
    public final /* synthetic */ C72921PPf A02;
    public final /* synthetic */ String A03;

    public final int getRunnableId() {
        return 567;
    }

    public C72224Oys(C72921PPf pPf, String str) {
        this.A02 = pPf;
        this.A03 = str;
    }

    public final String getName() {
        return "queryInterop";
    }

    public final void onCancel() {
        C72921PPf pPf = this.A02;
        pPf.A0C.A02(2, 1, 0);
        OKM okm = pPf.A00;
        if (okm != null) {
            okm.A00(true, 0);
        }
    }

    public final void onFinish() {
        String str = this.A03;
        C72921PPf pPf = this.A02;
        if (0qQ.A0K(str, pPf.A06)) {
            pPf.A08 = false;
            pPf.A04 = this.A00;
            pPf.A05 = this.A01;
            C336267eL r0 = pPf.A0F;
            r0.EcJ((C337237fw) null);
            r0.EhX(str);
            r0.EcJ(pPf);
            C336267eL r02 = pPf.A0E;
            if (r02 != null) {
                r02.EcJ((C337237fw) null);
                r02.EhX(str);
                r02.EcJ(pPf);
            }
        }
    }

    public final void onStart() {
        C72921PPf pPf = this.A02;
        C72919PPd pPd = pPf.A02;
        if (pPd != null) {
            pPd.EhX(this.A03);
            pPd.EcJ(pPf);
        }
        C65615Lwq lwq = pPf.A01;
        if (lwq != null) {
            lwq.EhX(this.A03);
            lwq.EcJ(pPf);
        }
    }

    public final void run() {
        C49888FBo fBo;
        String str;
        Object obj;
        Object obj2;
        Integer num;
        C72921PPf pPf = this.A02;
        OWV owv = pPf.A0C;
        String str2 = this.A03;
        String str3 = str2;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            fBo = null;
        } else {
            UserSession userSession = owv.A0F;
            Context context = owv.A0E;
            C290645fe r2 = owv.A03;
            2Dm A002 = 1bJ.A00(userSession);
            String str4 = owv.A0H;
            fBo = new C49888FBo(context, r2, userSession, A002);
            fBo.A02(str2, owv.A0I, str4);
            C290865g5 r0 = fBo.A01;
            if (r0 != null) {
                str = r0.A01;
            } else {
                str = null;
            }
            owv.A07 = str;
            owv.A0G.A00(owv.A00, 1, 0, (long) fBo.A00(true).size());
        }
        this.A00 = fBo;
        Object Bo1 = pPf.A0F.Bo1();
        C336267eL r02 = pPf.A0E;
        Object obj3 = null;
        if (r02 != null) {
            obj = r02.Bo1();
        } else {
            obj = null;
        }
        C72919PPd pPd = pPf.A02;
        if (pPd != null) {
            obj2 = pPd.A01;
        } else {
            obj2 = null;
        }
        C65615Lwq lwq = pPf.A01;
        if (lwq != null) {
            obj3 = lwq.A01;
        }
        if (str3 == null) {
            str3 = "";
        }
        this.A01 = owv.A01(fBo, Bo1, obj, obj2, obj3, str3);
        OKM okm = pPf.A00;
        if (okm != null && (num = okm.A00) != null) {
            okm.A01.networkQueryStart(num.intValue(), "server_entities_named_dsq1");
        }
    }
}
