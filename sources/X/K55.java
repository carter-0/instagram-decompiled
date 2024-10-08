package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.VideoView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollectionImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class K55 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ClipsProductTagFragment";
    public IgFrameLayout A00;
    public IgTextView A01;
    public C65705LyK A02;
    public AnonymousClass3Q2 A03;
    public K99 A04;
    public RoundedCornerFrameLayout A05;
    public ListView A06;
    public ShoppingCreationConfig A07;
    public String A08;
    public String A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public static final void A00(K55 k55) {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        ProductCollectionImpl productCollectionImpl;
        ClipInfo clipInfo;
        ArrayList arrayList3;
        K55 k552 = k55;
        AnonymousClass0eM r2 = k55.A0A;
        boolean A002 = C63447KxC.A00(AnonymousClass7TE.A0l(r2));
        Long l = null;
        AnonymousClass3Q2 r0 = k55.A03;
        if (A002) {
            if (r0 != null) {
                arrayList3 = r0.A43;
            } else {
                arrayList3 = null;
            }
            list = LTX.A0A(arrayList3);
            arrayList = null;
        } else {
            if (r0 == null || (arrayList2 = r0.A43) == null) {
                arrayList = null;
            } else {
                arrayList = AnonymousClass7TG.A0r(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(JTU.A0Q(it).A0H);
                }
            }
            list = null;
        }
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        String str = k552.A09;
        if (str == null) {
            str = "";
        }
        String str2 = k552.A08;
        C65705LyK lyK = k552.A02;
        if (lyK == null) {
            0qQ.A0F("clipsProductTaggingController");
            throw AnonymousClass00P.createAndThrow();
        }
        C61062Jw0 jw0 = lyK.A00;
        ArrayList A012 = C64182LSo.A01(jw0, lyK.A07);
        if (jw0 != null) {
            productCollectionImpl = (ProductCollectionImpl) jw0.A00;
        } else {
            productCollectionImpl = null;
        }
        TaggingFeedMultiSelectState taggingFeedMultiSelectState = new TaggingFeedMultiSelectState((ProductCollectionFeedTaggingMeta) null, productCollectionImpl, A012, (Map) null);
        AnonymousClass3Q2 r5 = k552.A03;
        if (!(r5 == null || (clipInfo = r5.A1N) == null)) {
            l = DbS.A0j(JTO.A09(clipInfo));
        }
        C63503KyE.A00(k552, A0l, r5, taggingFeedMultiSelectState, l, str, str2, (String) null, arrayList, list);
    }

    public final String getModuleName() {
        return "clips_product_tagging";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        IgFrameLayout igFrameLayout = (IgFrameLayout) view2.requireViewById(R.id.product_tagging_add_tag_button);
        this.A00 = igFrameLayout;
        if (igFrameLayout != null) {
            LYD.A02(igFrameLayout, 6, this);
        }
        this.A01 = DbT.A0a(view2, R.id.product_tagging_limit_text);
        this.A06 = (ListView) view2.requireViewById(R.id.product_tagging_tagged_items);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view2.requireViewById(R.id.product_tagging_video_preview_layout);
        this.A05 = roundedCornerFrameLayout;
        if (roundedCornerFrameLayout != null) {
            try {
                roundedCornerFrameLayout.setCornerRadius(DbV.A05(this).getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material));
            } catch (Resources.NotFoundException unused) {
                0wb.A01.Ew0("clips_product_tagging", "Failed to get dimension pixel offset used to set the product tagging video preview rounded corner radius");
            }
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.A05;
        if (roundedCornerFrameLayout2 != null) {
            LYD.A02(roundedCornerFrameLayout2, 7, this);
        }
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A0A;
        this.A02 = new C65705LyK(requireContext, view2, this, AnonymousClass7TE.A0l(r3), this, this.A03, this.A09);
        Context requireContext2 = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        Integer num = AnonymousClass05K.A01;
        C65705LyK lyK = this.A02;
        if (lyK != null) {
            K99 k99 = new K99(requireContext2, this, A0l, lyK, num, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false);
            this.A04 = k99;
            ListView listView = this.A06;
            if (listView != null) {
                listView.setAdapter(k99);
            }
            A01();
            C65705LyK lyK2 = this.A02;
            if (lyK2 != null) {
                AnonymousClass3Q2 r4 = lyK2.A06;
                if (r4 == null) {
                    return;
                }
                if (r4.A0r != null) {
                    ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(lyK2.A02, R.id.product_tagging_vvp_video_preview_container);
                    viewGroup.setVisibility(0);
                    ClipInfo clipInfo = r4.A1N;
                    new LWf(lyK2.A01, viewGroup, lyK2.A05, (ConstrainedTextureView) null, r4, (C62320sa) null, 0.0f, clipInfo.A09, clipInfo.A06, false, false);
                    return;
                }
                ClipInfo clipInfo2 = r4.A1N;
                if (clipInfo2 != null && (str = clipInfo2.A0F) != null) {
                    VideoView videoView = (VideoView) AnonymousClass7TF.A0F(lyK2.A02, R.id.product_tagging_mp_video_preview_container);
                    videoView.setVisibility(0);
                    try {
                        videoView.setOnPreparedListener(LVK.A00);
                        videoView.setOnCompletionListener(new LVC(videoView, 2));
                        if (182.A06(0Tu.A05, lyK2.A05, 36318058774468429L)) {
                            videoView.setOnErrorListener(LVF.A00);
                        }
                        videoView.setVideoPath(str);
                        return;
                    } catch (IllegalStateException unused2) {
                        0wb.A01.Ew0("ClipsProductTaggingController", "Failed to play video preview using file path in product tagging preview screen");
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F("clipsProductTaggingController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        ProductCollectionImpl productCollectionImpl;
        boolean z;
        boolean z2;
        IgFrameLayout igFrameLayout;
        C61062Jw0 jw0;
        ArrayList arrayList;
        List A092;
        ArrayList arrayList2;
        C61062Jw0 jw02;
        C65705LyK lyK = this.A02;
        String str = "clipsProductTaggingController";
        String str2 = str;
        if (lyK != null) {
            C61062Jw0 jw03 = lyK.A00;
            if (jw03 != null) {
                productCollectionImpl = (ProductCollectionImpl) jw03.A00;
            } else {
                productCollectionImpl = null;
            }
            if (productCollectionImpl != null) {
                K99 k99 = this.A04;
                if (k99 != null) {
                    k99.A0K.clear();
                    k99.A0L.clear();
                    k99.A02 = productCollectionImpl;
                }
                0qQ.A0F("taggedItemsAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            K99 k992 = this.A04;
            if (k992 != null) {
                ArrayList A012 = lyK.A01();
                List list = k992.A0K;
                list.clear();
                k992.A0L.clear();
                k992.A02 = null;
                list.addAll(A012);
            }
            0qQ.A0F("taggedItemsAdapter");
            throw AnonymousClass00P.createAndThrow();
            K99 k993 = this.A04;
            if (k993 != null) {
                k993.A0C();
                C65705LyK lyK2 = this.A02;
                C61062Jw0 jw04 = null;
                if (lyK2 != null) {
                    if (lyK2.A01().size() >= 30 || !((jw02 = lyK2.A00) == null || jw02.A00 == null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    str = "taggedItemsAdapter";
                    if (!z) {
                        boolean A002 = C63447KxC.A00(AnonymousClass7TE.A0l(this.A0A));
                        AnonymousClass3Q2 r1 = this.A03;
                        if (A002) {
                            if (r1 != null) {
                                arrayList2 = r1.A43;
                            } else {
                                arrayList2 = null;
                            }
                            A092 = LTX.A07(arrayList2);
                        } else {
                            if (r1 != null) {
                                arrayList = r1.A43;
                            } else {
                                arrayList = null;
                            }
                            A092 = LTX.A09(arrayList);
                        }
                        K99 k994 = this.A04;
                        if (k994 != null) {
                            AnonymousClass3Q2 r12 = this.A03;
                            if (r12 != null) {
                                jw04 = r12.A0q;
                            }
                            List A052 = LTX.A05(jw04, A092);
                            List list2 = k994.A0H;
                            list2.clear();
                            Iterator it = A052.iterator();
                            while (it.hasNext()) {
                                Product A0Q = JTU.A0Q(it);
                                if (A0Q != null) {
                                    list2.add(A0Q);
                                }
                            }
                        }
                    } else {
                        K99 k995 = this.A04;
                        if (k995 != null) {
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            List list3 = k995.A0H;
                            list3.clear();
                            Iterator it2 = A1C.iterator();
                            while (it2.hasNext()) {
                                Product A0Q2 = JTU.A0Q(it2);
                                if (A0Q2 != null) {
                                    list3.add(A0Q2);
                                }
                            }
                        }
                    }
                    K99 k996 = this.A04;
                    if (k996 != null) {
                        k996.A0C();
                        C65705LyK lyK3 = this.A02;
                        if (lyK3 == null) {
                            0qQ.A0F(str2);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        if (lyK3.A01().size() >= 30 || !((jw0 = lyK3.A00) == null || jw0.A00 == null)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            IgTextView igTextView = this.A01;
                            if (igTextView != null) {
                                igTextView.setVisibility(0);
                            }
                            igFrameLayout = this.A00;
                        } else {
                            IgFrameLayout igFrameLayout2 = this.A00;
                            if (igFrameLayout2 != null) {
                                igFrameLayout2.setVisibility(0);
                            }
                            igFrameLayout = this.A01;
                        }
                        if (igFrameLayout != null) {
                            igFrameLayout.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
            }
            0qQ.A0F("taggedItemsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        if (i4 == -1 && intent != null && i3 == 16) {
            C65705LyK lyK = this.A02;
            if (lyK == null) {
                0qQ.A0F("clipsProductTaggingController");
                throw AnonymousClass00P.createAndThrow();
            }
            if (intent2.getParcelableExtra(AnonymousClass000.A00(83)) != null) {
                C61062Jw0 jw0 = lyK.A00;
                C64182LSo lSo = C63550Kyz.A00;
                String str = lyK.A07;
                String str2 = str;
                if (str == null) {
                    str = "";
                }
                C61062Jw0 A042 = lSo.A04(intent2, str);
                lyK.A00 = A042;
                C61062Jw0 A002 = LTX.A00(jw0, A042);
                lyK.A00 = A002;
                AnonymousClass3Q2 r5 = lyK.A06;
                if (r5 != null) {
                    r5.A0q = A002;
                    UserSession userSession = lyK.A05;
                    boolean A003 = C63447KxC.A00(userSession);
                    ArrayList arrayList = r5.A43;
                    C61062Jw0 jw02 = lyK.A00;
                    AnonymousClass0iw r8 = lyK.A04;
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    boolean A0u = r5.A0u();
                    List A062 = LTX.A06(jw0, arrayList);
                    for (MediaSuggestedProductTag mediaSuggestedProductTag : LTX.A06(jw02, arrayList)) {
                        if (!A062.contains(mediaSuggestedProductTag)) {
                            LTX.A0B(r8, userSession, mediaSuggestedProductTag, "add", str3, A0u, A003);
                        }
                    }
                    ArrayList arrayList2 = r5.A43;
                    C61062Jw0 jw03 = lyK.A00;
                    if (str2 == null) {
                        str2 = "";
                    }
                    boolean A0u2 = r5.A0u();
                    List<MediaSuggestedProductTag> A063 = LTX.A06(jw0, arrayList2);
                    List A064 = LTX.A06(jw03, arrayList2);
                    for (MediaSuggestedProductTag mediaSuggestedProductTag2 : A063) {
                        if (!A064.contains(mediaSuggestedProductTag2)) {
                            LTX.A0B(r8, userSession, mediaSuggestedProductTag2, "remove", str2, A0u2, A003);
                        }
                    }
                }
            }
            A01();
        }
    }

    public final void configureActionBar(2da r3) {
        r3.setTitle(JTT.A0B(this, r3).getString(2131955617));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_check_pano_outline_24;
        A0K.A0P = true;
        A0K.A02 = Dbb.A06(this);
        A0K.A05 = 2131960992;
        DbX.A19(LYD.A01(this, 4), A0K, r3);
        DbX.A1A(LYD.A01(this, 5), DbX.A0M(), r3);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1944035217);
        K55.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = 28K.A00(AnonymousClass7TE.A0l(this.A0A)).A03(requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY"));
        this.A09 = requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_WATERFALL_ID");
        this.A08 = requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USER_ID");
        requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USERNAME");
        this.A07 = (ShoppingCreationConfig) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_SHOPPING_CREATION_CONFIG");
        AnonymousClass0fD.A09(132169062, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2122345549);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_product_tagging_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1067245194, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1689203772);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A06 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(232886387, A022);
    }
}
