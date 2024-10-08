package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage;

/* renamed from: X.Hvi  reason: case insensitive filesystem */
public abstract class C56274Hvi {
    public static final void A00(Bitmap bitmap, Fragment fragment, UserSession userSession, ImageUrl imageUrl, C352218Cl r12, String str, boolean z) {
        C352218Cl r0 = r12.A0M;
        if (r0 != null) {
            r12 = r0;
        }
        ContextualBackgroundSourceImage contextualBackgroundSourceImage = new ContextualBackgroundSourceImage(imageUrl, str, r12.A06());
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("ORIGINAL_IMAGE_DATA_ARG", contextualBackgroundSourceImage);
        A0a.putBoolean("IS_FOOTER_BELOW_MEDIA_ARG", z);
        C54143H0n h0n = new C54143H0n();
        h0n.setArguments(A0a);
        C58717IwQ iwQ = new C58717IwQ(3, fragment, userSession);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new C58678Ivn(new C58678Ivn(fragment, 9), 10));
        ((ContextualBackgroundViewModel) DbS.A0I(new C58678Ivn(A00, 11), iwQ, new C58717IwQ(2, (Object) null, A00), DbS.A0z(ContextualBackgroundViewModel.class)).getValue()).A06.Epw(bitmap);
        new 2YN(fragment).A00(C356988Vz.class).A02.A0B(new AnonymousClass88W(h0n));
    }

    public static final void A01(Fragment fragment, UserSession userSession, C62320sa r9) {
        1Av A00 = 1Au.A00(userSession);
        0s0 r0 = A00.A2C;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        if (AnonymousClass7TG.A1a(A00, r0, r3, 471)) {
            r9.invoke();
            return;
        }
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass7TF.A1J(A002, A002.A2C, r3, 471, true);
        FragmentActivity requireActivity = fragment.requireActivity();
        C58678Ivn ivn = new C58678Ivn(r9, 8);
        Bundle A0a = AnonymousClass7TE.A0a();
        C47507E5p e5p = new C47507E5p();
        C331127Pr A0V = DbV.A0V(A0a, e5p, userSession);
        A0V.A0g = requireActivity.getString(2131956706);
        A0V.A0K = new C56800ICx(ivn, 27);
        A0V.A1J = true;
        A0V.A0v = true;
        DbU.A0y(requireActivity, e5p, A0V);
    }
}
