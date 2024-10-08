package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.8D9  reason: invalid class name */
public final class AnonymousClass8D9 implements AnonymousClass88G {
    public int A00 = -1;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final AnonymousClass8BA A06;
    public final C310416b1 A07;
    public final InteractiveDrawableContainer A08;

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final /* synthetic */ void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    public final /* synthetic */ void DlC(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    public final /* synthetic */ void Dsb() {
    }

    public AnonymousClass8D9(Context context, UserSession userSession, AnonymousClass8BA r36, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = r36;
        InteractiveDrawableContainer interactiveDrawableContainer2 = interactiveDrawableContainer;
        this.A08 = interactiveDrawableContainer2;
        interactiveDrawableContainer2.A0y(this);
        this.A07 = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, true, false, true, true, false, false, false, true, true, true, true, true, false, false);
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.Aex, java.lang.Object] */
    public static void A00(AnonymousClass57C r15, C317876nz r16, AnonymousClass8D9 r17) {
        Drawable A012;
        C317876nz r5 = r16;
        C318046oG A002 = r5.A00();
        C318046oG r3 = C318046oG.I_TAKE_CARE_STICKER;
        AnonymousClass8D9 r4 = r17;
        if (A002 == r3) {
            C317966o8 r0 = (C317966o8) r5.A0O.get(0);
            Context context = r4.A04;
            String str = "";
            String str2 = r0.A0X;
            String str3 = r0.A0R;
            String str4 = r5.A0I;
            if (str4 != null) {
                str = str4;
            }
            ? obj = new Object();
            obj.A02 = str2;
            obj.A01 = str3;
            obj.A00 = str;
            obj.A03 = "";
            A012 = new C369728vE(context, obj);
            AnonymousClass8BA r02 = r4.A06;
            r02.A1s.A0y((AnonymousClass88G) r02.A1g.get());
        } else if (r5.A0Z.equals("election_add_yours_sticker_id")) {
            UserSession userSession = r4.A05;
            Context context2 = r4.A04;
            0qQ.A0B(userSession, 1);
            0qQ.A0B(context2, 2);
            StoryPromptTappableData storyPromptTappableData = r5.A01;
            if (storyPromptTappableData == null || (A012 = C394029xQ.A00(context2, storyPromptTappableData, userSession, "")) == null) {
                return;
            }
        } else {
            A012 = C347017w8.A01(r4.A04, r4.A05, r5);
        }
        if (r5.A00().equals(C318046oG.BLOKS)) {
            C310416b1 r1 = r4.A07;
            r1.A0P = true;
            Float f = r5.A0D;
            if (f != null) {
                r1.A01 = f.floatValue();
            }
            Float f2 = r5.A0C;
            if (f2 != null) {
                r1.A00 = f2.floatValue();
            }
        } else if (r5.A0Z.equals("election_add_yours_sticker_id")) {
            C310416b1 r12 = r4.A07;
            r12.A0P = true;
            r12.A01 = 0.25f;
            r12.A00 = 1.5f;
        }
        AnonymousClass8BA r03 = r4.A06;
        C310416b1 r11 = r4.A07;
        C314676if r13 = r03.A1g;
        AnonymousClass57C r9 = r15;
        int A0x = ((AnonymousClass8ME) r13.get()).A0x(A012, r9, (MusicOverlayStickerModel) null, r11, (Product) null, r5.A0Z, (String) null, (String) null, (String) null, r5.A01());
        if (r5.A00() == r3) {
            AnonymousClass8ME r14 = (AnonymousClass8ME) r13.get();
            if (A012 instanceof C369728vE) {
                AnonymousClass8ME.A0W(r14, (C369728vE) A012);
            }
        }
        r4.A00 = A0x;
        InteractiveDrawableContainer interactiveDrawableContainer = r4.A08;
        r4.A03 = interactiveDrawableContainer.A0S;
        interactiveDrawableContainer.A0S = true;
    }

    public final void A01(AnonymousClass57C r6, String str) {
        if (this.A00 == -1 && !this.A01) {
            UserSession userSession = this.A05;
            C317876nz r0 = (C317876nz) C310386ax.A00(userSession).A00.get(str);
            if (r0 != null) {
                A00(r6, r0, this);
            } else if (r6 == AnonymousClass57C.MAP_LOCATION_STICKER) {
                C385409it r3 = new C385409it(r6, this);
                0qQ.A0B(userSession, 0);
                1NY r2 = new 1NY(userSession, -2);
                r2.A05();
                r2.A0K("creatives/get_sticker/%s/", new Object[]{str});
                r2.A0Q(C384519hS.class, C39817AAo.class);
                r2.A9m("isLocationLocked", "true");
                1OC A0M = r2.A0M();
                A0M.A00 = r3;
                1ES.A03(A0M);
            } else {
                C379669Uv.A01(new C385419iu(r6, this), userSession, str);
            }
        }
    }

    public final void DdI(Drawable drawable, int i, boolean z) {
        if (i == this.A00) {
            this.A00 = -1;
            if (this.A02) {
                this.A08.A0S = this.A03;
            }
        }
    }
}
