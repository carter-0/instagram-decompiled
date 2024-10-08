package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.E2v  reason: case insensitive filesystem */
public final class C47449E2v extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EvergreenSafetyCheckV2Fragment";
    public FragmentActivity A00;
    public F2M A01;
    public Integer A02 = AnonymousClass05K.A00;
    public boolean A03;
    public boolean A04 = true;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.setTitle("");
        DbX.A1A(new C50109FOz((Object) this, 0), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return "evergreen_safety_check_v2_fragment";
    }

    public static final void A01(C47449E2v e2v) {
        if (e2v.A07 && !e2v.A03) {
            return;
        }
        if (!e2v.A08 || e2v.A06) {
            AnonymousClass7TF.A0D().post(new C51316FsA(e2v));
            C310336ap A0a = DbS.A0a();
            A0a.A06();
            DbS.A1E(e2v, A0a, 2131961778);
            A0a.A0L = true;
            A0a.A0G = DbU.A0m(e2v, 2131961777);
            A0a.A01 = DbX.A07(Dc2.A0S);
            FdH.A00(A0a, e2v, 12);
            DbY.A1N(A0a);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public static final HashMap A00(C47449E2v e2v) {
        HashMap A1E = AnonymousClass7TE.A1E();
        if (e2v.A07) {
            A1E.put("hide_more_comments", String.valueOf(e2v.A05));
        }
        if (e2v.A08) {
            A1E.put("hide_message_requests", String.valueOf(e2v.A04));
        }
        return A1E;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        String str;
        int A022 = AnonymousClass0fD.A02(-1974805532);
        C47449E2v.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0eM r2 = this.A09;
        this.A01 = new F2M(this, AnonymousClass7TE.A0l(r2));
        this.A00 = requireActivity();
        User A0l = DbX.A0l(AnonymousClass0t1.A01, r2);
        Boolean CUd = A0l.A03.CUd();
        if (CUd != null) {
            this.A07 = !CUd.booleanValue();
        }
        boolean z = !A0l.A2I();
        this.A08 = z;
        if (!z && !this.A07) {
            this.A08 = true;
            this.A07 = true;
            0wb.A03("evergreen_safety_check_v2_fragment", "Both settings are already on");
        }
        if (bundle2 != null) {
            String string = bundle2.getString("event");
            if (string == null) {
                string = "";
            }
            Integer[] A002 = AnonymousClass05K.A00(2);
            int i = 0;
            int length = A002.length;
            while (true) {
                if (i >= length) {
                    num = AnonymousClass05K.A00;
                    break;
                }
                num = A002[i];
                if (1 - num.intValue() != 0) {
                    str = "";
                } else {
                    str = "election";
                }
                if (str.equals(string)) {
                    break;
                }
                i++;
            }
            this.A02 = num;
        }
        AnonymousClass0fD.A09(-619187007, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r7.A07 == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = -519053640(0xffffffffe10fdeb8, float:-1.6587081E20)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r8, r2)
            r0 = 2131629250(0x7f0e14c2, float:1.8885816E38)
            android.view.View r5 = r8.inflate(r0, r9, r2)
            r0 = 2131440610(0x7f0b33e2, float:1.8503208E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = (com.instagram.igds.components.headline.IgdsHeadline) r1
            java.lang.Integer r0 = r7.A02
            int r0 = r0.intValue()
            r3 = 1
            if (r0 == r3) goto L_0x0124
            if (r0 != r2) goto L_0x0163
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0119
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x010e
            r0 = 2131961780(0x7f1327b4, float:1.9560267E38)
            r1.setHeadline((int) r0)
            r0 = 2131961779(0x7f1327b3, float:1.9560265E38)
        L_0x0037:
            r1.setBody((int) r0)
            r0 = 2131237696(0x7f081b40, float:1.809165E38)
        L_0x003d:
            r1.setImageResource(r0)
            r0 = 2131428887(0x7f0b0617, float:1.8479431E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r5, r0)
            X.61u r6 = (X.C3021461u) r6
            r6.setVisibility(r2)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0057
            boolean r1 = r7.A07
            r0 = 2131972491(0x7f13518b, float:1.9581991E38)
            if (r1 != 0) goto L_0x005a
        L_0x0057:
            r0 = 2131972492(0x7f13518c, float:1.9581993E38)
        L_0x005a:
            X.DbZ.A1A(r7, r6, r0)
            X.FOz r0 = new X.FOz
            r0.<init>((java.lang.Object) r7, (int) r3)
            r6.setPrimaryActionOnClickListener(r0)
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            java.lang.String r0 = r7.getString(r0)
            r6.setSecondaryActionText(r0)
            r1 = 2
            X.FOz r0 = new X.FOz
            r0.<init>((java.lang.Object) r7, (int) r1)
            r6.setSecondaryActionOnClickListener(r0)
            r6.setPrimaryButtonEnabled(r3)
            r6.setSecondaryButtonEnabled(r3)
            r0 = 2131433927(0x7f0b19c7, float:1.8489654E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0108
            r1.setVisibility(r2)
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r1.setTextCellType(r0)
            r0 = 2131237893(0x7f081c05, float:1.809205E38)
            r1.A05(r0)
            java.lang.Integer r0 = r7.A02
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x0104
            if (r0 != r2) goto L_0x015e
            r0 = 2131972497(0x7f135191, float:1.9582003E38)
        L_0x00a6:
            X.Dba.A14(r7, r1, r0)
            r0 = 2131972490(0x7f13518a, float:1.958199E38)
            java.lang.String r0 = X.DbU.A0m(r7, r0)
            r1.A0H(r0)
            boolean r0 = r7.A04
            r1.setChecked(r0)
            r0 = 20
            X.FdS.A00(r1, r7, r0)
        L_0x00bd:
            r0 = 2131433929(0x7f0b19c9, float:1.8489658E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x00fe
            r1.setVisibility(r2)
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r1.setTextCellType(r0)
            r0 = 2131238274(0x7f081d82, float:1.8092822E38)
            r1.A05(r0)
            r0 = 2131972494(0x7f13518e, float:1.9581997E38)
            X.Dba.A14(r7, r1, r0)
            r0 = 2131972493(0x7f13518d, float:1.9581995E38)
            java.lang.String r0 = X.DbU.A0m(r7, r0)
            r1.A0H(r0)
            boolean r0 = r7.A05
            r1.setChecked(r0)
            r0 = 21
            X.FdS.A00(r1, r7, r0)
        L_0x00f2:
            X.F2M r0 = r7.A01
            if (r0 != 0) goto L_0x0135
            X.DbS.A12()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fe:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00f2
        L_0x0104:
            r0 = 2131972496(0x7f135190, float:1.9582001E38)
            goto L_0x00a6
        L_0x0108:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00bd
        L_0x010e:
            r0 = 2131972485(0x7f135185, float:1.9581979E38)
            r1.setHeadline((int) r0)
            r0 = 2131961773(0x7f1327ad, float:1.9560252E38)
            goto L_0x0037
        L_0x0119:
            r0 = 2131972489(0x7f135189, float:1.9581987E38)
            r1.setHeadline((int) r0)
            r0 = 2131961776(0x7f1327b0, float:1.9560258E38)
            goto L_0x0037
        L_0x0124:
            r0 = 2131961775(0x7f1327af, float:1.9560256E38)
            r1.setHeadline((int) r0)
            r0 = 2131961774(0x7f1327ae, float:1.9560254E38)
            r1.setBody((int) r0)
            r0 = 2131237599(0x7f081adf, float:1.8091453E38)
            goto L_0x003d
        L_0x0135:
            java.util.HashMap r3 = A00(r7)
            java.lang.String r2 = "quick_promotion"
            X.0wc r1 = r0.A00
            java.lang.String r0 = "instagram_wellbeing_safety_check_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "evergreen_safety_check"
            X.DbS.A1M(r1, r0)
            java.lang.String r0 = "entrypoint"
            r1.AAJ(r0, r2)
            java.lang.String r0 = "extra_values"
            r1.A9H(r0, r3)
            java.lang.String r0 = "impression"
            X.DbV.A1G(r1, r0)
            r0 = 1762791563(0x6912108b, float:1.1036331E25)
            X.AnonymousClass0fD.A09(r0, r4)
            return r5
        L_0x015e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0163:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47449E2v.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
