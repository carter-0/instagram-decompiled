package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* renamed from: X.Uid  reason: case insensitive filesystem */
public final class C15794Uid extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C313666go A03;
    public final K8J A04;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        View view;
        String A16;
        LiveUserPaySupportTier liveUserPaySupportTier;
        Drawable A0E;
        Drawable mutate;
        int i;
        C19274WSh wSh = (C19274WSh) r12;
        UEP uep = (UEP) r13;
        boolean A1Z = AnonymousClass7TG.A1Z(wSh, uep);
        Context context = this.A00;
        UserSession userSession = this.A02;
        C313666go r4 = this.A03;
        K8J k8j = this.A04;
        AnonymousClass0iw r7 = this.A01;
        0qQ.A0B(context, 0);
        C51974G9v.A0d(A1Z ? 1 : 0, userSession, r4, k8j, r7);
        ImageUrl imageUrl = wSh.A04;
        if (imageUrl == null) {
            DbU.A13(context, uep.A08, R.drawable.profile_anonymous_user);
        } else if (!C253833rU.A02(imageUrl)) {
            uep.A08.setUrl(imageUrl, r7);
        }
        C391379sn r72 = wSh.A06;
        if (r72 == C391379sn.ANSWERED || (i = wSh.A01) <= 0) {
            uep.A06.setVisibility(8);
        } else {
            TextView textView = uep.A06;
            textView.setText(DbY.A0d(context.getResources(), i, R.plurals.live_question_like_count));
            textView.setVisibility(0);
        }
        uep.A03.setVisibility(0);
        boolean z = wSh.A0A;
        TextView textView2 = uep.A07;
        if (z) {
            textView2.setVisibility(0);
            WBE.A00(textView2, 37, k8j, wSh);
        } else {
            textView2.setVisibility(8);
            textView2.setOnClickListener((View.OnClickListener) null);
        }
        if (wSh.A08) {
            TextView textView3 = uep.A05;
            textView3.setVisibility(0);
            AnonymousClass0fU.A00(new LY7(63, (Object) k8j, (Object) wSh), textView3);
        } else {
            TextView textView4 = uep.A05;
            textView4.setVisibility(8);
            textView4.setOnClickListener((View.OnClickListener) null);
        }
        if (wSh.A0C) {
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = uep.A09;
            igBouncyUfiButtonImageView.A05();
            igBouncyUfiButtonImageView.setSelected(wSh.A0B);
            boolean z2 = wSh.A09;
            View view2 = uep.A00;
            if (z2) {
                WB4.A00(view2, k8j, uep, wSh, 70);
            } else {
                view2.setVisibility(8);
                view2.setOnClickListener((View.OnClickListener) null);
                uep.A0A.A01((WeakReference) null);
            }
            view2.setVisibility(0);
        } else {
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView2 = uep.A09;
            igBouncyUfiButtonImageView2.A05();
            igBouncyUfiButtonImageView2.setVisibility(8);
            View view3 = uep.A00;
            view3.setVisibility(8);
            view3.setOnClickListener((View.OnClickListener) null);
            uep.A0A.A01((WeakReference) null);
        }
        if (r4 == C313666go.BROADCASTER && r72 == C391379sn.UNANSWERED && wSh.A01 > 0) {
            float f = wSh.A00;
            view = uep.A02;
            DbU.A11(context, view, R.drawable.question_list_item_background);
            View view4 = uep.A01;
            view4.setVisibility(0);
            0nA.A0U(view4, (int) ((1.0f - f) * ((float) (0nA.A09(context) - AnonymousClass7TG.A02(context)))));
        } else {
            view = uep.A02;
            C391379sn r1 = C391379sn.CURRENT;
            int i2 = R.drawable.question_list_item_background;
            if (r72 == r1) {
                i2 = R.drawable.question_list_item_selected_background;
            }
            DbU.A11(context, view, i2);
            uep.A01.setVisibility(8);
        }
        AnonymousClass3NG r42 = new AnonymousClass3NG(view);
        r42.A05 = AnonymousClass05K.A1F;
        r42.A04 = new C15845UjV(8, k8j, wSh);
        r42.A00();
        TextView textView5 = uep.A04;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = wSh.A05;
        if (user != null) {
            A16 = user.getUsername();
        } else {
            A16 = AnonymousClass7TE.A16(context, 2131965315);
        }
        SpannableStringBuilder append = spannableStringBuilder.append(A16);
        CharacterStyle characterStyle = new CharacterStyle();
        AnonymousClass0eM r0 = 0mp.A09;
        append.setSpan(characterStyle, 0, A16.length(), 33);
        if (user != null) {
            if (user.isVerified()) {
                C244273av.A08(context, spannableStringBuilder, A1Z);
            }
            C61052Jvq jvq = wSh.A03;
            if (!(jvq == null || (liveUserPaySupportTier = (LiveUserPaySupportTier) jvq.A01) == null)) {
                boolean A022 = 0mk.A02(context);
                if (A022) {
                    spannableStringBuilder.insert(0, " ");
                } else {
                    spannableStringBuilder.append(" ");
                }
                Integer A002 = LKL.A00(liveUserPaySupportTier, A1Z);
                if (!(A002 == null || (A0E = JTP.A0E(context, A002)) == null || (mutate = A0E.mutate()) == null)) {
                    Drawable mutate2 = mutate.mutate();
                    int i3 = 0;
                    if (mutate2 != null) {
                        AnonymousClass7TG.A13(mutate2);
                        C2606346l r14 = new C2606346l(mutate2);
                        if (A022) {
                            spannableStringBuilder.insert(0, " ");
                        } else {
                            i3 = spannableStringBuilder.length();
                            spannableStringBuilder.append(" ");
                        }
                        spannableStringBuilder.setSpan(r14, i3, i3 + 1, 33);
                    }
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        spannableStringBuilder.append("   ").append(wSh.A07);
        textView5.setText(spannableStringBuilder);
    }

    public final Class modelClass() {
        return C19274WSh.class;
    }

    public C15794Uid(Context context, AnonymousClass0iw r2, UserSession userSession, C313666go r4, K8J k8j) {
        C51972G9s.A1C(userSession, r4);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = k8j;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.layout_question_list_item, false);
        UEP uep = new UEP(A09);
        A09.setTag(uep);
        return uep;
    }
}
