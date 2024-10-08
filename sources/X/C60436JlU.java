package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JlU  reason: case insensitive filesystem */
public final class C60436JlU extends 2Rw {
    public int A00;
    public int A01;
    public int A02;
    public C63610Kzy A03;
    public C63611Kzz A04;
    public boolean A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final boolean A07;

    public final void onBindViewHolder(C249703kE r9, int i) {
        C66539MVt A002;
        PhotoSession A032;
        0qQ.A0B(r9, 0);
        if (r9 instanceof C60511Jmi) {
            Object obj = this.A06.get(i);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.album.listview.AlbumListContentType.ViewData");
            MediaSession mediaSession = ((C61710KJa) obj).A00;
            C60511Jmi jmi = (C60511Jmi) r9;
            Integer Bsu = mediaSession.Bsu();
            Integer num = AnonymousClass05K.A01;
            C63610Kzy kzy = this.A03;
            if (Bsu == num) {
                if (kzy != null) {
                    View A0F = JTO.A0F(r9);
                    KB5 kb5 = kzy.A00;
                    AnonymousClass3Q2 A0N = JTQ.A0N(mediaSession, kb5.A0X);
                    if (A0N == null) {
                        0kD.A01("AlbumRenderViewController", 002.A0u("pendingMedia is null and path for media type video mediasession, ", mediaSession.B5g(), "pendingMediakey value ", mediaSession.BbR()));
                        A002 = null;
                    } else {
                        A002 = KB5.A01(A0F, kb5, mediaSession, A0N);
                    }
                }
                0qQ.A0F("renderControllerProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            if (kzy != null) {
                View A0F2 = JTO.A0F(r9);
                KB5 kb52 = kzy.A00;
                A002 = KB5.A00(A0F2, kb52, mediaSession);
                if (2Ht.A02(kb52.A0P) && (A032 = kb52.A0S.A03(mediaSession.B5g())) != null) {
                    KB5.A0F(kb52, kb52.A0D, A032, false);
                }
            }
            0qQ.A0F("renderControllerProvider");
            throw AnonymousClass00P.createAndThrow();
            jmi.A00 = A002;
            if (this.A07) {
                View A0G = AnonymousClass7TF.A0G(r9.itemView, R.id.filter_delete_view);
                int i2 = 8;
                LYA.A01(A0G, Bsu, r9, this, 8);
                if (this.A01 > 2) {
                    i2 = 0;
                }
                A0G.setVisibility(i2);
            }
            C66539MVt mVt = jmi.A00;
            if (mVt != null) {
                mVt.Ee2();
                mVt.Cn5();
            }
            LY8.A00(r9.itemView, 37, mediaSession, this);
            r9.itemView.setOnLongClickListener(new LYV(0, r9, this));
            return;
        }
        LY8.A00(r9.itemView, 38, r9, this);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A0C = JTP.A0C(viewGroup, 0);
        if (i != 2) {
            View A0A = DbU.A0A(LayoutInflater.from(A0C), viewGroup, R.layout.album_preview_view, false);
            View A0G = AnonymousClass7TF.A0G(A0A, R.id.album_filter_view_container);
            A0G.getLayoutParams().width = this.A02;
            A0G.getLayoutParams().height = this.A00;
            return new C249703kE(A0A);
        }
        LinearLayout linearLayout = new LinearLayout(A0C);
        JTP.A14(linearLayout, -2, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(LayoutInflater.from(A0C).inflate(R.layout.album_add_item_view, viewGroup, false));
        return new C249703kE(linearLayout);
    }

    public final void onViewRecycled(C249703kE r2) {
        C66539MVt mVt;
        0qQ.A0B(r2, 0);
        if ((r2 instanceof C60511Jmi) && (mVt = ((C60511Jmi) r2).A00) != null) {
            mVt.cleanup();
        }
    }

    public static final void A00(C60436JlU jlU, List list) {
        int i;
        if (!jlU.A05) {
            boolean z = 00k.A0L(list) instanceof C61711KJb;
            ArrayList arrayList = list;
            if (z) {
                ArrayList A0U = 00k.A0U(list);
                A0U.remove(A0U.size() - 1);
                arrayList = A0U;
            }
            DbW.A0z(jlU, arrayList, jlU.A06);
            i = arrayList.size();
        } else if (!(00k.A0L(list) instanceof C61711KJb)) {
            jlU.A01 = list.size();
            ArrayList A1D = AnonymousClass7TE.A1D(list);
            A1D.add(C61711KJb.A00);
            DbW.A0z(jlU, A1D, jlU.A06);
            return;
        } else {
            DbW.A0z(jlU, list, jlU.A06);
            i = C51966G9m.A06(list);
        }
        jlU.A01 = i;
    }

    public C60436JlU(boolean z) {
        this.A07 = z;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1816689628);
        int size = this.A06.size();
        AnonymousClass0fD.A0A(-1557754336, A032);
        return size;
    }

    public final long getItemId(int i) {
        long hashCode;
        int A032 = AnonymousClass0fD.A03(-32473002);
        List list = this.A06;
        if (list.get(i) instanceof C61711KJb) {
            hashCode = 2;
        } else {
            Object obj = list.get(i);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.album.listview.AlbumListContentType.ViewData");
            hashCode = (long) ((C61710KJa) obj).A00.hashCode();
        }
        AnonymousClass0fD.A0A(1956033892, A032);
        return hashCode;
    }

    public final int getItemViewType(int i) {
        int A1W;
        int A032 = AnonymousClass0fD.A03(-1669056644);
        List list = this.A06;
        if (list.get(i) instanceof C61711KJb) {
            A1W = 2;
        } else {
            Object obj = list.get(i);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.album.listview.AlbumListContentType.ViewData");
            A1W = AnonymousClass7TF.A1W(((C61710KJa) obj).A00.Bsu(), AnonymousClass05K.A01);
        }
        AnonymousClass0fD.A0A(2042577146, A032);
        return A1W;
    }
}
