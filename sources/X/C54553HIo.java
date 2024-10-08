package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;

/* renamed from: X.HIo  reason: case insensitive filesystem */
public final class C54553HIo extends C56604I4d {
    public static boolean A05;
    public static final C55227HeI A06 = new Object();
    public PromptSheetAIViewModel A00;
    public final C56506Hzc A01;
    public final C56086HsZ A02;
    public final Integer A03 = AnonymousClass05K.A0C;
    public final 0sP A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54553HIo(android.content.Context r4, X.C56086HsZ r5, X.0sP r6) {
        /*
            r3 = this;
            com.meta.foa.session.FoaUserSession r2 = r5.A00
            r3.<init>(r4, r2)
            r3.A02 = r5
            r3.A04 = r6
            X.Hsb r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3.A03 = r0
            X.Hsa r1 = r1.A01
            X.Hzc r0 = new X.Hzc
            r0.<init>(r2, r1)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54553HIo.<init>(android.content.Context, X.HsZ, X.0sP):void");
    }

    public final void A0J() {
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131966394);
        String A162 = AnonymousClass7TE.A16(context, 2131966392);
        String string = context.getString(2131966393);
        HNN hnn = HNN.A0G;
        Integer num = AnonymousClass05K.A01;
        HNN hnn2 = hnn;
        I1u i1u = new I1u(hnn, hnn2, HNO.A0W, string, num, A162, C59105J6n.A02(this, 36));
        Integer num2 = this.A03;
        A0G(new C56145HtX((Drawable) null, (2WX) null, (C56143HtV) null, i1u, A16, (CharSequence) null, AnonymousClass05K.A05, num2, C51970G9q.A0J(), true, true, true));
        C56506Hzc.A00(this.A01, (String) null, 16);
        C46626Di6 di6 = C46626Di6.WRAP_CONTENT_SHEET;
        CdsBottomSheetDimmingBehaviour.FixedAlpha fixedAlpha = new CdsBottomSheetDimmingBehaviour.FixedAlpha(0.5f);
        A0F(new I4X(fixedAlpha, di6, num2, num, C58566Itz.A00, 48, true), "PromptSheetActivity", C59105J6n.A02(this, 38));
    }
}
