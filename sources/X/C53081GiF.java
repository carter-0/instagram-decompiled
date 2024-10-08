package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GiF  reason: case insensitive filesystem */
public abstract class C53081GiF extends 2Rw implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "ClipsDraftsSeeAllAdapter";
    public int A00;
    public long A01;
    public Dc2 A02;
    public final Activity A03;
    public final Context A04;
    public final Fragment A05;
    public final C355638Qt A06 = new C355638Qt();
    public final UserSession A07;
    public final C387579mR A08;
    public final K57 A09;
    public final C55557Hjd A0A;
    public final List A0B = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final boolean A0F;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public /* synthetic */ C53081GiF(Activity activity, Context context, Fragment fragment, UserSession userSession, K57 k57, int i, int i2, boolean z) {
        C55557Hjd hjd = new C55557Hjd(userSession);
        this.A07 = userSession;
        this.A05 = fragment;
        this.A03 = activity;
        this.A04 = context;
        this.A09 = k57;
        this.A0F = z;
        this.A0A = hjd;
        this.A08 = new C387579mR(DbT.A05(activity), userSession, i, i2);
        this.A0E = C51970G9q.A0n(this, 20);
        this.A0C = C51970G9q.A0n(this, 18);
        this.A0D = C51970G9q.A0n(this, 19);
        this.A01 = -1;
        setHasStableIds(true);
    }

    public static final void A00(C369968vc r19, GO1 go1, C53081GiF giF) {
        boolean z;
        C369968vc r0 = r19;
        GO1 go12 = go1;
        C53081GiF giF2 = giF;
        if (go1 == null) {
            HWL.A00(giF2.A04, giF2.A07, AnonymousClass05K.A0j).A02(giF2.A09.getViewLifecycleOwner(), r0.A09, J6R.A00(giF2, r0, 12));
            return;
        }
        List list = go12.A00;
        if (list.isEmpty()) {
            K57 k57 = giF2.A09;
            0qQ.A0B(r0, 0);
            Bundle bundle = k57.mArguments;
            if (bundle == null || !bundle.getBoolean(AnonymousClass000.A00(2165), false)) {
                z = false;
            } else {
                z = G9t.A1b(k57.A0J);
            }
            if (k57.getActivity() != null && k57.mView != null) {
                ((AnonymousClass72N) k57.A0E.getValue()).A08.A0L();
                if (!182.A06(0Tu.A05, k57.A05(), 36325630798738533L)) {
                    K57.A01(k57);
                }
                27r A012 = 27p.A01(k57.A05());
                C59725JVj jVj = C59725JVj.PROFILE;
                28t r8 = 28t.A06;
                C2801950r r5 = r0.A04;
                C2801950r r4 = C2801950r.FEED_POST;
                C279294yP r7 = C279294yP.CLIPS;
                if (k57.A03) {
                    A012.A0A.A0a(r7, r8, jVj, (AnonymousClass80P) null, (PromptStickerModel) null, AnonymousClass7TF.A1W(r5, r4), false);
                }
                C394779yg.A00(k57.A05()).A01(C390939s5.EDITED_SAVED_DRAFT);
                Bundle bundle2 = k57.mArguments;
                if (bundle2 == null || !bundle2.getBoolean(AnonymousClass000.A00(1113))) {
                    FragmentActivity requireActivity = k57.requireActivity();
                    UserSession A052 = k57.A05();
                    String str = r0.A09;
                    C243473Yx.A04(requireActivity, k57, A052, k57.A01, str, "draft_list_item_tap", true, false);
                    return;
                }
                UserSession A053 = k57.A05();
                0qQ.A0B(A053, 0);
                Class<C357458Xy> cls = C357458Xy.class;
                if (A053.A00(cls) == null) {
                    UserSession A054 = k57.A05();
                    Object obj = new Object();
                    0qQ.A0B(A054, 0);
                    A054.A04(cls, obj);
                }
                2YL A0H = DbS.A0H(k57.A0D);
                LO6 lo6 = new LO6(k57.requireActivity(), AnonymousClass07i.A00(k57.requireActivity()), k57.A05());
                J73 j73 = new J73(21, k57, z);
                AnonymousClass7TE.A1Z(new MHF(lo6, j73, r0, A0H, (AnonymousClass4D7) null, 2), C318116oQ.A00(A0H));
                return;
            }
            return;
        }
        AnonymousClass8A2 A013 = AnonymousClass8A1.A01(giF2.A07);
        A013.A0K.A09(A013.A01, AnonymousClass000.A00(820), go12.toString());
        boolean z2 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C61081JwJ) it.next()).A00 == AnonymousClass05K.A0Y) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        C56718I8y i8y = new C56718I8y(11, (Object) r0, (Object) giF2);
        1xC r2 = 1xC.A01;
        int i = 2131961031;
        if (z2) {
            i = 2131961032;
        }
        r2.A00(new AnonymousClass3GS(new LAQ(new C63772L6e(i8y, C358278ae.DEFAULT, 2131961029), (C63772L6e) null, (C63772L6e) null, AnonymousClass7TE.A0v(), (CharSequence) null, 2131954752, i)));
    }

    public static final void A01(C293505kq r5, AnonymousClass3Q2 r6, C53081GiF giF) {
        ((LD5) giF.A0E.getValue()).A00((Date) null, new MMH(giF, 21), new C59104J6m(47, (Object) r6, (Object) r5, (Object) giF), giF.A0F);
    }

    public static final void A02(C53151GjN gjN, C53081GiF giF) {
        TextView textView;
        Context context;
        int A082;
        GO1 go1 = gjN.A01;
        boolean z = false;
        if (go1 == null || go1.A00.isEmpty()) {
            z = true;
        }
        ImageView imageView = gjN.A04;
        if (z) {
            imageView.setVisibility(8);
            gjN.A03.setImageAlpha(255);
            textView = gjN.A07;
            context = giF.A04;
            A082 = R.color.capture_textview_text_color;
        } else {
            imageView.setVisibility(0);
            gjN.A03.setImageAlpha(178);
            textView = gjN.A07;
            context = giF.A04;
            A082 = 2Yu.A08(context);
        }
        DbT.A17(context, textView, A082);
    }

    public int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1956811432);
        int size = this.A0B.size();
        AnonymousClass0fD.A0A(245140325, A032);
        return size;
    }

    public long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(1034515672);
        long A002 = this.A06.A00(((C369968vc) this.A0B.get(i)).A09);
        AnonymousClass0fD.A0A(1962209947, A032);
        return A002;
    }
}
