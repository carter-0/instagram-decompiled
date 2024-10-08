package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.JkY  reason: case insensitive filesystem */
public final class C60379JkY extends C322136vJ {
    public MusicBrowseCategory A00;
    public final Context A01;
    public final AnonymousClass07Z A02;
    public final MusicProduct A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final MXU A06;
    public final LFN A07;
    public final C60329JjY A08;
    public final C229122ms A09;
    public final boolean A0A;
    public final C355638Qt A0B = new C355638Qt();
    public final boolean A0C;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.3ot] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60379JkY(Context context, AnonymousClass07Z r5, MusicProduct musicProduct, AnonymousClass0iw r7, UserSession userSession, MusicBrowseCategory musicBrowseCategory, MXU mxu, LFN lfn, C60329JjY jjY, C229122ms r13, boolean z) {
        super((C252303ot) new Object());
        C51973G9u.A0r(2, userSession, r13, musicBrowseCategory);
        0qQ.A0B(jjY, 7);
        this.A01 = context;
        this.A05 = userSession;
        this.A04 = r7;
        this.A09 = r13;
        this.A00 = musicBrowseCategory;
        this.A03 = musicProduct;
        this.A08 = jjY;
        this.A07 = lfn;
        this.A06 = mxu;
        this.A02 = r5;
        this.A0C = z;
        this.A0A = 182.A06(0Tu.A05, userSession, 36312621342917832L);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE r4;
        String str;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        int i2 = i;
        switch (i) {
            case 0:
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View A002 = A00(R.layout.music_search_row_track, viewGroup2);
                UserSession userSession = this.A05;
                MXU mxu = this.A06;
                boolean z = this.A0A;
                MusicProduct musicProduct = this.A03;
                MusicBrowseCategory musicBrowseCategory = this.A00;
                String str2 = musicBrowseCategory.A06;
                if (str2 == null) {
                    str2 = musicBrowseCategory.A00();
                }
                if (0qQ.A0K(str2, "trending")) {
                    str = "2282005535164995";
                } else {
                    str = this.A00.A04;
                    if (str == null) {
                        str = "";
                    }
                }
                MusicBrowseCategory musicBrowseCategory2 = this.A00;
                String str3 = musicBrowseCategory2.A06;
                if (str3 == null) {
                    str3 = musicBrowseCategory2.A00();
                }
                if (0qQ.A0K(str3, "trending")) {
                    str3 = "For you";
                }
                C60329JjY jjY = this.A08;
                r4 = new KVM(A002, this.A02, musicProduct, userSession, this.A07, mxu, jjY, str, str3, z);
                break;
            case 1:
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVE(A00(R.layout.music_search_row_grouping, viewGroup2), this.A05, this.A06);
                break;
            case 2:
                int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVD(A00(R.layout.music_search_row_grouping, viewGroup2), this.A05, this.A06);
                break;
            case 3:
                int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KV9(LoadMoreButton.A00(this.A01, R.layout.music_search_row_empty_state, viewGroup2));
                break;
            case 5:
                int i7 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVB(A00(R.layout.music_search_row_search_keyword, viewGroup2), this.A06);
                break;
            case 6:
                int i8 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new C249703kE(A00(R.layout.music_search_row_section_gap, viewGroup2));
                break;
            case 7:
            case 9:
                int i9 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View A003 = A00(R.layout.music_search_row_preview, viewGroup2);
                UserSession userSession2 = this.A05;
                MXU mxu2 = this.A06;
                boolean z2 = this.A0A;
                MusicProduct musicProduct2 = this.A03;
                1Av A004 = 1Au.A00(userSession2);
                C60329JjY jjY2 = this.A08;
                r4 = new KVN(A003, this.A02, musicProduct2, userSession2, this.A07, mxu2, jjY2, A004, z2);
                break;
            case 8:
                int i10 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVF(A00(R.layout.music_search_row_grouping, viewGroup2), this.A05, this.A06);
                break;
            case 10:
                int i11 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVH(A00(R.layout.music_search_row_artist_item, viewGroup2), this.A06);
                break;
            case 11:
                int i12 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVA(A00(R.layout.row_search_for_x, viewGroup2));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                int i13 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVG(A00(R.layout.music_search_row_header, viewGroup2));
                break;
            case 13:
                int i14 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new C249703kE(A00(R.layout.music_search_mix_nux, viewGroup2));
                break;
            case 14:
                int i15 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View A005 = A00(R.layout.music_playlist_spotlight_banner, viewGroup2);
                MXU mxu3 = this.A06;
                r4 = new KVJ(A005, this.A05, this.A07, mxu3);
                break;
            case 15:
                int i16 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View A006 = A00(R.layout.music_search_row_preview, viewGroup2);
                UserSession userSession3 = this.A05;
                MXU mxu4 = this.A06;
                boolean z3 = this.A0A;
                MusicProduct musicProduct3 = this.A03;
                1Av A007 = 1Au.A00(userSession3);
                C60329JjY jjY3 = this.A08;
                r4 = new KVL(A006, this.A02, musicProduct3, userSession3, this.A07, mxu4, jjY3, A007, z3);
                break;
            case 16:
                int i17 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                r4 = new KVI(A00(R.layout.music_search_row_collection_header, viewGroup2), this.A04, this.A05);
                break;
            default:
                throw AnonymousClass7TE.A1B(002.A0O(C273654mx.A00(28), i2));
        }
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r4 < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(X.C249703kE r12) {
        /*
            r11 = this;
            r9 = 0
            X.0qQ.A0B(r12, r9)
            int r2 = r12.getBindingAdapterPosition()
            if (r2 < 0) goto L_0x0083
            int r0 = r11.getItemCount()
            int r0 = r0 + -1
            if (r2 > r0) goto L_0x0083
            java.lang.Object r1 = r11.getItem(r2)
            boolean r0 = r1 instanceof X.KV3
            if (r0 == 0) goto L_0x0083
            X.KV3 r1 = (X.KV3) r1
            if (r1 == 0) goto L_0x0083
            X.JZC r3 = r1.A00
            if (r3 == 0) goto L_0x0083
            X.MWx r1 = r3.A00()
            if (r1 == 0) goto L_0x007a
            com.instagram.music.common.model.MusicBrowseCategory r4 = r11.A00
            java.lang.String r0 = r4.A06
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = r4.A00()
        L_0x0032:
            java.lang.String r4 = "trending"
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0087
            java.lang.String r6 = "2282005535164995"
        L_0x003c:
            com.instagram.music.common.model.MusicBrowseCategory r0 = r11.A00
            java.lang.String r7 = r0.A06
            if (r7 != 0) goto L_0x0046
            java.lang.String r7 = r0.A00()
        L_0x0046:
            boolean r0 = X.0qQ.A0K(r7, r4)
            if (r0 == 0) goto L_0x004e
            java.lang.String r7 = "For you"
        L_0x004e:
            X.2re r0 = r11.mDiffer
            java.util.List r0 = r0.A02
            X.0qQ.A07(r0)
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L_0x005a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r5.next()
            boolean r0 = r0 instanceof X.KV3
            if (r0 == 0) goto L_0x0084
            if (r4 >= r9) goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            int r10 = r2 - r4
            r5 = 0
            java.lang.String r8 = "full_list"
            X.L9s r4 = new X.L9s
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.MXU r0 = r11.A06
            r0.Dt1(r1, r4)
        L_0x007a:
            com.instagram.music.common.model.MusicSearchArtist r1 = r3.A0B
            if (r1 == 0) goto L_0x0083
            X.MXU r0 = r11.A06
            r0.Dhd(r1, r2)
        L_0x0083:
            return
        L_0x0084:
            int r4 = r4 + 1
            goto L_0x005a
        L_0x0087:
            com.instagram.music.common.model.MusicBrowseCategory r0 = r11.A00
            java.lang.String r6 = r0.A04
            if (r6 != 0) goto L_0x003c
            java.lang.String r6 = ""
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60379JkY.onViewAttachedToWindow(X.3kE):void");
    }

    private final View A00(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        boolean z = this.A0C;
        Context context = this.A01;
        if (z) {
            from = JTS.A09(context, LayoutInflater.from(context));
        } else {
            from = LayoutInflater.from(context);
        }
        return DbT.A0D(from, viewGroup, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c1, code lost:
        if (X.182.A06(X.DbS.A0J(r3, 0), r3, 36326300814554811L) != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c3, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ce, code lost:
        if (X.AnonymousClass30D.A03(r15.A05) != false) goto L_0x01c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r16, int r17) {
        /*
            r15 = this;
            r9 = r16
            X.Jmp r9 = (X.C60518Jmp) r9
            r4 = 0
            X.0qQ.A0B(r9, r4)
            r3 = r17
            java.lang.Object r1 = r15.getItem(r3)
            X.L25 r1 = (X.L25) r1
            boolean r0 = r1 instanceof X.KV1
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x004e
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            X.MWx r11 = r0.A00()
            if (r11 == 0) goto L_0x015c
            com.instagram.api.schemas.TrackMetadata r10 = r0.A0A
            if (r10 != 0) goto L_0x0026
            com.instagram.api.schemas.TrackMetadata r10 = r0.A09
        L_0x0026:
            boolean r0 = r11 instanceof X.JVX
            if (r0 == 0) goto L_0x002f
            r0 = r11
            X.JVX r0 = (X.JVX) r0
            r0.A00 = r10
        L_0x002f:
            X.KVM r9 = (X.KVM) r9
            X.LFN r0 = r15.A07
            X.2xy r1 = r0.A05
            com.instagram.music.common.model.MusicDataSource r0 = r11.BUq()
            java.lang.Integer r12 = r1.C9D(r0)
            com.instagram.music.common.model.MusicBrowseCategory r0 = r15.A00
            com.instagram.music.common.model.MusicSearchPlaylistType r1 = r0.A01
            com.instagram.music.common.model.MusicSearchPlaylistType r0 = com.instagram.music.common.model.MusicSearchPlaylistType.NUMBERED
            boolean r14 = X.AnonymousClass7TF.A1W(r1, r0)
            r13 = 0
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r9.A00(r10, r11, r12, r13, r14)
        L_0x004d:
            return
        L_0x004e:
            boolean r0 = r1 instanceof X.C62001KUy
            if (r0 == 0) goto L_0x005c
            X.KVE r9 = (X.KVE) r9
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            r9.A00(r0)
            return
        L_0x005c:
            boolean r0 = r1 instanceof X.C62000KUx
            if (r0 == 0) goto L_0x006a
            X.KVD r9 = (X.KVD) r9
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            r9.A00(r0)
            return
        L_0x006a:
            boolean r0 = r1 instanceof X.KV2
            if (r0 == 0) goto L_0x0096
            X.KV3 r1 = (X.KV3) r1
            X.JZC r3 = r1.A00
            com.instagram.music.common.model.MusicSearchPlaylist r7 = r3.A0E
            if (r7 == 0) goto L_0x01d8
            X.KVN r9 = (X.KVN) r9
            X.2re r0 = r15.mDiffer
            java.util.List r0 = r0.A02
            X.0qQ.A07(r0)
            java.util.Iterator r1 = r0.iterator()
            r8 = 0
        L_0x0084:
            boolean r0 = r1.hasNext()
            r6 = -1
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.KV3
            if (r0 != 0) goto L_0x0162
            int r8 = r8 + 1
            goto L_0x0084
        L_0x0096:
            boolean r0 = r1 instanceof X.C62002KUz
            if (r0 == 0) goto L_0x00a8
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            com.instagram.music.common.model.MusicSearchPlaylist r0 = r0.A0E
            if (r0 == 0) goto L_0x01dd
            X.KVF r9 = (X.KVF) r9
            r9.A00(r0)
            return
        L_0x00a8:
            boolean r0 = r1 instanceof X.KV0
            if (r0 == 0) goto L_0x00c0
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            com.instagram.music.common.model.MusicSearchPlaylist r1 = r0.A0E
            if (r1 == 0) goto L_0x01e2
            X.KVJ r9 = (X.KVJ) r9
            com.instagram.common.session.UserSession r0 = r15.A05
            boolean r0 = X.AnonymousClass30D.A03(r0)
            r9.A00(r1, r0)
            return
        L_0x00c0:
            boolean r0 = r1 instanceof X.C61998KUv
            if (r0 == 0) goto L_0x00d3
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            X.LuH r1 = r0.A0C
            if (r1 == 0) goto L_0x01e7
            X.KVN r9 = (X.KVN) r9
            r0 = 0
            r9.A02(r0, r1, r4, r4)
            return
        L_0x00d3:
            boolean r0 = r1 instanceof X.C61999KUw
            if (r0 == 0) goto L_0x00e5
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            X.Kod r0 = r0.A0D
            if (r0 == 0) goto L_0x01ec
            X.KVI r9 = (X.KVI) r9
            r9.A00(r0)
            return
        L_0x00e5:
            boolean r0 = r1 instanceof X.C61997KUu
            if (r0 == 0) goto L_0x00f7
            X.KVH r9 = (X.KVH) r9
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            com.instagram.music.common.model.MusicSearchArtist r0 = r0.A0B
            if (r0 == 0) goto L_0x01f1
            r9.A00(r0, r3)
            return
        L_0x00f7:
            boolean r0 = r1 instanceof X.C61993KUq
            if (r0 == 0) goto L_0x0109
            X.KV9 r9 = (X.KV9) r9
            X.2ms r2 = r15.A09
            X.0qQ.A0B(r2, r4)
            com.instagram.ui.widget.loadmore.LoadMoreButton r1 = r9.A00
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x0109:
            boolean r0 = r1 instanceof X.C61996KUt
            if (r0 == 0) goto L_0x0125
            X.KVB r9 = (X.KVB) r9
            X.KUt r1 = (X.C61996KUt) r1
            java.lang.String r3 = r1.A00
            android.widget.TextView r0 = r9.A00
            r0.setText(r3)
            android.view.View r2 = r9.itemView
            r1 = 13
            X.LXK r0 = new X.LXK
            r0.<init>(r3, r9, r1)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x0125:
            boolean r0 = r1 instanceof X.C61994KUr
            if (r0 == 0) goto L_0x014e
            android.view.View r0 = r9.itemView
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.view.View r0 = r9.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            if (r2 == r0) goto L_0x004d
            android.view.View r0 = r9.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.height = r2
            android.view.View r0 = r9.itemView
            r0.setLayoutParams(r1)
            return
        L_0x014e:
            boolean r0 = r1 instanceof X.C61995KUs
            if (r0 == 0) goto L_0x004d
            X.KVG r9 = (X.KVG) r9
            X.KUs r1 = (X.C61995KUs) r1
            X.N4R r0 = r1.A00
            r9.A00(r0)
            return
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0161:
            r8 = -1
        L_0x0162:
            X.2re r0 = r15.mDiffer
            java.util.List r0 = r0.A02
            X.0qQ.A07(r0)
            java.util.Iterator r5 = r0.iterator()
            r2 = 0
        L_0x016e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r1 = r5.next()
            X.L25 r1 = (X.L25) r1
            boolean r0 = r1 instanceof X.KV3
            if (r0 == 0) goto L_0x01d5
            X.KV3 r1 = (X.KV3) r1
            X.JZC r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x01d5
            r6 = r2
        L_0x0189:
            int r6 = r6 - r8
            if (r6 >= r4) goto L_0x018d
            r6 = 0
        L_0x018d:
            com.instagram.music.common.model.MusicSearchPlaylist r0 = r3.A0E
            r1 = 0
            if (r0 == 0) goto L_0x01d3
            X.MWu r0 = r0.A00()
            com.instagram.api.schemas.AudioBrowserPlaylistType r5 = r0.BdL()
        L_0x019a:
            com.instagram.music.common.model.MusicSearchPlaylist r0 = r3.A0E
            if (r0 == 0) goto L_0x01a6
            X.MWu r0 = r0.A00()
            com.instagram.api.schemas.AudioBrowserPlaylistType r1 = r0.BdL()
        L_0x01a6:
            com.instagram.api.schemas.AudioBrowserPlaylistType r0 = com.instagram.api.schemas.AudioBrowserPlaylistType.FOR_YOU
            if (r1 != r0) goto L_0x01d1
            com.instagram.api.schemas.MusicProduct r0 = r15.A03
            boolean r0 = X.C14245TsS.A02(r0)
            if (r0 == 0) goto L_0x01c8
            com.instagram.common.session.UserSession r3 = r15.A05
            X.0Tu r2 = X.DbS.A0J(r3, r4)
            r0 = 36326300814554811(0x810e94000e36bb, double:3.036237137172497E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01c8
        L_0x01c3:
            r0 = 1
        L_0x01c4:
            r9.A02(r5, r7, r6, r0)
            return
        L_0x01c8:
            com.instagram.common.session.UserSession r0 = r15.A05
            boolean r0 = X.AnonymousClass30D.A03(r0)
            if (r0 == 0) goto L_0x01d1
            goto L_0x01c3
        L_0x01d1:
            r0 = 0
            goto L_0x01c4
        L_0x01d3:
            r5 = r1
            goto L_0x019a
        L_0x01d5:
            int r2 = r2 + 1
            goto L_0x016e
        L_0x01d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x01dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x01e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x01e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x01ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x01f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60379JkY.onBindViewHolder(X.3kE, int):void");
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(2124394494);
        long A002 = this.A0B.A00(((L25) getItem(i)).A00);
        AnonymousClass0fD.A0A(-1010717889, A032);
        return A002;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-565194802);
        Object item = getItem(i);
        if (item instanceof C61996KUt) {
            i2 = 5;
        } else if (item instanceof C61993KUq) {
            i2 = 3;
        } else if (item instanceof C61994KUr) {
            i2 = 6;
        } else if (item instanceof C61995KUs) {
            i2 = 12;
        } else if (item instanceof KV1) {
            i2 = 0;
        } else if (item instanceof C62001KUy) {
            i2 = 1;
        } else if (item instanceof C62000KUx) {
            i2 = 2;
        } else if (item instanceof KV0) {
            i2 = 14;
        } else if (item instanceof C62002KUz) {
            i2 = 8;
        } else if (item instanceof C61997KUu) {
            i2 = 10;
        } else if (item instanceof C61998KUv) {
            i2 = 9;
        } else if (item instanceof C61999KUw) {
            i2 = 16;
        } else if (item instanceof KV2) {
            i2 = 7;
        } else {
            UnsupportedOperationException A1B = AnonymousClass7TE.A1B("Unknown search item type");
            AnonymousClass0fD.A0A(1368284855, A032);
            throw A1B;
        }
        AnonymousClass0fD.A0A(-1752503129, A032);
        return i2;
    }
}
