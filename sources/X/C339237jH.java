package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.7jH  reason: invalid class name and case insensitive filesystem */
public final class C339237jH extends 2Rw {
    public List A00;
    public final UserSession A01;
    public final C61300mW A02 = new C61300mW(new Handler(Looper.getMainLooper()), new C339247jI(this));
    public final 0sL A03;
    public final Map A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C339237jH(UserSession userSession, List list, Map map, 0sL r7, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(map, 3);
        this.A01 = userSession;
        this.A00 = list;
        this.A04 = map;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A03 = r7;
    }

    public final void onBindViewHolder(C249703kE r5, int i) {
        0qQ.A0B(r5, 0);
        C339807kC r3 = (C339807kC) r5;
        C339087j2 r1 = (C339087j2) this.A00.get(i);
        UserSession userSession = this.A01;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r1, 1);
        r1.A00(userSession, r3);
        View view = r3.A04;
        AnonymousClass3NG r12 = new AnonymousClass3NG(view);
        r12.A04 = new C339827kE(r5, this);
        r12.A07 = true;
        r12.A05 = AnonymousClass05K.A01;
        r12.A00();
        AnonymousClass5Gt r0 = (AnonymousClass5Gt) this.A04.get(((C339087j2) this.A00.get(i)).A00);
        if (r0 != null) {
            view.postDelayed(new C41145Ap5(r5, this, r0), 500);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        double d;
        0qQ.A0B(viewGroup, 0);
        boolean z = this.A07;
        Context context = viewGroup.getContext();
        if (z) {
            0qQ.A07(context);
            View inflate = LayoutInflater.from(context).inflate(R.layout.gallery_destination_item_short, viewGroup, false);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            0qQ.A0A(inflate);
            return new C339807kC(inflate, dimensionPixelSize);
        }
        0qQ.A07(context);
        boolean z2 = this.A06;
        boolean z3 = this.A05;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.gallery_destination_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
        0qQ.A07(layoutParams);
        if (z2) {
            if (z3) {
                d = 3.75d;
            } else {
                d = 3.5d;
            }
            layoutParams.width = (int) ((((double) AnonymousClass0nB.A01(context)) - (Math.ceil(d) * ((double) context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material)))) / d);
        }
        if (z3) {
            Resources resources = context.getResources();
            if (resources != null) {
                layoutParams.height = resources.getDimensionPixelOffset(R.dimen.direct_standard_xma_grid_view_height);
            }
            Resources resources2 = context.getResources();
            if (resources2 != null) {
                int dimensionPixelOffset = resources2.getDimensionPixelOffset(R.dimen.achievements_only_you_top_margin);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = dimensionPixelOffset;
                marginLayoutParams.bottomMargin = dimensionPixelOffset;
            }
        }
        inflate2.setLayoutParams(layoutParams);
        return new C339807kC(inflate2, 0);
    }

    public final void onViewRecycled(C249703kE r6) {
        TextView textView;
        ViewGroup viewGroup;
        0qQ.A0B(r6, 0);
        C339807kC r62 = (C339807kC) r6;
        0qQ.A0B(r62, 0);
        C339917kN r0 = r62.A00;
        if (r0 != null) {
            ((Animator) r0.A0C.getValue()).cancel();
        }
        r62.A00 = null;
        View view = r62.A04;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.setClipChildren(true);
            viewGroup.setClipToPadding(true);
            viewGroup.setTranslationZ(0.0f);
        }
        IgSimpleImageView igSimpleImageView = r62.A07;
        igSimpleImageView.setScaleType(r62.A05);
        igSimpleImageView.getLayoutParams().width = r62.A02;
        IgTextView igTextView = r62.A08;
        ViewGroup.LayoutParams layoutParams = igTextView.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = -2;
        layoutParams.height = -2;
        igTextView.setLayoutParams(layoutParams);
        igTextView.setTextSize(0, r62.A01);
        C252063oV r1 = r62.A09;
        if (r1.CVM() && (textView = (TextView) r1.getView()) != null) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            0qQ.A0C(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            textView.setLayoutParams(layoutParams2);
            textView.setTextSize(2, 8.0f);
            textView.setBackgroundResource(R.drawable.badge_background_round_rect);
        }
    }

    public final void A00(List list) {
        this.A00 = list;
        notifyDataSetChanged();
        for (Object next : this.A00) {
            if (((C339087j2) next).A00 == C339057iz.ASSET_HUB) {
                if (next != null) {
                    27r A012 = 27p.A01(this.A01);
                    AnonymousClass80P r4 = AnonymousClass80P.MEME_HUB;
                    0wc r2 = A012.A01;
                    0Aj A002 = r2.A00(r2.A00, "ig_camera_gallery_tool_impression");
                    if (A002.isSampled()) {
                        A002.A8k("event_type", 1);
                        A002.A8k("entity_type", 3);
                        AnonymousClass283 r3 = A012.A04;
                        A002.A8M(r3.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        A002.A8M(A012.A0J(), "camera_destination");
                        A002.AAJ("camera_session_id", r3.A0L);
                        A002.A8M(r4, "camera_tool");
                        A002.A8M(C59725JVj.PRE_CAPTURE, "surface");
                        A002.AAJ("module", 27x.A08.getModuleName());
                        A002.AAJ("composition_str_id", r3.A0M);
                        A002.A8M(r3.A0A, "composition_media_type");
                        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                        A002.Cgf();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1521989261);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1625506641, A032);
        return size;
    }
}
