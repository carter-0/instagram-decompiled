package X;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4in  reason: invalid class name and case insensitive filesystem */
public abstract class C271404in {
    public static final int A00(IgSimpleImageView igSimpleImageView, IgTextView igTextView, AnonymousClass6KJ r5, boolean z) {
        0qQ.A0B(igSimpleImageView, 1);
        switch (r5.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                A0B(igSimpleImageView, 1, z);
                return 1;
            case 4:
            case 5:
            case 6:
                A0B(igSimpleImageView, 8388611, z);
                return 8388611;
            case 9:
            case 10:
                igSimpleImageView.setVisibility(8);
                if (igTextView == null) {
                    return 1;
                }
                igTextView.setVisibility(8);
                return 1;
            default:
                throw new RuntimeException();
        }
    }

    public static final MusicOverlayStickerModel A02(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        B3d A09 = A09(drawable);
        if (A09 != null) {
            return A09.BUu();
        }
        throw new IllegalStateException("input param must be a valid music sticker");
    }

    public static final MusicOverlayStickerModel A03(MusicProduct musicProduct, 1Xj r5, Integer num) {
        TrackData trackData;
        MusicAssetModel A00;
        ArrayList arrayList = null;
        if (r5 != null) {
            if (r5.A0C.getMusicMetadata() != null) {
                Iterator it = r5.A3F().iterator();
                while (it.hasNext()) {
                    if (((C255783ui) it.next()).A11 == AnonymousClass3WT.MUSIC_OVERLAY) {
                    }
                }
                AnonymousClass1dn musicMetadata = r5.A0C.getMusicMetadata();
                if (musicMetadata == null) {
                    return null;
                }
                MusicInfo BUr = musicMetadata.BUr();
                if (BUr != null) {
                    trackData = BUr.BUk();
                } else {
                    trackData = null;
                }
                OriginalSoundDataIntf BZB = musicMetadata.BZB();
                if (trackData != null) {
                    A00 = MusicAssetModel.A01(trackData, false);
                } else if (BZB == null) {
                    return null;
                } else {
                    A00 = MusicAssetModel.A00(BZB, false);
                }
                return C59670JTa.A04(musicProduct, A00, num, "");
            }
            arrayList = r5.A3F();
        }
        return A05(arrayList);
    }

    public static final AnonymousClass6KJ A08(1Av r3, boolean z) {
        String string;
        0qQ.A0B(r3, 0);
        if (z) {
            0xa r2 = r3.A01;
            if (r2.getBoolean(AnonymousClass000.A00(3768), true)) {
                string = r2.getString(AnonymousClass000.A00(3534), "");
                0qQ.A07(string);
                return A11.A00(string);
            }
        }
        string = r3.A01.getString(AnonymousClass000.A00(3613), "");
        0qQ.A07(string);
        return A11.A00(string);
    }

    public static final B3d A09(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (drawable instanceof AnonymousClass5MI) {
            drawable = ((AnonymousClass5MI) drawable).AfT();
        } else if (drawable instanceof C347017w8) {
            drawable = ((C347017w8) drawable).A04();
            0qQ.A07(drawable);
        }
        if (drawable instanceof B3d) {
            return (B3d) drawable;
        }
        return null;
    }

    public static final boolean A0C(Drawable drawable) {
        AnonymousClass6KJ r2;
        0qQ.A0B(drawable, 0);
        B3d A09 = A09(drawable);
        if (A09 != null) {
            r2 = A09.BV4();
        } else {
            r2 = null;
        }
        if (r2 == AnonymousClass6KJ.MUSIC_ONLY) {
            return true;
        }
        return false;
    }

    public static final boolean A0E(List list) {
        0qQ.A0B(list, 0);
        return A05(list) != null;
    }

    public static final MusicProduct A01(Drawable drawable) {
        B3d b3d;
        MusicOverlayStickerModel BUu;
        AnonymousClass5MI r1;
        Drawable AfT;
        if (!(!(drawable instanceof AnonymousClass5MI) || (r1 = (AnonymousClass5MI) drawable) == null || (AfT = r1.AfT()) == null)) {
            drawable = AfT;
        }
        if (!(drawable instanceof B3d) || (b3d = (B3d) drawable) == null || (BUu = b3d.BUu()) == null) {
            return null;
        }
        return BUu.A02;
    }

    public static final MusicOverlayStickerModel A05(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C255783ui r2 = (C255783ui) it.next();
            if (r2.A11 == AnonymousClass3WT.MUSIC_OVERLAY) {
                MusicOverlayStickerModel musicOverlayStickerModel = r2.A0v;
                if (musicOverlayStickerModel == null) {
                    return r2.A0u;
                }
                return musicOverlayStickerModel;
            }
        }
        return null;
    }

    public static final ArrayList A0A(List list) {
        int i;
        String A00;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof AnonymousClass9XG) {
                i = 829;
            } else if (next instanceof AnonymousClass9XH) {
                i = 823;
            } else if (next instanceof C16170Upv) {
                i = 825;
            } else if (next instanceof C16171Upw) {
                i = 828;
            } else if (next instanceof C16167Ups) {
                i = 824;
            } else if (next instanceof C16166Upr) {
                i = 826;
            } else if (next instanceof C16168Upt) {
                i = 827;
            } else if (next instanceof AnonymousClass9XI) {
                A00 = AnonymousClass000.A00(1607);
                arrayList.add(A00);
            } else if (next instanceof AnonymousClass9XJ) {
                i = 830;
            } else {
                throw new IllegalArgumentException("Unhandled Music Sticker Drawable");
            }
            A00 = C273654mx.A00(i);
            arrayList.add(A00);
        }
        return arrayList;
    }

    public static final void A0B(IgSimpleImageView igSimpleImageView, int i, boolean z) {
        if (z) {
            igSimpleImageView.setVisibility(0);
        }
        int dimensionPixelOffset = igSimpleImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.ad_not_delivering_thumbnail_height);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset);
        layoutParams.gravity = i;
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    public static final boolean A0D(MusicOverlayStickerModel musicOverlayStickerModel) {
        0tS A00 = 0tS.A4E.A00();
        if (((Boolean) A00.A1k.CDM(A00, 0tS.A4G[210])).booleanValue() || musicOverlayStickerModel == null || ((0qQ.A0K(musicOverlayStickerModel.A0E, true) || 0qQ.A0K(musicOverlayStickerModel.A0D, true)) && !musicOverlayStickerModel.A0t)) {
            return true;
        }
        return false;
    }

    public static final MusicOverlayStickerModel A04(C255773uh r3) {
        if (r3.CWu()) {
            1Xj r0 = r3.A0b;
            if (r0 != null) {
                return A03((MusicProduct) null, r0, (Integer) null);
            }
            throw new IllegalStateException("Required value was null.");
        } else if (!r3.A1Y()) {
            return null;
        } else {
            C270184gK r02 = r3.A0d;
            if (r02 != null) {
                return C59923Jbm.A00.A02(r02.A00.A4b);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final MusicOverlayStickerModel A06(List list) {
        String str;
        String str2;
        MusicOverlayStickerModel A05 = A05(list);
        if (A05 == null) {
            return null;
        }
        if (A05.A0t || ((str = A05.A0m) != null && str.length() != 0 && (str2 = A05.A0Y) != null && str2.length() != 0)) {
            return A05;
        }
        return null;
    }

    public static final C349337zz A07(AnonymousClass9SE r1, MusicOverlayStickerModel musicOverlayStickerModel, C40599Aen aen, AnonymousClass6KJ r4, int i) {
        C349337zz af0;
        if (!r4.A02()) {
            af0 = new Af0(musicOverlayStickerModel, aen, r4, i);
        } else if (r1 != null) {
            af0 = new Af1(r1, musicOverlayStickerModel, aen, r4, i);
        } else {
            throw new IllegalStateException("Should be non-null if this is a lyrics sticker");
        }
        return af0;
    }
}
