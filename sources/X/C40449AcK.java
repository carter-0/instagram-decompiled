package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AcK  reason: case insensitive filesystem */
public final class C40449AcK implements MV8 {
    public final /* synthetic */ MagicMediaRemixEditController A00;

    public final /* synthetic */ void CnJ() {
    }

    public final void Dio(int i) {
    }

    public C40449AcK(MagicMediaRemixEditController magicMediaRemixEditController) {
        this.A00 = magicMediaRemixEditController;
    }

    public final AnonymousClass8XO B8p() {
        return AnonymousClass8XO.STATIC_PHOTO_ONLY;
    }

    public final void Dkp(Medium medium, String str) {
        Object obj;
        Drawable r16;
        MagicMediaRemixEditController magicMediaRemixEditController = this.A00;
        AnonymousClass80D r1 = magicMediaRemixEditController.A0D;
        AnonymousClass80D r32 = r1;
        if (r1.A27 != null) {
            AnonymousClass2t9 r15 = magicMediaRemixEditController.A07;
            AnonymousClass2tH r31 = r15.A04;
            Object obj2 = r31.Au8().get(magicMediaRemixEditController.A00);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixMediaSelectorItemViewModel");
            AYO ayo = (AYO) obj2;
            AnonymousClass8BA r13 = magicMediaRemixEditController.A0C;
            InteractiveDrawableContainer interactiveDrawableContainer = r13.A1s;
            List interactiveDrawables = interactiveDrawableContainer.getInteractiveDrawables();
            0qQ.A07(interactiveDrawables);
            Iterator it = interactiveDrawables.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(AnonymousClass7TF.A0h(((C378669Qs) ((B2K) obj)).A0B), ayo.A01)) {
                    break;
                }
            }
            B2K b2k = (B2K) obj;
            if (b2k != null) {
                Drawable drawable = ((C378669Qs) b2k).A0B;
                if (drawable instanceof C41834B2p) {
                    Object C3s = b2k.C3s();
                    0qQ.A0C(C3s, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.DrawableConfig");
                    C310416b1 r10 = (C310416b1) C3s;
                    interactiveDrawableContainer.A0S(drawable);
                    Medium medium2 = medium;
                    if (drawable instanceof C389549po) {
                        Context context = magicMediaRemixEditController.A04;
                        C389549po r12 = (C389549po) drawable;
                        int i = r12.A07;
                        int i2 = r12.A06;
                        double d = r12.A04;
                        double d2 = r12.A05;
                        int i3 = i;
                        int i4 = i2;
                        Context context2 = context;
                        Medium medium3 = medium2;
                        double d3 = d;
                        double d4 = d2;
                        r16 = new C389549po(context2, medium3, d3, d4, r12.A03, r12.A01, r12.A02, i3, i4);
                    } else {
                        double intrinsicWidth = (double) drawable.getIntrinsicWidth();
                        double intrinsicHeight = (double) drawable.getIntrinsicHeight();
                        Bitmap A002 = C64176LSd.A00(medium2, intrinsicWidth / intrinsicHeight);
                        C317876nz r2 = C317876nz.A0a;
                        double d5 = intrinsicWidth;
                        C317876nz A02 = C317886o0.A02(A002, d5, intrinsicHeight, intrinsicWidth / ((double) magicMediaRemixEditController.A02));
                        UserSession userSession = magicMediaRemixEditController.A08;
                        Context context3 = magicMediaRemixEditController.A04;
                        String A003 = C273654mx.A00(151);
                        C318046oG A004 = A02.A00();
                        C41834B2p b2p = (C41834B2p) drawable;
                        Context context4 = context3;
                        UserSession userSession2 = userSession;
                        C317876nz r20 = A02;
                        r16 = new C387239lt(context4, new C369768vI(context3, A02.A00, userSession, (C317966o8) AnonymousClass7TE.A13(A02.A0O), A004, A02.A06, A003), userSession2, r20, b2p.Bsj(), b2p.Bsk(), b2p.Bsi(), b2p.Bsg(), b2p.Bsh());
                    }
                    r13.A0g(r16, r10);
                    String A0h = AnonymousClass7TF.A0h(r16);
                    C39757A7x a7x = magicMediaRemixEditController.A0F;
                    String A0R = 002.A0R(medium2.A0X, r32.A2X);
                    0qQ.A0B(A0R, 0);
                    a7x.A04.put(A0R, A0h);
                    int i5 = magicMediaRemixEditController.A00;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    Object obj3 = r31.Au8().get(i5);
                    0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixMediaSelectorItemViewModel");
                    AYO ayo2 = (AYO) obj3;
                    if (decodeFile != null) {
                        ayo2.A00 = decodeFile;
                    }
                    if (A0h != null) {
                        ayo2.A01 = A0h;
                    }
                    r15.notifyItemChanged(i5);
                }
            }
        }
    }
}
