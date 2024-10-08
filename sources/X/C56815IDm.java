package X;

import android.content.DialogInterface;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

/* renamed from: X.IDm  reason: case insensitive filesystem */
public final class C56815IDm implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C56815IDm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnTouchListener(new C56815IDm(obj, i));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        ViewParent parent;
        String str;
        List BPz;
        1Xj A0T;
        View A0A;
        View findViewWithTag;
        switch (this.A00) {
            case 0:
                C55864Hol hol = (C55864Hol) this.A01;
                0qQ.A0A(motionEvent);
                0qQ.A0B(motionEvent, 0);
                if (motionEvent.getPointerCount() >= 2) {
                    MediaFrameLayout mediaFrameLayout = hol.A03.A0F;
                    if (mediaFrameLayout.getParent() != null) {
                        mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                int actionMasked = motionEvent.getActionMasked();
                if ((actionMasked == 1 || actionMasked == 3) && (parent = hol.A03.A0F.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                hol.A06.A01(motionEvent);
                hol.A01.onTouchEvent(motionEvent);
                return true;
            case 1:
                return ((C57411IaH) this.A01).A02.DsV(motionEvent);
            case 6:
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                C54029GyE gyE = (C54029GyE) this.A01;
                Integer num = gyE.A06;
                if (num != null) {
                    int intValue = num.intValue();
                    C255773uh r0 = gyE.A04;
                    if (r0 != null) {
                        C270114gD r1 = r0.A0D;
                        17k.A07(r1, C273654mx.A00(21));
                        if (!(r1 == null || (BPz = r1.A00.BPz()) == null || (A0T = DbZ.A0T(BPz, intValue)) == null)) {
                            DialogInterface.OnDismissListener onDismissListener = gyE.A00;
                            if (onDismissListener == null) {
                                str = "listener";
                            } else {
                                XCI xci = gyE.A05;
                                if (xci == null) {
                                    str = "hideListener";
                                } else {
                                    0xG A0O = DbS.A0O("ig_threads_in_stories_unit");
                                    UserSession userSession = gyE.A03;
                                    if (userSession == null) {
                                        str = "userSession";
                                    } else {
                                        DialogInterface dialogInterface = gyE.A01;
                                        if (dialogInterface == null) {
                                            str = "emptyDialogInterface";
                                        } else {
                                            String id = A0T.getId();
                                            if (id != null) {
                                                HH3 hh3 = new HH3(1, onDismissListener, dialogInterface, xci);
                                                long A0I = AnonymousClass7TG.A0I();
                                                C71093OcF A012 = ORV.A01(gyE.getActivity(), A0O, userSession, C14068TpH.BCN_POST_TIFU, C16677UzD.MEDIA, id);
                                                C255773uh r02 = gyE.A04;
                                                if (r02 != null) {
                                                    A012.A01 = r02.A0i;
                                                    A012.A07(hh3);
                                                    A012.A08(AnonymousClass000.A00(3882), String.valueOf(A0I));
                                                    C71093OcF.A00((C331157Pu) null, A012);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                    str = "reelItem";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                gyE.A07();
                return true;
            case 7:
                view2 = ((HE4) this.A01).A00;
                break;
            case 8:
                view2 = ((C53130Gj2) this.A01).A00;
                break;
            case 9:
                0qQ.A0B(motionEvent, 1);
                view2 = (View) this.A01;
                break;
            case 10:
                0qQ.A0B(motionEvent, 1);
                view2 = ((C55877Hoy) this.A01).A09;
                break;
            case 11:
                if (motionEvent.getY() >= 0.0f) {
                    return false;
                }
                C57451Iav iav = (C57451Iav) this.A01;
                if (!iav.A01) {
                    return true;
                }
                iav.A00 = true;
                iav.A03.dismiss();
                return true;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass7TG.A1N(view, motionEvent);
                GCC gcc = (GCC) this.A01;
                C52012GBj gBj = gcc.A02;
                if (gBj != null && (A0A = gBj.A0A(gcc.A00)) != null && (findViewWithTag = A0A.findViewWithTag("clips_attached_scrubber_view_tag")) != null) {
                    return findViewWithTag.dispatchTouchEvent(motionEvent);
                }
                view.setVisibility(8);
                return false;
            default:
                0qQ.A0A(motionEvent);
                return ((C253873rY) this.A01).DF8(motionEvent);
        }
        0qQ.A0A(motionEvent);
        RectF rectF = 0nA.A01;
        0qQ.A0B(view2, 0);
        0qQ.A0B(motionEvent, 1);
        float f = 0.8f;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            f = 1.0f;
        }
        view2.setAlpha(f);
        return false;
    }
}
