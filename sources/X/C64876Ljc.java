package X;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ljc  reason: case insensitive filesystem */
public final class C64876Ljc implements C252213ok, C3493580b {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final UserSession A04;
    public final IgEditText A05;
    public final AnonymousClass3E6 A06;
    public final TargetViewSizeProvider A07;
    public final AnonymousClass9YP A08;
    public final C358548b5 A09;
    public final AnonymousClass80U A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C66300MMj.A00(this, 14);
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final RecyclerView A0I;
    public final RecyclerView A0J;
    public final AnonymousClass0eM A0K;

    public C64876Ljc(Context context, View view, Fragment fragment, AnonymousClass07Z r21, AnonymousClass07i r22, AnonymousClass0iw r23, UserSession userSession, AnonymousClass3E6 r25, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass80U r27) {
        Context context2 = context;
        AnonymousClass07i r1 = r22;
        DbW.A1O(context2, 1, r1);
        this.A00 = context2;
        UserSession userSession2 = userSession;
        this.A04 = userSession2;
        this.A06 = r25;
        this.A07 = targetViewSizeProvider;
        AnonymousClass80U r16 = r27;
        this.A0A = r16;
        View view2 = view;
        C41567AwZ awZ = new C41567AwZ(14, r1, this, view2);
        C66300MMj mMj = new C66300MMj(fragment, 22);
        0eO r14 = 0eO.A02;
        AnonymousClass0eM A012 = C66300MMj.A01(mMj, r14, 23);
        this.A0K = DbS.A0I(new C66300MMj(A012, 24), awZ, new MJ9(13, (Object) null, A012), DbS.A0z(C60319JjN.class));
        View A0F2 = DbY.A0F(view2, R.id.story_caption_editor_stub);
        0qQ.A07(A0F2);
        this.A02 = A0F2;
        this.A01 = AnonymousClass7TF.A0G(A0F2, R.id.story_caption_editor_footer);
        View requireViewById = A0F2.requireViewById(R.id.story_caption_edit_text);
        IgEditText igEditText = (IgEditText) requireViewById;
        igEditText.setSingleLine(true);
        igEditText.setHorizontallyScrolling(false);
        igEditText.setMaxLines(10);
        LYN.A00(igEditText, 2, this);
        0qQ.A07(requireViewById);
        this.A05 = igEditText;
        View requireViewById2 = A0F2.requireViewById(R.id.story_caption_editor_done_button);
        0qQ.A0A(requireViewById2);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(requireViewById2);
        A0m.A06 = false;
        C61685KHt.A00(A0m, this, 15);
        0qQ.A07(requireViewById2);
        this.A03 = requireViewById2;
        AnonymousClass0eM A002 = C66300MMj.A00(this, 19);
        this.A0H = A002;
        View requireViewById3 = AnonymousClass7TE.A0c(A002).requireViewById(R.id.mention_tagging_recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById3;
        Context context3 = A0F2.getContext();
        DbV.A1A(context3, recyclerView);
        0qQ.A07(requireViewById3);
        this.A0J = recyclerView;
        C358548b5 r7 = new C358548b5(r23, userSession2, new C65021Lly(this, 0), (C337257fy) null);
        this.A09 = r7;
        AnonymousClass0eM A003 = C66300MMj.A00(this, 17);
        this.A0F = A003;
        View requireViewById4 = AnonymousClass7TE.A0c(A003).requireViewById(R.id.hashtag_suggestions_recycler_view);
        RecyclerView recyclerView2 = (RecyclerView) requireViewById4;
        DbV.A1A(context3, recyclerView2);
        JTP.A1D(recyclerView2, 0, AnonymousClass7TG.A07(recyclerView2.getContext()));
        0qQ.A07(requireViewById4);
        this.A0I = recyclerView2;
        AnonymousClass9YP r12 = new AnonymousClass9YP(userSession2, new C65003Llg(this));
        this.A08 = r12;
        this.A0E = C66300MMj.A01(this, r14, 16);
        this.A0B = C66300MMj.A01(this, r14, 13);
        this.A0D = C66300MMj.A00(view2, 15);
        this.A0G = C66300MMj.A00(view2, 18);
        r16.A7w(this);
        recyclerView.setAdapter(r7);
        recyclerView2.setAdapter(r12);
        LWP.A00(igEditText, this, 3);
        View requireViewById5 = A0F2.requireViewById(R.id.story_caption_editor_clear_button);
        0qQ.A0A(requireViewById5);
        AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(requireViewById5);
        A0m2.A06 = false;
        C61685KHt.A00(A0m2, this, 14);
        07U r72 = 07U.A05;
        AnonymousClass07Z r5 = r21;
        AnonymousClass7TE.A1Z(new MH4(r72, this, r5, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(r5));
        JTS.A11(r5, new C66163MGa(this, (AnonymousClass4D7) null, 19), A00(this).A06);
    }

    public static final C60319JjN A00(C64876Ljc ljc) {
        return (C60319JjN) ljc.A0K.getValue();
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        if (obj3 instanceof AnonymousClass8SD) {
            C60319JjN A002 = A00(this);
            if (!((C61051Jvp) A002.A07.getValue()).A06) {
                C60319JjN.A02(C61743KKi.A00, A002);
            }
        }
    }

    public final void DMr(int i, boolean z) {
        Object value;
        C60319JjN A002 = A00(this);
        int i2 = i;
        if (i <= 0) {
            05G r1 = A002.A07;
            if (((C61051Jvp) r1.getValue()).A0B && !((C61051Jvp) r1.getValue()).A06) {
                C60319JjN.A02(C61743KKi.A00, A002);
            }
        }
        05G r2 = A002.A07;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C61051Jvp.A01((Spannable) null, (C61051Jvp) value, (List) null, (List) null, (Set) null, i2, 16349, false, AnonymousClass7TF.A1R(i), false, false)));
    }
}
