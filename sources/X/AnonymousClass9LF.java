package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9LF  reason: invalid class name */
public final class AnonymousClass9LF extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LF(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass36M r2 = (AnonymousClass36M) this.A01;
                return new C385689jN(r2.A02.requireActivity(), r2.A04);
            case 2:
                return ((C62320sa) this.A01).invoke();
            case 3:
                return ((AnonymousClass07g) ((AnonymousClass0eM) this.A01).getValue()).getViewModelStore();
            case 4:
                return LJr.A01(((C311296cS) this.A01).A07, (C358118aO) null);
            case 5:
                ((AnonymousClass6Z5) this.A01).A17.EIJ();
                break;
            case 6:
                ((C309656Zc) this.A01).A0B.EHd();
                break;
            case 7:
                return 00k.A0k(00l.A0R(00p.A0g(182.A04(0Tu.A05, ((C313106fs) this.A01).A00, 36886270060528318L), " ", "", false), new String[]{","}, 0));
            case 8:
                UserSession userSession = ((AnonymousClass6ZN) this.A01).A01;
                if (userSession != null) {
                    return Boolean.valueOf(182.A06(0Tu.A05, userSession, 36322340853786706L));
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            case 9:
                Object systemService = ((C315506k0) this.A01).A05.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                0qQ.A0C(systemService, AnonymousClass000.A00(4));
                return systemService;
            case 10:
                C313516gZ r0 = (C313516gZ) this.A01;
                return new OTK(r0.A01, r0.A02);
            case 11:
                Context context = (Context) this.A01;
                boolean A02 = 0mk.A02(context);
                int i = R.drawable.instagram_chevron_right_pano_outline_12;
                if (A02) {
                    i = R.drawable.instagram_chevron_left_outline_12;
                }
                Drawable drawable = context.getDrawable(i);
                0qQ.A0A(drawable);
                Drawable mutate = drawable.mutate();
                mutate.setColorFilter(context.getColor(R.color.canvas_bottom_sheet_description_text_color), PorterDuff.Mode.SRC_IN);
                return mutate;
            default:
                return this.A01;
        }
        return C60340gF.A00;
    }
}
