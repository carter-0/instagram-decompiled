package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.JlZ  reason: case insensitive filesystem */
public final class C60441JlZ extends 2Rw implements C2366034j {
    public List A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final L2G A05;
    public final MU7 A06;
    public final String A07;

    public C60441JlZ(AnonymousClass0iw r2, UserSession userSession, L2G l2g, MU7 mu7, String str) {
        AnonymousClass7TG.A0w(1, userSession, mu7, l2g);
        this.A04 = userSession;
        this.A03 = r2;
        this.A06 = mu7;
        this.A05 = l2g;
        this.A07 = str;
    }

    public final int CMG(Reel reel) {
        0qQ.A0B(reel, 0);
        return this.A02.indexOf(reel);
    }

    public final int CMH(Reel reel, C255773uh r3) {
        0qQ.A0B(reel, 0);
        return this.A02.indexOf(reel);
    }

    public final void Ei9(List list, boolean z, UserSession userSession) {
        0qQ.A0B(list, 0);
        DbW.A0z(this, list, this.A02);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            return new C60644Jor(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.prompt_participant_grid_item, false));
        }
        if (i == 1) {
            IgTextView inflate = JTP.A0G(viewGroup).inflate(R.layout.prompt_sticker_viewer_disclaimer_text, viewGroup, false);
            0qQ.A0C(inflate, AnonymousClass000.A00(9));
            return new C60575Jnk(inflate);
        } else if (i != 2) {
            LayoutInflater A0G = JTP.A0G(viewGroup);
            if (i != 3) {
                return new C249703kE(DbT.A0D(A0G, viewGroup, R.layout.prompt_sticker_viewer_pagination_spinner, false));
            }
            View inflate2 = A0G.inflate(R.layout.music_pick_empty_aggregation_item, viewGroup, false);
            0qQ.A0C(inflate2, C66579MXk.A00(6));
            return new C60574Jnj(inflate2);
        } else {
            View inflate3 = JTP.A0G(viewGroup).inflate(R.layout.music_pick_aggregation_scroll_item, viewGroup, false);
            0qQ.A0C(inflate3, "null cannot be cast to non-null type android.widget.HorizontalScrollView");
            return new C60573Jni((HorizontalScrollView) inflate3);
        }
    }

    public final Object Bkf(int i) {
        return 00k.A0O(this.A02, i);
    }

    public final void onBindViewHolder(C249703kE r29, int i) {
        int i2 = i;
        C249703kE r10 = r29;
        0qQ.A0B(r10, 0);
        int i3 = 1;
        if (this.A00 == null) {
            i3 = 0;
        }
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 0) {
            MU7 mu7 = this.A06;
            Reel reel = (Reel) this.A02.get(i - i3);
            KwQ.A00(this.A03, this.A04, reel, mu7, (C60644Jor) r10, false);
        } else if (itemViewType == 1) {
            String str = this.A07;
            C60575Jnk jnk = (C60575Jnk) r10;
            0qQ.A0B(jnk, 1);
            if (str != null) {
                jnk.A00.setText(str);
            }
        } else if (itemViewType == 2) {
            List list = this.A00;
            if (list == null) {
                0qQ.A0F("aggregationItems");
            } else {
                C60573Jni jni = (C60573Jni) r10;
                L2G l2g = this.A05;
                0qQ.A0B(jni, 1);
                HorizontalScrollView horizontalScrollView = jni.A00;
                ViewGroup A0E = DbS.A0E(horizontalScrollView, R.id.music_aggregation_container);
                A0E.removeAllViews();
                int i4 = 0;
                for (Object next : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        0sr.A1T();
                    } else {
                        MWQ mwq = (MWQ) next;
                        Context context = horizontalScrollView.getContext();
                        0qQ.A07(context);
                        View inflate = View.inflate(context, R.layout.music_pick_aggregation_item, new LinearLayout(context));
                        0qQ.A0C(inflate, C66579MXk.A00(6));
                        ImageView A0G = DbS.A0G(inflate, R.id.album_art_container);
                        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.aggregation_title);
                        TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.aggregation_subtitle);
                        TextView A0d3 = AnonymousClass7TE.A0d(inflate, R.id.music_aggregation_count_label);
                        Context A0S = AnonymousClass7TE.A0S(inflate);
                        GIH gih = new GIH(A0S, (GJO) null, A0S.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height), DbY.A01(A0S), 0, 0, 0, -1, false);
                        C61119JxV jxV = (C61119JxV) mwq;
                        TrackData trackData = jxV.A01;
                        gih.A04(trackData.Arr());
                        A0G.setImageDrawable(gih);
                        String title = trackData.getTitle();
                        String str2 = "";
                        if (title == null) {
                            title = str2;
                        }
                        A0d.setText(title);
                        String displayArtist = trackData.getDisplayArtist();
                        if (displayArtist != null) {
                            str2 = displayArtist;
                        }
                        A0d2.setText(str2);
                        A0d3.setText(C253673rC.A03(AnonymousClass7TF.A0A(A0S), Integer.valueOf(jxV.A00)));
                        if (i4 != C51966G9m.A06(list)) {
                            inflate.setPadding(0, 0, C51972G9s.A08(A0S), 0);
                        }
                        LY7.A00(inflate, 39, l2g, mwq);
                        A0E.addView(inflate);
                        i4 = i5;
                    }
                }
                return;
            }
            throw AnonymousClass00P.createAndThrow();
        } else if (itemViewType == 3) {
            C60574Jnj jnj = (C60574Jnj) r10;
            0qQ.A0B(jnj, 0);
            ImageView A0J = DbX.A0J(jnj.A00, R.id.stack_album_drawable);
            DbU.A13(A0J.getContext(), A0J, R.drawable.music_pick_aggregation_empty_state);
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(994094444);
        List list = this.A02;
        int size = list.size();
        boolean z = true;
        int i = 1;
        if (this.A00 == null) {
            i = 0;
        }
        boolean A1b = AnonymousClass7TE.A1b(list);
        int i2 = size + i;
        if (!this.A01) {
            z = A1b;
        }
        int i3 = i2 + (z ? 1 : 0);
        AnonymousClass0fD.A0A(773636327, A032);
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r0.isEmpty() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = -1617509201(0xffffffff9f96c4af, float:-6.3852857E-20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.util.List r0 = r4.A00
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            if (r5 >= r1) goto L_0x0021
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.isEmpty()
            r2 = 3
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r2 = 2
        L_0x001a:
            r0 = -1666544054(0xffffffff9caa8e4a, float:-1.1286437E-21)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r2
        L_0x0021:
            java.util.List r0 = r4.A02
            int r0 = r0.size()
            int r0 = r0 + r1
            if (r5 >= r0) goto L_0x002c
            r2 = 0
            goto L_0x001a
        L_0x002c:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x001a
            r2 = 4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60441JlZ.getItemViewType(int):int");
    }
}
