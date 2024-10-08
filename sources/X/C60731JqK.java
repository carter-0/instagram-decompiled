package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.Map;

/* renamed from: X.JqK  reason: case insensitive filesystem */
public final class C60731JqK extends C14072TpM {
    public final int A00;
    public final Object A01;

    public C60731JqK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00(int i) {
        switch (this.A00) {
            case 0:
                ((C14220Ts0) this.A01).A00(false);
                return;
            case 1:
                if (i == 0) {
                    ((ViewPager2) this.A01).A02();
                    return;
                }
                return;
            case 5:
                IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) this.A01;
                igSegmentedTabLayout2.A01 = igSegmentedTabLayout2.A02;
                igSegmentedTabLayout2.A02 = i;
                return;
            case 6:
                KVJ kvj = (KVJ) this.A01;
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                int i3 = kvj.A01;
                if (i != i3) {
                    if (i3 == 0) {
                        kvj.A03.removeCallbacksAndMessages((Object) null);
                    } else if (i == 0) {
                        kvj.A03.postDelayed(kvj.A08, 4500);
                    }
                    kvj.A01 = i;
                    return;
                }
                return;
            default:
                super.A00(i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.07Z, X.K4J] */
    public final void A01(int i) {
        View view;
        BoostMediaPickerTabType boostMediaPickerTabType;
        Object value;
        C61068Jw6 A002;
        switch (this.A00) {
            case 0:
                ((C14220Ts0) this.A01).A00(false);
                return;
            case 1:
                ViewPager2 viewPager2 = (ViewPager2) this.A01;
                if (viewPager2.A00 != i) {
                    viewPager2.A00 = i;
                    viewPager2.A09.A00();
                    return;
                }
                return;
            case 2:
                C46655Dia dia = (C46655Dia) this.A01;
                if (DbZ.A0O(dia.A05).A01.A05()) {
                    TabLayout tabLayout = dia.A02;
                    View view2 = null;
                    if (tabLayout == null) {
                        0qQ.A0F("tabLayout");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C324746zp A07 = tabLayout.A07(1);
                    if (!(A07 == null || (view = A07.A03) == null)) {
                        view2 = view.findViewById(R.id.new_badge);
                    }
                    int i2 = 0;
                    if (i == 0) {
                        if (view2 == null) {
                            return;
                        }
                    } else if (i == 1 && view2 != null) {
                        i2 = 8;
                    } else {
                        return;
                    }
                    view2.setVisibility(i2);
                    return;
                }
                return;
            case 3:
                C61403K5y k5y = (C61403K5y) this.A01;
                C60730JqJ jqJ = k5y.A00;
                if (jqJ != null && (boostMediaPickerTabType = (BoostMediaPickerTabType) DbZ.A0g(jqJ.A00, i)) != null) {
                    AnonymousClass0eM r5 = k5y.A0B;
                    C60293Jiq jiq = (C60293Jiq) r5.getValue();
                    05G r3 = jiq.A00;
                    do {
                        value = r3.getValue();
                        C61068Jw6 jw6 = (C61068Jw6) value;
                        C16492Uvn uvn = (C16492Uvn) jw6.A05;
                        int ordinal = uvn.ordinal();
                        if (ordinal == 0) {
                            A002 = C61068Jw6.A00(boostMediaPickerTabType, (BoostMediaPickerTabType) jw6.A03, uvn, jw6.A00, jw6.A01);
                        } else if (ordinal == 1) {
                            A002 = C61068Jw6.A00((BoostMediaPickerTabType) jw6.A04, boostMediaPickerTabType, uvn, jw6.A00, jw6.A01);
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    } while (!r3.AIY(value, A002));
                    C60293Jiq.A00(jiq).A00();
                    WGU A0D = JTU.A0D(k5y.A0A);
                    C16678UzE uzE = C16678UzE.MEDIA_PICKER;
                    String A0l = AnonymousClass7TF.A0l("_media_tab", JTQ.A0d(boostMediaPickerTabType));
                    A0D.A01 = DbS.A0t(k5y.A06);
                    A0D.A0F(uzE, A0l);
                    C61403K5y.A00(((C60293Jiq) r5.getValue()).A01(), k5y);
                    return;
                }
                return;
            case 4:
                ? r4 = (K4J) this.A01;
                1Eo.A05(AnonymousClass12T.A00.A04, new C66182MGt((K4J) r4, (AnonymousClass4D7) null, i), AnonymousClass07a.A00(r4));
                return;
            case 5:
                return;
            default:
                super.A01(i);
                return;
        }
    }

    public final void A02(int i, float f, int i2) {
        String str;
        switch (this.A00) {
            case 2:
                if (f != 0.0f) {
                    C46655Dia dia = (C46655Dia) this.A01;
                    float f2 = 0.8f;
                    if (JTR.A1X(DbT.A0X(dia.A07))) {
                        f2 = 1.0f;
                    }
                    TabLayout tabLayout = dia.A02;
                    if (tabLayout == null) {
                        str = "tabLayout";
                        break;
                    } else {
                        int selectedTabPosition = tabLayout.getSelectedTabPosition();
                        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB;
                        if (selectedTabPosition == 0) {
                            float f3 = 1.0f - 0.0f;
                            float f4 = f2 - 1.0f;
                            float f5 = 0.0f;
                            if (f3 != 0.0f) {
                                f5 = (f - 0.0f) / f3;
                            }
                            float f6 = (f5 * f4) + 1.0f;
                            float f7 = 1.0f - f2;
                            float f8 = 0.0f;
                            if (f3 != 0.0f) {
                                f8 = (f - 0.0f) / f3;
                            }
                            float f9 = (f8 * f7) + f2;
                            C46655Dia.A03(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType, f6);
                            UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType2 = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_AVATAR_TAB;
                            C46655Dia.A03(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType2, f9);
                            float f10 = 0.6f - 1.0f;
                            float f11 = 0.0f;
                            if (f3 != 0.0f) {
                                f11 = (f - 0.0f) / f3;
                            }
                            float f12 = (f11 * f10) + 1.0f;
                            float f13 = 1.0f - 0.6f;
                            float f14 = 0.0f;
                            if (f3 != 0.0f) {
                                f14 = (f - 0.0f) / f3;
                            }
                            C46655Dia.A02(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType, f12);
                            C46655Dia.A02(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType2, (f14 * f13) + 0.6f);
                            return;
                        }
                        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType3 = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_AVATAR_TAB;
                        if (selectedTabPosition == 1) {
                            float f15 = 0.0f - 1.0f;
                            float f16 = f2 - 1.0f;
                            float f17 = 0.0f;
                            if (f15 != 0.0f) {
                                f17 = (f - 1.0f) / f15;
                            }
                            float f18 = (f17 * f16) + 1.0f;
                            float f19 = 1.0f - f2;
                            float f20 = 0.0f;
                            if (f15 != 0.0f) {
                                f20 = (f - 1.0f) / f15;
                            }
                            C46655Dia.A03(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType3, f18);
                            C46655Dia.A03(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType, (f20 * f19) + f2);
                            float f21 = 0.6f - 1.0f;
                            float f22 = 0.0f;
                            if (f15 != 0.0f) {
                                f22 = (f - 1.0f) / f15;
                            }
                            float f23 = (f22 * f21) + 1.0f;
                            float f24 = 1.0f - 0.6f;
                            float f25 = 0.0f;
                            if (f15 != 0.0f) {
                                f25 = (f - 1.0f) / f15;
                            }
                            C46655Dia.A02(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType3, f23);
                            C46655Dia.A02(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType, (f25 * f24) + 0.6f);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) this.A01;
                int i3 = igSegmentedTabLayout2.A02;
                if (i3 == 1 || (i3 == 2 && igSegmentedTabLayout2.A01 == 1)) {
                    C60066Jeq jeq = igSegmentedTabLayout2.A04;
                    View childAt = jeq.getChildAt((int) Math.ceil((double) (((float) i) + f)));
                    View childAt2 = jeq.getChildAt(i);
                    float A0B = (float) (JTR.A0B(igSegmentedTabLayout2, childAt2) / 2);
                    igSegmentedTabLayout2.scrollTo((int) (((((float) childAt.getLeft()) - ((float) (JTR.A0B(igSegmentedTabLayout2, childAt) / 2))) * f) + ((1.0f - f) * (((float) childAt2.getLeft()) - A0B))), 0);
                    jeq.onPageScrolled(i, f, i2);
                    return;
                }
                return;
            case 6:
                KVJ kvj = (KVJ) this.A01;
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                kvj.A09.setCurrentPage(i);
                Map map = kvj.A0A;
                MusicSearchPlaylist musicSearchPlaylist = kvj.A02;
                if (musicSearchPlaylist == null) {
                    str = "musicSearchPlaylist";
                    break;
                } else {
                    map.put(musicSearchPlaylist, Integer.valueOf(i));
                    kvj.A00 = i;
                    return;
                }
            default:
                super.A02(i, f, i2);
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
