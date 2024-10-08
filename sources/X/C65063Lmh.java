package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lmh  reason: case insensitive filesystem */
public final class C65063Lmh implements MXJ {
    public int A00;
    public int A01;
    public ViewFlipper A02;
    public C60715Jq4 A03;
    public final UserSession A04;
    public final C65155LoK A05;
    public final C64945Lkk A06 = new C64945Lkk(this);

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AQD(float f) {
    }

    public final void CN3(ViewGroup viewGroup) {
        Context A0C = JTP.A0C(viewGroup, 0);
        this.A02 = (ViewFlipper) LayoutInflater.from(A0C).inflate(R.layout.filter_view_flipper, viewGroup).requireViewById(R.id.filter_view_flipper);
        float f = RecyclerView.A1E;
        0qQ.A07(A0C);
        C60715Jq4 jq4 = new C60715Jq4(A0C);
        this.A03 = jq4;
        jq4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C60715Jq4 jq42 = this.A03;
        if (jq42 != null) {
            jq42.setClipChildren(false);
            if (this.A03 != null) {
                UserSession userSession = this.A04;
                C63124Krs.A00(userSession);
                C60715Jq4 jq43 = this.A03;
                if (jq43 != null) {
                    jq43.setBlurIconCache(C59953JcJ.A00(userSession));
                    C60715Jq4 jq44 = this.A03;
                    if (jq44 != null) {
                        jq44.A05 = true;
                        jq44.A06 = true;
                        jq44.A02 = this.A06;
                        C65155LoK loK = this.A05;
                        List list = loK.A01;
                        jq44.setEffects(list, false, userSession);
                        ViewFlipper viewFlipper = this.A02;
                        if (viewFlipper != null) {
                            C60715Jq4 jq45 = this.A03;
                            if (jq45 != null) {
                                viewFlipper.addView(jq45, 0);
                                ViewFlipper viewFlipper2 = this.A02;
                                if (viewFlipper2 != null) {
                                    viewFlipper2.setDisplayedChild(0);
                                    C60715Jq4 jq46 = this.A03;
                                    if (jq46 != null) {
                                        List tileFrames = jq46.getTileFrames();
                                        ArrayList A1C = AnonymousClass7TE.A1C();
                                        for (Object next : tileFrames) {
                                            if (C66568MWw.A00(((C60060Jeb) next).A05) != -1) {
                                                A1C.add(next);
                                            }
                                        }
                                        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                                        Iterator it = A1C.iterator();
                                        while (it.hasNext()) {
                                            C60060Jeb jeb = (C60060Jeb) it.next();
                                            C66568MWw.A03(jeb, jeb.A05, A0r);
                                        }
                                        C59953JcJ.A00(userSession).A07(A0C, A0r);
                                        int A0H = JTR.A0H(loK.A03);
                                        int A002 = C63126Kru.A00(list, A0H);
                                        if (A002 > 0) {
                                            27r A012 = 27p.A01(userSession);
                                            if (A012.A0J() != null) {
                                                A012.A1A(28t.A02, C59725JVj.POST_CAPTURE, A0H, A002);
                                            }
                                            this.A01 = A0H;
                                        }
                                        C60715Jq4 jq47 = this.A03;
                                        if (jq47 != null) {
                                            ViewTreeObserver viewTreeObserver = jq47.getViewTreeObserver();
                                            if (viewTreeObserver != null) {
                                                viewTreeObserver.addOnGlobalLayoutListener(new C64291LYr(this, A002, 2));
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F("viewContainer");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        0qQ.A0F("filterPicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CQZ() {
        return true;
    }

    public final boolean CQa() {
        return true;
    }

    public final void Cyg() {
        this.A01 = 0;
        this.A00 = 0;
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DG2(float f, float f2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void AJD() {
        this.A05.AJD();
    }

    public final List Bdz() {
        return AnonymousClass7TE.A1I(C62562Khs.DEFAULT);
    }

    public final void cancel() {
        Object obj;
        C66534MVo ArI;
        List list = this.A05.A01;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (((C66568MWw) obj).BEU() != this.A00);
        C66568MWw mWw = (C66568MWw) obj;
        if (!(mWw == null || (ArI = mWw.ArI()) == null)) {
            ArI.CuZ(false);
        }
        C60715Jq4 jq4 = this.A03;
        if (jq4 == null) {
            0qQ.A0F("filterPicker");
            throw AnonymousClass00P.createAndThrow();
        }
        int A002 = C63126Kru.A00(list, this.A01);
        C59917Jbg A003 = C59917Jbg.A00(this, 15);
        C252553pI r0 = jq4.A0D;
        View view = null;
        if (r0 == null || r0.A1D(A002) == null) {
            jq4.A0p(A002);
            jq4.A15(new C60470Jm2(jq4, A003, A002));
            return;
        }
        C66501MUf mUf = jq4.A02;
        if (mUf != null) {
            C252553pI r02 = jq4.A0D;
            if (r02 != null) {
                view = r02.A1D(A002);
            }
            0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame");
            mUf.Drd((C60060Jeb) view, false);
        }
        A003.invoke();
    }

    public C65063Lmh(UserSession userSession, C65155LoK loK) {
        this.A04 = userSession;
        this.A05 = loK;
    }
}
