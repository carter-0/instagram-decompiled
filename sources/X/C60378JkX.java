package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JkX  reason: case insensitive filesystem */
public final class C60378JkX extends C322136vJ {
    public final AnonymousClass07Z A00;
    public final MusicProduct A01;
    public final UserSession A02;
    public final LFN A03;
    public final MXX A04;
    public final C60329JjY A05;
    public final boolean A06;
    public final 1Av A07;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE kvm;
        0qQ.A0B(viewGroup, 0);
        C60960JuI juI = (C60960JuI) getItem(0);
        int i2 = i;
        if (i == 0) {
            String str = juI.A06;
            boolean A0K = 0qQ.A0K(str, "PLAYLIST_ID.IN_THIS_REEL");
            LayoutInflater A0G = JTP.A0G(viewGroup);
            if (A0K) {
                kvm = new KVK(DbT.A0D(A0G, viewGroup, R.layout.music_search_row_track_hscroll, false), this.A04);
            } else {
                View A0D = DbT.A0D(A0G, viewGroup, R.layout.music_search_row_track, false);
                UserSession userSession = this.A02;
                MXX mxx = this.A04;
                boolean z = this.A06;
                MusicProduct musicProduct = this.A01;
                String str2 = juI.A07;
                C60329JjY jjY = this.A05;
                kvm = new KVM(A0D, this.A00, musicProduct, userSession, this.A03, mxx, jjY, str, str2, z);
            }
            return kvm;
        } else if (i2 == 8) {
            AudioBrowserCategoryType audioBrowserCategoryType = juI.A01;
            if (audioBrowserCategoryType == AudioBrowserCategoryType.SPOTIFY_MOODS || audioBrowserCategoryType == AudioBrowserCategoryType.SPOTIFY_GENRES) {
                return new KVC(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.music_search_row_playlist_card, false), this.A04);
            }
            return new KVF(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.music_search_row_grouping, false), this.A02, this.A04);
        } else {
            throw AnonymousClass7TE.A0w("Unsupported search item type");
        }
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C249703kE r11) {
        0qQ.A0B(r11, 0);
        int bindingAdapterPosition = r11.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < getItemCount()) {
            C60960JuI juI = (C60960JuI) getItem(bindingAdapterPosition);
            JZC jzc = juI.A04;
            if (jzc.A0G == AnonymousClass05K.A01) {
                String str = juI.A06;
                String str2 = juI.A07;
                if (str2.length() == 0) {
                    str2 = "unknown";
                }
                C63863L9s l9s = new C63863L9s((Long) null, str, str2, "preview", juI.A00, bindingAdapterPosition);
                MXX mxx = this.A04;
                C66569MWx A002 = jzc.A00();
                if (A002 != null) {
                    mxx.Dt1(A002, l9s);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3ot] */
    public C60378JkX(AnonymousClass07Z r2, MusicProduct musicProduct, UserSession userSession, LFN lfn, MXX mxx, C60329JjY jjY, 1Av r8, boolean z) {
        super((C252303ot) new Object());
        this.A02 = userSession;
        this.A06 = z;
        this.A01 = musicProduct;
        this.A07 = r8;
        this.A04 = mxx;
        this.A05 = jjY;
        this.A03 = lfn;
        this.A00 = r2;
    }

    public final void A01(AudioBrowserCategoryType audioBrowserCategoryType, AudioBrowserPlaylistType audioBrowserPlaylistType, String str, String str2, List list, int i) {
        C60960JuI juI;
        C66569MWx mWx;
        MusicSearchPlaylistType musicSearchPlaylistType;
        MusicSearchPlaylist musicSearchPlaylist;
        String str3 = str;
        String str4 = str2;
        List list2 = list;
        AnonymousClass7TG.A1T(list2, str3, str4);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list2) {
            Integer num = ((JZC) next).A0G;
            if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0u) {
                A1C.add(next);
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            JZC jzc = (JZC) it.next();
            UserSession userSession = this.A02;
            0Tu r3 = 0Tu.A05;
            AudioBrowserCategoryType audioBrowserCategoryType2 = audioBrowserCategoryType;
            AudioBrowserPlaylistType audioBrowserPlaylistType2 = audioBrowserPlaylistType;
            int i2 = i;
            if (!182.A06(r3, userSession, 36329315880681497L)) {
                if (jzc == null || (musicSearchPlaylist = jzc.A0E) == null) {
                    musicSearchPlaylistType = null;
                } else {
                    musicSearchPlaylistType = musicSearchPlaylist.A01();
                }
                if (musicSearchPlaylistType != MusicSearchPlaylistType.SPOTIFY || !182.A06(r3, userSession, 36326300814489274L)) {
                    mWx = jzc.A00();
                    if (mWx == null) {
                    }
                    juI = new C60960JuI(audioBrowserCategoryType2, audioBrowserPlaylistType2, mWx, jzc, this.A03.A05.C9D(mWx.BUq()), str3, str4, i2);
                    A1C2.add(juI);
                }
            }
            if (jzc.A0G == AnonymousClass05K.A01) {
                mWx = jzc.A00();
                if (mWx == null) {
                }
                juI = new C60960JuI(audioBrowserCategoryType2, audioBrowserPlaylistType2, mWx, jzc, this.A03.A05.C9D(mWx.BUq()), str3, str4, i2);
                A1C2.add(juI);
            } else {
                juI = new C60960JuI(audioBrowserCategoryType2, audioBrowserPlaylistType2, (C66569MWx) null, jzc, (Integer) null, str3, str4, i2);
                A1C2.add(juI);
            }
        }
        submitList(A1C2);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r21, int i) {
        boolean z;
        Integer num;
        Integer num2;
        C66569MWx mWx;
        TrackMetadata trackMetadata;
        KVM kvm;
        Integer num3;
        Drawable drawable;
        Drawable mutate;
        C60518Jmp jmp = (C60518Jmp) r21;
        0qQ.A0B(jmp, 0);
        C60960JuI juI = (C60960JuI) getItem(i);
        JZC jzc = juI.A04;
        Integer num4 = jzc.A0G;
        if (num4 != null) {
            int intValue = num4.intValue();
            if (intValue != 1) {
                if (intValue == 6) {
                    MusicSearchPlaylist musicSearchPlaylist = jzc.A0E;
                    if (musicSearchPlaylist == null) {
                        return;
                    }
                    if (jmp instanceof KVC) {
                        KVC kvc = (KVC) jmp;
                        IgImageView igImageView = kvc.A02;
                        Context A062 = JTQ.A06(kvc);
                        Resources resources = kvc.A00;
                        igImageView.setImageDrawable(new GIH(A062, (GJO) null, resources.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxlarge), AnonymousClass7TE.A0D(resources), 0, 0, 0, 1, false));
                        JYP.A00(igImageView, musicSearchPlaylist.A00().BEO());
                        LY7.A00(kvc.A01, 29, musicSearchPlaylist, kvc);
                        return;
                    } else if (jmp instanceof KV8) {
                        ImageView A0F = DbU.A0F(jmp.itemView, R.id.mix_nux_icon);
                        Context A0S = AnonymousClass7TE.A0S(A0F);
                        Drawable drawable2 = A0S.getDrawable(R.drawable.music_mix_nux_icon);
                        if (drawable2 != null) {
                            drawable = drawable2.mutate();
                        } else {
                            drawable = null;
                        }
                        0qQ.A0C(drawable, C273654mx.A00(16));
                        LayerDrawable layerDrawable = (LayerDrawable) drawable;
                        Drawable drawable3 = A0S.getDrawable(R.drawable.instagram_mix_pano_outline_20);
                        if (!(drawable3 == null || (mutate = drawable3.mutate()) == null)) {
                            mutate.setColorFilter(AnonymousClass7TE.A09(A0S), PorterDuff.Mode.SRC_IN);
                        }
                        layerDrawable.setDrawableByLayerId(R.id.music_mix_pano_icon_drawable, drawable3);
                        A0F.setImageDrawable(layerDrawable);
                        return;
                    } else if (jmp instanceof KVG) {
                        ((KVG) jmp).A00((N4R) null);
                        return;
                    } else if (jmp instanceof KVM) {
                        kvm = (KVM) jmp;
                        0qQ.A0B((Object) null, 0);
                        num2 = AnonymousClass05K.A00;
                        trackMetadata = null.A00;
                        num = null;
                        z = false;
                        mWx = null;
                    } else if (jmp instanceof KV7) {
                        0qQ.A0B((Object) null, 0);
                        throw AnonymousClass00P.createAndThrow();
                    } else if (jmp instanceof KVA) {
                        KVA kva = (KVA) jmp;
                        DbX.A13(JTQ.A06(kva), kva.A00, C41847B3o.A1E(musicSearchPlaylist), 2131972869);
                        return;
                    } else if (jmp instanceof KVB) {
                        KVB kvb = (KVB) jmp;
                        String A1E = C41847B3o.A1E(musicSearchPlaylist);
                        kvb.A00.setText(A1E);
                        AnonymousClass0fU.A00(new LXK(A1E, kvb, 13), kvb.itemView);
                        return;
                    } else if (jmp instanceof KVH) {
                        0qQ.A0B((Object) null, 0);
                        ((KVH) jmp).A00((MusicSearchArtist) null, -1);
                        return;
                    } else if (jmp instanceof KVN) {
                        MVC mvc = musicSearchPlaylist;
                        0qQ.A0B(mvc, 0);
                        ((KVN) jmp).A02((AudioBrowserPlaylistType) null, mvc, 0, false);
                        return;
                    } else if (jmp instanceof KVK) {
                        0qQ.A0B((Object) null, 0);
                        return;
                    } else if (jmp instanceof KVL) {
                        KVL kvl = (KVL) jmp;
                        MVC mvc2 = musicSearchPlaylist;
                        0qQ.A0B(mvc2, 0);
                        String title = mvc2.getTitle();
                        kvl.A01.setText(title);
                        C61686KHu kHu = null;
                        kvl.A03.A01((AudioBrowserCategoryType) null, (AudioBrowserPlaylistType) null, mvc2.getId(), title, mvc2.Bf2(), 0);
                        if (0qQ.A0K(mvc2.getId(), "PLAYLIST_ID.IN_THIS_REEL")) {
                            kvl.A02.setVisibility(8);
                        } else {
                            kvl.A02.setVisibility(0);
                            kHu = new C61686KHu(8, kvl, mvc2);
                        }
                        kvl.A00 = kHu;
                        return;
                    } else if (jmp instanceof KVF) {
                        ((KVF) jmp).A00(musicSearchPlaylist);
                        return;
                    } else if (jmp instanceof KVJ) {
                        ((KVJ) jmp).A00(musicSearchPlaylist, false);
                        return;
                    } else if (jmp instanceof KVE) {
                        ((KVE) jmp).A00((JZC) null);
                        return;
                    } else if (jmp instanceof KV9) {
                        C229122ms r2 = (C229122ms) musicSearchPlaylist;
                        0qQ.A0B(r2, 0);
                        ((KV9) jmp).A00.A03(r2, (C230682q1) null);
                        return;
                    } else if (jmp instanceof KVD) {
                        ((KVD) jmp).A00((JZC) null);
                        return;
                    } else {
                        ((KVI) jmp).A00((C62925Kod) null);
                        return;
                    }
                }
            } else if (jmp instanceof KVK) {
                KVK kvk = (KVK) jmp;
                C66569MWx mWx2 = juI.A03;
                if (mWx2 != null) {
                    String str = juI.A06;
                    AnonymousClass0fU.A00(new C64251LXd(kvk, mWx2, juI.A07, str, 1), kvk.A01);
                    GVO gvo = kvk.A04;
                    String displayArtist = mWx2.getDisplayArtist();
                    String title2 = mWx2.getTitle();
                    SpannableStringBuilder A0E = C51965G9l.A0E();
                    A0E.append(displayArtist);
                    A0E.append(" • ");
                    A0E.append(title2);
                    ImageUrl imageUrl = null;
                    GVM.A00((Drawable) null, gvo, DbT.A10(A0E), mWx2.isExplicit(), false);
                    gvo.A00(false);
                    IgSimpleImageView igSimpleImageView = kvk.A03;
                    Context A063 = JTQ.A06(kvk);
                    Resources resources2 = kvk.A00;
                    int A0B = AnonymousClass7TE.A0B(resources2);
                    int dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.abc_control_corner_material);
                    int i2 = -1;
                    if (2Yu.A0L(JTQ.A06(kvk), R.attr.musicCreationShadowEnabled, false)) {
                        i2 = 1;
                    }
                    igSimpleImageView.setImageDrawable(new GIH(A063, (GJO) null, A0B, dimensionPixelSize, 0, 0, 0, i2, false));
                    if (!mWx2.CRQ()) {
                        imageUrl = mWx2.As5();
                    }
                    JYP.A00(igSimpleImageView, imageUrl);
                    AnonymousClass8IJ Adb = mWx2.Adb();
                    if (Adb == null || Adb.A04 == AudioFilterType.UNRECOGNIZED) {
                        kvk.A02.setVisibility(8);
                        return;
                    }
                    TextView textView = kvk.A02;
                    textView.setText(Adb.A03);
                    textView.setVisibility(0);
                    return;
                }
                return;
            } else {
                C66569MWx mWx3 = juI.A03;
                if (mWx3 != null && (num3 = juI.A05) != null) {
                    trackMetadata = jzc.A0A;
                    if (trackMetadata == null) {
                        trackMetadata = jzc.A09;
                    }
                    if (mWx3 instanceof JVX) {
                        ((JVX) mWx3).A00 = trackMetadata;
                    }
                    kvm = (KVM) jmp;
                    z = AnonymousClass7TF.A1W(juI.A02, AudioBrowserPlaylistType.NUMBERED);
                    num = Integer.valueOf(i + 1);
                    mWx = mWx3;
                    num2 = num3;
                } else {
                    return;
                }
            }
            kvm.A00(trackMetadata, mWx, num2, num, z);
            return;
        }
        throw AnonymousClass7TE.A0w("Unsupported search item type");
    }

    public final int A00(C66569MWx mWx) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            JZC jzc = ((C60960JuI) getItem(i)).A04;
            if (jzc.A0G == AnonymousClass05K.A01 && 0qQ.A0K(jzc.A00(), mWx)) {
                return i;
            }
        }
        return -1;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(1880939108);
        Integer num = ((C60960JuI) getItem(i)).A04.A0G;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                i2 = 0;
            } else if (intValue == 6) {
                i2 = 8;
            }
            AnonymousClass0fD.A0A(-740243319, A032);
            return i2;
        }
        IllegalArgumentException A0w = AnonymousClass7TE.A0w("Unsupported search item type");
        AnonymousClass0fD.A0A(-475946843, A032);
        throw A0w;
    }
}
