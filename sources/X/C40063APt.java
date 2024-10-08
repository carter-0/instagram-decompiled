package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.APt  reason: case insensitive filesystem */
public final class C40063APt implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8ZV A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C40063APt(AnonymousClass8ZV r1, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = r1;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass9IV r11 = (AnonymousClass9IV) obj;
        0qQ.A0B(r11, 0);
        if (this.A01) {
            ((ClipsCreationDraftViewModel) this.A00.A0J.getValue()).A0B();
        } else if (!this.A02) {
            try {
                AGw aGw = AGw.A00;
                AnonymousClass8ZV r1 = this.A00;
                Context requireContext = r1.requireContext();
                UserSession A022 = r1.getSession();
                Bitmap bitmap = (Bitmap) r11.A01;
                ClipsCreationDraftViewModel clipsCreationDraftViewModel = (ClipsCreationDraftViewModel) r1.A0J.getValue();
                C2801950r r7 = C2801950r.CLIPS;
                C3499582p r0 = r1.A0A;
                if (r0 == null) {
                    0qQ.A0F("_cameraSession");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    AnonymousClass0fN.A00(aGw.A01(requireContext, bitmap, A022, clipsCreationDraftViewModel, r7, r0.A02.A01.A0i, new MMT(r1, 20)));
                }
            } catch (NullPointerException e) {
                0kD.A0I(AnonymousClass8ZV.__redex_internal_original_name, e, 0Yt.A0E());
            }
        }
    }
}
