package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Meq  reason: case insensitive filesystem */
public final class C66907Meq extends C52050GCw {
    public FrameLayout A00;
    public FrameLayout A01;
    public IgTextView A02;
    public OZT A03;
    public GME A04;
    public boolean A05;
    public List A06;
    public final Activity A07;
    public final ClipsReplyBarData A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;

    public static final void A00(C66907Meq meq) {
        C254743sy r7;
        int i;
        ClipsReplyBarData clipsReplyBarData = meq.A08;
        if (clipsReplyBarData != null) {
            r7 = AnonymousClass6W3.A06(DbS.A0c(clipsReplyBarData.A02));
            if (r7 == null) {
                return;
            }
        } else {
            r7 = null;
        }
        OAW oaw = new OAW(meq);
        UserSession userSession = meq.A0A;
        FrameLayout frameLayout = meq.A01;
        if (frameLayout != null) {
            Context A0S = AnonymousClass7TE.A0S(frameLayout);
            int i2 = 0;
            if (clipsReplyBarData != null) {
                i = clipsReplyBarData.A01;
                i2 = clipsReplyBarData.A00;
            } else {
                i = 0;
            }
            FrameLayout frameLayout2 = meq.A01;
            if (frameLayout2 != null) {
                IgTextView igTextView = meq.A02;
                if (igTextView != null) {
                    FrameLayout frameLayout3 = meq.A00;
                    if (frameLayout3 != null) {
                        meq.A03 = new OZT(A0S, frameLayout2, frameLayout3, meq.A09, userSession, igTextView, r7, oaw, meq.A06, i, i2);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final boolean A0C(List list, boolean z) {
        FrameLayout frameLayout;
        if (C328447Ev.A05(this.A0A)) {
            this.A06 = list;
        }
        boolean z2 = this.A05;
        if (z) {
            if (!z2) {
                return false;
            }
        } else if (!z2) {
            A00(this);
            OZT ozt = this.A03;
            if (ozt != null) {
                C71091OcD ocD = ozt.A02;
                if (ocD != null) {
                    frameLayout = ocD.A0D;
                } else {
                    frameLayout = null;
                }
                FrameLayout frameLayout2 = ozt.A07;
                frameLayout2.addView(frameLayout);
                OZT.A00(frameLayout2, ozt, AnonymousClass7TG.A03(ozt.A06));
                OZT.A01(ozt);
            }
            FrameLayout frameLayout3 = this.A01;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            IgTextView igTextView = this.A02;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            FrameLayout frameLayout4 = this.A00;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(0);
            }
            this.A05 = true;
            return true;
        }
        OZT ozt2 = this.A03;
        if (ozt2 != null) {
            FrameLayout frameLayout5 = ozt2.A07;
            C294975nL A0A2 = JTP.A0c(frameLayout5, 0).A0A();
            A0A2.A0U(1.0f, 0.0f, (float) frameLayout5.getMeasuredWidth());
            A0A2.A0V(1.0f, 0.0f, (float) frameLayout5.getMeasuredHeight());
            A0A2.A0M(1.0f, 0.0f);
            A0A2.A06 = new PQS(ozt2, 1);
            A0A2.A05 = new PQI(ozt2, 3);
            A0A2.A0H();
        }
        this.A05 = false;
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (view != null) {
            View A0F = DbY.A0F(view, R.id.clips_emoji_reaction_bar_stub);
            if (A0F != null) {
                this.A01 = (FrameLayout) A0F.requireViewById(R.id.emoji_reaction_container);
                this.A02 = DbT.A0a(A0F, R.id.emoji_reaction_bar_title);
                this.A00 = (FrameLayout) A0F.requireViewById(R.id.emoji_reaction_bar);
            }
            ClipsReplyBarData clipsReplyBarData = this.A08;
            IgTextView igTextView = this.A02;
            if (clipsReplyBarData != null) {
                if (igTextView != null) {
                    igTextView.setVisibility(0);
                }
                IgTextView igTextView2 = this.A02;
                if (igTextView2 != null) {
                    Resources resources = this.A07.getResources();
                    String str = clipsReplyBarData.A0C;
                    if (str == null) {
                        str = clipsReplyBarData.A09;
                    }
                    DbY.A0y(resources, igTextView2, str, 2131955710);
                }
            } else if (igTextView != null) {
                igTextView.setVisibility(8);
            }
            FrameLayout frameLayout = this.A01;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.A00;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
    }

    public C66907Meq(Activity activity, ClipsReplyBarData clipsReplyBarData, AnonymousClass0iw r3, UserSession userSession) {
        C51974G9v.A1M(userSession, r3, activity);
        this.A08 = clipsReplyBarData;
        this.A0A = userSession;
        this.A09 = r3;
        this.A07 = activity;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A06 = null;
    }
}
