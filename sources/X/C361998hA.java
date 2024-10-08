package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import java.util.List;

/* renamed from: X.8hA  reason: invalid class name and case insensitive filesystem */
public final class C361998hA implements C362008hB, C362018hC {
    public int A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public C252063oV A04;
    public C362048hG A05;
    public C362358hl A06;
    public Dc2 A07;
    public AnonymousClass6ST A08;
    public final Activity A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final AnonymousClass4DH A0C;
    public final AnonymousClass72N A0D;
    public final AnonymousClass0iw A0E;
    public final UserSession A0F;
    public final C357638Yz A0G;
    public final AnonymousClass8XA A0H;
    public final StoryDraftsCreationViewModel A0I;
    public final AnonymousClass8XC A0J;

    public C361998hA(Activity activity, ViewGroup viewGroup, AnonymousClass4DH r4, AnonymousClass72N r5, AnonymousClass0iw r6, UserSession userSession, C357638Yz r8, AnonymousClass8XA r9, StoryDraftsCreationViewModel storyDraftsCreationViewModel, AnonymousClass8XC r11) {
        int i;
        0qQ.A0B(viewGroup, 5);
        0qQ.A0B(r11, 6);
        this.A09 = activity;
        this.A0C = r4;
        this.A0F = userSession;
        this.A0E = r6;
        this.A0B = viewGroup;
        this.A0J = r11;
        this.A0D = r5;
        this.A0I = storyDraftsCreationViewModel;
        this.A0H = r9;
        this.A0G = r8;
        this.A0A = activity.getApplicationContext();
        List list = (List) r5.A01.A02();
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        this.A00 = i;
    }

    public final void A00(Bitmap bitmap, C369988ve r6, C352218Cl r7) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(bitmap, 1);
        C362048hG r3 = this.A05;
        if (r3 != null) {
            int i = r7.A07;
            if (!r3.A0D) {
                C362048hG.A07(bitmap, r3, i);
            }
            AnonymousClass8XA r1 = this.A0H;
            C362048hG r0 = this.A05;
            if (r0 != null) {
                r1.A0H(r0, r6, r7);
                return;
            }
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(Bitmap bitmap, C369988ve r6, C349307zv r7) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(bitmap, 1);
        C362048hG r1 = this.A05;
        if (r1 != null) {
            if (!r1.A0D) {
                C362048hG.A07(bitmap, r1, 0);
            }
            AnonymousClass8XA r12 = this.A0H;
            C362048hG r0 = this.A05;
            if (r0 != null) {
                r12.A0I(r0, r6, r7);
                return;
            }
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DSc(int i) {
        String str = "draftsDeleteButtonStubHolder";
        if (i > 0) {
            C252063oV r0 = this.A04;
            if (r0 != null) {
                View view = r0.getView();
                if (view.getVisibility() != 0) {
                    C294975nL A012 = C294975nL.A01(view, 0);
                    A012.A0G();
                    Context context = this.A0A;
                    0qQ.A06(context);
                    A012.A0T((float) 0nA.A05(context), 0.0f);
                    A012.A04 = 0;
                    A012.A0F(true).A0H();
                }
                IgTextView igTextView = this.A02;
                if (igTextView == null) {
                    str = "draftsDeleteButton";
                } else {
                    igTextView.setText(this.A0A.getString(2131974406, new Object[]{Integer.valueOf(i)}));
                    return;
                }
            }
        } else {
            C252063oV r1 = this.A04;
            if (r1 != null) {
                if (r1.CVM()) {
                    C294975nL A013 = C294975nL.A01(r1.getView(), 0);
                    A013.A0G();
                    Context context2 = this.A0A;
                    0qQ.A06(context2);
                    A013.A0K((float) 0nA.A05(context2));
                    A013.A03 = 8;
                    A013.A0F(true).A0H();
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.07Z, X.4DH] */
    public final void Dnm(Bitmap bitmap, String str) {
        0qQ.A0B(str, 1);
        C226292g8.A00(19B.A00, new AnonymousClass05E(new AnonymousClass9KZ(this.A0J, str, (AnonymousClass4D7) null, 8))).A06(this.A0C, new C362838iZ(new C377469Ly(49, (Object) this, (Object) bitmap)));
    }
}
