package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.List;

public final class KHT extends IgLinearLayout {
    public View A00;
    public RecyclerView A01;
    public L93 A02;
    public View A03;
    public Reel A04;
    public final C60130JgB A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final C60416Jl9 A08;
    public final L4K A09;
    public final Reel A0A;

    public static final void A00(KHT kht) {
        String str;
        RecyclerView recyclerView = kht.A01;
        if (recyclerView == null) {
            str = "highlightSuggestionsRecyclerView";
        } else {
            View view = kht.A00;
            if (view == null) {
                str = "addHighlightView";
            } else {
                Reel reel = kht.A0A;
                Reel reel2 = kht.A04;
                L10 l10 = new L10(kht);
                View A0b = AnonymousClass7TE.A0b(view, R.id.highlight_row_icon);
                View A0b2 = AnonymousClass7TE.A0b(view, R.id.highlight_row_title);
                View A0b3 = AnonymousClass7TE.A0b(view, R.id.selected_highlight);
                TextView A0B = DbW.A0B(view, R.id.selected_highlight_title);
                View A0b4 = AnonymousClass7TE.A0b(view, R.id.unselect_highlight);
                IgdsSwitch igdsSwitch = (IgdsSwitch) AnonymousClass7TE.A0b(view, R.id.unselect_highlight_toggle);
                View A0b5 = AnonymousClass7TE.A0b(view, R.id.highlight_row_chevron);
                if (reel2 == null) {
                    if (reel != null) {
                        reel2 = reel;
                    } else {
                        A0b2.setVisibility(0);
                        Dba.A0y(A0b3, recyclerView, A0b, 8, 0);
                        DbX.A1C(A0b2, C51972G9s.A08(view.getContext()), A0b2.getPaddingTop());
                        A0b5.setVisibility(0);
                        LYB.A00(view, 54, l10);
                        2eS.A01(view);
                        return;
                    }
                }
                A0b2.setVisibility(8);
                A0b3.setVisibility(0);
                A0B.setText(reel2.A0r);
                JTT.A14(A0b, A0b5, recyclerView, 8);
                view.setOnClickListener((View.OnClickListener) null);
                if (reel == null) {
                    LYB.A00(A0b4, 53, l10);
                    A0b4.setVisibility(0);
                    igdsSwitch.setVisibility(8);
                    return;
                }
                igdsSwitch.setVisibility(0);
                A0b4.setVisibility(8);
                igdsSwitch.setChecked(true);
                igdsSwitch.A07 = new C65370LsB(1, l10, reel2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(String str, ArrayList arrayList) {
        Reel reel;
        String str2;
        if (str != null) {
            reel = Dba.A0L(this.A07, str);
        } else {
            reel = null;
        }
        this.A04 = reel;
        C65208LpE lpE = this.A09.A01;
        27p.A01(lpE.A03).A1X(lpE.A01);
        KOE koe = lpE.A05;
        String str3 = null;
        if (reel != null) {
            str2 = reel.getId();
        } else {
            str2 = null;
        }
        if (arrayList != null) {
            str3 = (String) arrayList.get(0);
        }
        koe.A09(C61075JwD.A00(new AnonymousClass9J6(str3, str2, 11), (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, koe.A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -1, 262135, false, false, false, false, false, false, false, false, false, false, false, false, false));
        if (this.A0A == null) {
            A00(this);
        }
    }

    public final L93 getHighlightSuggestionsViewController() {
        return this.A02;
    }

    public final Reel getLinkedHighlight() {
        return this.A04;
    }

    public KHT(Context context, C60130JgB jgB, AnonymousClass4DH r5, AnonymousClass0iw r6, UserSession userSession, L4K l4k, Reel reel) {
        super(context);
        this.A09 = l4k;
        this.A07 = userSession;
        this.A06 = r5;
        this.A05 = jgB;
        this.A0A = reel;
        this.A08 = new C60416Jl9(r6, l4k, new C66200MIh(this, 24));
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1162655981);
        super.onAttachedToWindow();
        if (this.A03 == null) {
            View inflate = DbV.A0D(this).inflate(R.layout.layout_add_highlight_row, this, false);
            this.A00 = DbY.A0F(inflate, R.id.add_highlight_stub);
            RecyclerView A0I = DbT.A0I(DbY.A0F(inflate, R.id.add_highlight_suggestions_stub), R.id.highlight_suggestions_recyclerview);
            this.A01 = A0I;
            if (A0I != null) {
                C60416Jl9 jl9 = this.A08;
                A0I.setAdapter(jl9);
                RecyclerView recyclerView = this.A01;
                if (recyclerView != null) {
                    DbV.A1A(recyclerView.getContext(), A0I);
                    if (A0I.A12.size() == 0) {
                        AnonymousClass4DH r4 = this.A06;
                        JTP.A1D(A0I, AnonymousClass7TG.A02(r4.requireContext()), DbY.A01(r4.requireContext()));
                    }
                    if (this.A0A == null) {
                        UserSession userSession = this.A07;
                        L93 l93 = new L93(this.A05, this.A06, userSession, jl9, new L11(this));
                        this.A02 = l93;
                        C60130JgB jgB = l93.A00;
                        jgB.A02.A00(l93.A01.requireContext(), jgB.A01, C318466oz.A00, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, l93.A02.A06, false);
                    }
                    A00(this);
                    addView(inflate);
                    this.A03 = inflate;
                }
            }
            0qQ.A0F("highlightSuggestionsRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0D(-1438485210, A062);
    }

    public final void setHighlightSuggestionsViewController(L93 l93) {
        this.A02 = l93;
    }

    public final void setLinkedHighlight(Reel reel) {
        this.A04 = reel;
    }
}
