package X;

import android.graphics.Rect;
import android.view.MotionEvent;

/* renamed from: X.8Gf  reason: invalid class name and case insensitive filesystem */
public final class C353088Gf implements C353078Ge {
    public final /* synthetic */ C352888Fl A00;

    public C353088Gf(C352888Fl r1) {
        this.A00 = r1;
    }

    public final boolean EsK(MotionEvent motionEvent) {
        JYD jyd;
        C3497981v r1;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        C352888Fl r12 = this.A00;
        C357638Yz r6 = r12.A0g;
        if (r6.A0V(C358088aL.A0T)) {
            if (!r12.A19.A00().AJY((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), r12.A1C.CQ0(AnonymousClass80V.LAYOUT_CAPTURE)) && (jyd = r12.A0C) != null) {
                Rect rect = new Rect();
                jyd.A0E.A0F.getHitRect(rect);
                if (rect.contains(rawX, rawY) || ((r1 = r12.A0C.A00) != null && r1.AJY(rawX, rawY, C61290mR.A07()))) {
                    return false;
                }
                return true;
            }
        } else if ((r6.A0R() || r12.A1T || r6.A0V(C358088aL.A0B, C358088aL.A0M) || C352888Fl.A0J(r12)) && r12.A0Y() && ((r12.A1V || r12.A0Z.A00().A05.A09 != null) && (motionEvent.getAction() != 0 || !r12.A19.A00().AJY((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), r12.A1C.CQ0(AnonymousClass80V.LAYOUT_CAPTURE))))) {
            return true;
        }
        return false;
    }
}
