package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcelable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Llp  reason: case insensitive filesystem */
public final class C65012Llp implements MV4, AnonymousClass81E, C352908Fn {
    public int A00;
    public C347087wF A01;
    public final Activity A02;
    public final Context A03;
    public final GridLayoutManager A04;
    public final C355568Qm A05;
    public final UserSession A06;
    public final C71662eb A07;
    public final AnonymousClass8W6 A08;
    public final C3499582p A09;
    public final AnonymousClass8AL A0A;
    public final C59943Jc9 A0B;
    public final C60440JlY A0C;
    public final AnonymousClass80U A0D;
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(new MM9(this, 46));
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(new MM9(this, 47));
    public final AnonymousClass4D6 A0G;
    public final TargetViewSizeProvider A0H;
    public final C3493580b A0I;
    public final C3493580b A0J;

    public C65012Llp(Activity activity, Context context, UserSession userSession, AnonymousClass4D6 r13, C71662eb r14, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8W6 r16, C3499582p r17, AnonymousClass8AL r18, AnonymousClass80U r19) {
        AnonymousClass80U r4 = r19;
        0qQ.A0B(r4, 4);
        C3499582p r2 = r17;
        AnonymousClass8AL r1 = r18;
        C51974G9v.A1N(r2, r1, r13);
        AnonymousClass8W6 r3 = r16;
        AnonymousClass7TF.A1G(r3, 8, r14);
        this.A03 = context;
        this.A02 = activity;
        this.A06 = userSession;
        this.A0D = r4;
        this.A09 = r2;
        this.A0A = r1;
        this.A0G = r13;
        this.A08 = r3;
        this.A07 = r14;
        this.A0H = targetViewSizeProvider;
        AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        float width = (float) r12.getWidth();
        float height = (float) r12.getHeight();
        C59966Jcb jcb = new C59966Jcb(this, 1);
        this.A0J = jcb;
        C59966Jcb jcb2 = new C59966Jcb(this, 0);
        this.A0I = jcb2;
        C60440JlY jlY = new C60440JlY((C355608Qq) null, this, (int) width, (int) height);
        this.A0C = jlY;
        this.A0B = new C59943Jc9(context, width, height);
        this.A01 = C347087wF.A0I;
        r4.A7z(jcb);
        r4.A7w(jcb2);
        this.A04 = new GridLayoutManager(context, this.A01.A00);
        this.A05 = new C355568Qm(new C59942Jc6(jlY));
        r14.A02 = new C64885Ljl(this, 3);
    }

    public static final void A00(C65012Llp llp) {
        AnonymousClass7TE.A1U(llp.A07.A01(), true);
        AnonymousClass0eM r1 = llp.A0F;
        if (((Dialog) r1.getValue()).isShowing()) {
            AnonymousClass7TF.A1N(r1);
        }
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final C340297l2 Ajh() {
        return null;
    }

    public final boolean CRJ() {
        return true;
    }

    public final boolean CRZ() {
        return true;
    }

    public final boolean CeF() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.8kQ, X.11X] */
    public static final void A01(C65012Llp llp) {
        C65012Llp llp2 = llp;
        C71662eb r3 = llp2.A07;
        Bitmap createBitmap = Bitmap.createBitmap(r3.A01().getWidth(), r3.A01().getHeight(), Bitmap.Config.ARGB_8888);
        r3.A01().draw(JTO.A0B(createBitmap));
        0qQ.A07(createBitmap);
        ArrayList arrayList = llp2.A0C.A05;
        ArrayList A0p = AnonymousClass7TF.A0p(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0p.add(((C63810L7q) it.next()).A03);
        }
        int i = 0;
        if (!(A0p instanceof Collection) || !A0p.isEmpty()) {
            Iterator it2 = A0p.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (JTO.A0W(it2).A0G.A0B) {
                        i = 54;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
        Iterator it3 = A0p.iterator();
        while (it3.hasNext()) {
            A0p2.add(JTO.A0W(it3).A0G);
        }
        MediaUploadMetadata A002 = AnonymousClass3QN.A00(A0p2);
        AnonymousClass4D6 r32 = llp2.A0G;
        UserSession userSession = llp2.A06;
        UserSession userSession2 = userSession;
        r32.schedule(new C363838kQ(llp2.A03, createBitmap, (Bitmap) null, (Bitmap) null, (Rect) null, (C363848kR) null, (C363858kS) null, (C363858kS) null, (ImmutableList) null, (CameraAREffect) null, A002, userSession2, llp2.A0H, llp2, (AnonymousClass8GK) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, "unknown", "layout", (String) null, llp2.A01.A05, (List) null, (byte[]) null, (byte[]) null, i, true, false, false));
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public final void DC8() {
        ((MultiTouchRecyclerView) this.A07.A01()).A00 = false;
    }

    public final void DWx(String str) {
        11Z.A02(new C65867M2i(this));
    }

    public final void DWy(C352218Cl r2) {
        11Z.A02(new C41034AnI(this, r2));
    }

    public final void DmR(C249703kE r3) {
        ((MultiTouchRecyclerView) this.A07.A01()).A00 = true;
        this.A05.A07(r3);
    }
}
