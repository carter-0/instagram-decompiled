package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Kag  reason: case insensitive filesystem */
public final class C62130Kag extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "NudityDetectionSettingsFragment";
    public C70888OQg A00;
    public AnonymousClass630 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131968689);
    }

    public final String getModuleName() {
        return "nudity_detection_settings";
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.OQg, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass630 r1 = new AnonymousClass630(AnonymousClass7TE.A0l(this.A02));
        this.A01 = r1;
        this.A00 = new Object();
        LZJ.A01(this, A1C, 17, 2131968689, r1.A02.A01(1));
        Context requireContext = requireContext();
        String A16 = AnonymousClass7TE.A16(requireContext, 2131964884);
        String A0T = 002.A0T(requireContext.getString(2131968690), A16, ' ');
        C62146Kaz kaz = new C62146Kaz(this, DbV.A02(requireContext));
        SpannableStringBuilder A0C = DbS.A0C(A0T);
        AnonymousClass7AV.A04(A0C, kaz, A16);
        FGF fgf = new FGF(A0C);
        fgf.A01 = R.style.PrivacyTextStyle;
        A1C.add(fgf);
        setItems(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1757973307);
        super.onDestroy();
        AnonymousClass630 r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("manager");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00.A01();
        AnonymousClass0fD.A09(-1166531287, A022);
    }
}
