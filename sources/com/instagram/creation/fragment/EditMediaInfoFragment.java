package com.instagram.creation.fragment;

import X.002;
import X.0Aj;
import X.0Tu;
import X.0mk;
import X.0nA;
import X.0qQ;
import X.0xY;
import X.182;
import X.1Au;
import X.1Av;
import X.1E7;
import X.1Ng;
import X.1OC;
import X.1Wr;
import X.1Xj;
import X.1Xv;
import X.1Yl;
import X.1wn;
import X.27p;
import X.27r;
import X.27x;
import X.2Yu;
import X.AnonymousClass000;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass1Nd;
import X.AnonymousClass1eb;
import X.AnonymousClass283;
import X.AnonymousClass2xS;
import X.AnonymousClass37D;
import X.AnonymousClass3E4;
import X.AnonymousClass3E5;
import X.AnonymousClass3E6;
import X.AnonymousClass3W1;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass4Ke;
import X.AnonymousClass4Kf;
import X.AnonymousClass4LK;
import X.AnonymousClass536;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.AnonymousClass9OT;
import X.C249383je;
import X.C249713kF;
import X.C250563lf;
import X.C252063oV;
import X.C252213ok;
import X.C254423sS;
import X.C267874cM;
import X.C270984hi;
import X.C271174i4;
import X.C272014jx;
import X.C272034jz;
import X.C272054k1;
import X.C273374mT;
import X.C273654mx;
import X.C282555Dn;
import X.C331127Pr;
import X.C357108Wn;
import X.C357128Wq;
import X.C358248ab;
import X.C367088qA;
import X.C3724090s;
import X.C46292DTv;
import X.C51965G9l;
import X.C51966G9m;
import X.C59725JVj;
import X.C59899JbO;
import X.C60014JdN;
import X.C60289Jil;
import X.C60304Jj3;
import X.C61000Juw;
import X.C61529KBi;
import X.C62030KWg;
import X.C64095LMp;
import X.C64624LfC;
import X.C64629LfH;
import X.C64646LfY;
import X.C64648Lfa;
import X.C64679Lg6;
import X.C64698LgT;
import X.C64723Lh0;
import X.C64871LjX;
import X.C65423Lt3;
import X.C65425Lt6;
import X.C65681Lxw;
import X.C66464MSs;
import X.C66579MXk;
import X.C71662eb;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.Dba;
import X.EE7;
import X.FIZ;
import X.FIh;
import X.GIT;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.JTS;
import X.JTT;
import X.JUO;
import X.JZM;
import X.K4O;
import X.KAX;
import X.LIZ;
import X.LPD;
import X.LTZ;
import X.LV3;
import X.LV8;
import X.LWP;
import X.LY9;
import X.LYB;
import X.LYG;
import X.LYT;
import X.M12;
import X.M16;
import X.M17;
import X.M3D;
import X.MSX;
import X.WGU;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class EditMediaInfoFragment extends C273374mT implements AnonymousClass4DU, AnonymousClass4DS {
    public int A00 = 0;
    public Location A01;
    public Handler A02;
    public Editable A03;
    public BrandedContentGatingInfoIntf A04;
    public BrandedContentProjectMetadataIntf A05;
    public MediaGenAIDetectionMethod A06;
    public WGU A07;
    public 1wn A08 = new C64698LgT(this, 18);
    public C252063oV A09;
    public C252063oV A0A;
    public C60304Jj3 A0B;
    public AddChannelsRowChannelInfo A0C;
    public C61000Juw A0D;
    public C60289Jil A0E;
    public C59899JbO A0F;
    public C64723Lh0 A0G;
    public C62030KWg A0H;
    public 1Xj A0I;
    public AnonymousClass3W1 A0J;
    public LocationSignalPackage A0K;
    public Venue A0L;
    public AudioOverlayTrack A0M;
    public 1Av A0N;
    public LPD A0O;
    public ProductCollectionFeedTaggingMeta A0P;
    public C357128Wq A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V = "";
    public ArrayList A0W = AnonymousClass7TE.A1C();
    public ArrayList A0X = AnonymousClass7TE.A1C();
    public ArrayList A0Y = AnonymousClass7TE.A1C();
    public ArrayList A0Z = AnonymousClass7TE.A1C();
    public ArrayList A0a = AnonymousClass7TE.A1C();
    public ArrayList A0b = AnonymousClass7TE.A1C();
    public HashMap A0c = AnonymousClass7TE.A1E();
    public HashMap A0d = AnonymousClass7TE.A1E();
    public HashMap A0e = AnonymousClass7TE.A1E();
    public LinkedHashMap A0f = AnonymousClass7TE.A1H();
    public List A0g = AnonymousClass7TE.A1C();
    public boolean A0h;
    public boolean A0i;
    public boolean A0j = false;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public int A0v;
    public int A0w;
    public AnonymousClass3E6 A0x;
    public C71662eb A0y;
    public C71662eb A0z;
    public C71662eb A10;
    public C282555Dn A11;
    public C64095LMp A12;
    public ProductCollectionFeedTaggingMeta A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public final View.OnClickListener A18 = new LYB(this, 35);
    public final View.OnLayoutChangeListener A19 = new LYT(this, 8);
    public final C267874cM A1A = new C65423Lt3(this, 0);
    public final List A1B = AnonymousClass7TE.A1C();
    public final List A1C = AnonymousClass7TE.A1C();
    public final TextWatcher A1D = new LWP((Object) this, 6);
    public final View.OnClickListener A1E = new LYB(this, 36);
    public final 1wn A1F = new C64698LgT(this, 17);
    public final 1wn A1G = new C64698LgT(this, 15);
    public final 1wn A1H = new C64698LgT(this, 19);
    public final 1wn A1I = new C64698LgT(this, 16);
    public final C252213ok A1J = new C64871LjX(this, 4);
    public final MSX A1K = new C65425Lt6(this);
    public final C66464MSs A1L = new C65681Lxw(this, 1);
    public final List A1M = AnonymousClass7TE.A1C();
    public ViewGroup mActionBar;
    public C252063oV mAddAudioLabelStubber;
    public C252063oV mAddGenAILabelStubber;
    public TextView mBelowUsernameLabel;
    public IgAutoCompleteTextView mCaption;
    public View mCommentPromptLabelView;
    public TextView mExtraLocationLabel;
    public View mFailedView;
    public ViewGroup mMediaTitleLayout;
    public ViewGroup mOptionsContainer;
    public View mPostOverlayView;
    public C252063oV mReplaceAudioLabelStubber;
    public C252063oV mReplaceGenAILabelStubber;
    public View mScrollView;
    public View mTextContainer;
    public TextView mTimestamp;
    public CircularImageView mUserImageView;
    public TextView mUsername;
    public TextView mUsernameAddCollaboratorsTextButton;
    public TextView mUsernameDotSeparator;

    public static void A0J(EditMediaInfoFragment editMediaInfoFragment, boolean z) {
        String str;
        EditMediaInfoFragment editMediaInfoFragment2 = editMediaInfoFragment;
        Context requireContext = editMediaInfoFragment.requireContext();
        1Xj r7 = editMediaInfoFragment.A0I;
        UserSession session = editMediaInfoFragment.getSession();
        FragmentActivity requireActivity = editMediaInfoFragment.requireActivity();
        0qQ.A0B(session, 2);
        if (LIZ.A01(session, r7)) {
            String A042 = 182.A04(0Tu.A05, session, 36886549232681683L);
            C358248ab A0Y2 = DbS.A0Y(requireContext);
            A0Y2.A09(2131962358);
            A0Y2.A08(2131962357);
            A0Y2.A0I(new FIh(1, editMediaInfoFragment2, editMediaInfoFragment, requireContext, r7, session), 2131962360);
            if (URLUtil.isValidUrl(A042)) {
                A0Y2.A0G(new FIZ(requireActivity, editMediaInfoFragment2, session, A042, 3), 2131962359);
            }
            String str2 = null;
            A0Y2.A0H((DialogInterface.OnClickListener) null, 2131960862);
            DbT.A1V(A0Y2);
            27r A012 = 27p.A01(session);
            if (r7 != null) {
                str2 = r7.A2n();
            }
            0Aj A0e2 = AnonymousClass7TE.A0e(A012.A01, "ig_camera_notification_impression");
            if (A0e2.isSampled()) {
                if (z) {
                    str = "NOTIFICATION_AUDIO_REPLACE";
                } else {
                    str = "FEED_EDIT_AUDIO_REPLACE";
                }
                JTP.A1H(A0e2);
                AnonymousClass283 r2 = A012.A04;
                JTP.A1I(A0e2, r2);
                AnonymousClass7TE.A1W(A0e2, "entity_type", 50);
                AnonymousClass7TH.A0U(A0e2);
                JTS.A19(A0e2, r2);
                A0e2.AAJ("interest_topic_pick_session_id", "");
                C51965G9l.A1A(C59725JVj.DIALOG_SHEET, A0e2);
                DbY.A1C(A0e2);
                A0e2.A9F("media_id", 27x.A0F(str2));
                A0e2.AAJ("dialog_entry_point", str);
                A0e2.Cgf();
            }
        }
    }

    public static boolean A0R(List list, List list2) {
        boolean isEmpty;
        if (list == null) {
            if (list2 == null) {
                return false;
            }
            isEmpty = list2.isEmpty();
        } else if (list2 == null) {
            return true;
        } else {
            ArrayList A1D2 = AnonymousClass7TE.A1D(list);
            A1D2.removeAll(list2);
            ArrayList A1D3 = AnonymousClass7TE.A1D(list2);
            A1D3.removeAll(list);
            if (A1D2.isEmpty()) {
                isEmpty = A1D3.isEmpty();
            }
        }
        return !isEmpty;
    }

    public final String getModuleName() {
        return "edit_media_info";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A02(View view, EditMediaInfoFragment editMediaInfoFragment) {
        LYG.A02(view, 29, new M12(editMediaInfoFragment), editMediaInfoFragment);
        UserSession session = editMediaInfoFragment.getSession();
        String str = editMediaInfoFragment.A0R;
        str.getClass();
        C250563lf.A0e(AnonymousClass9OT.POST, editMediaInfoFragment.A06, session, (Boolean) null, "edit_media_info", C273654mx.A00(739), str.split("_")[0]);
    }

    public static void A03(ViewGroup viewGroup, EditMediaInfoFragment editMediaInfoFragment) {
        if (editMediaInfoFragment.A0n) {
            View requireViewById = DbV.A0D(viewGroup).inflate(R.layout.promote_edit_caption_guidance_button, viewGroup).requireViewById(R.id.promote_edit_caption_guidance_button);
            AnonymousClass0fU.A00(editMediaInfoFragment.A1E, requireViewById);
            requireViewById.setVisibility(0);
        }
    }

    public static void A04(EditMediaInfoFragment editMediaInfoFragment) {
        1Xj r0 = editMediaInfoFragment.A0I;
        if (r0 != null && r0.A0C.Alu() != null) {
            Iterator it = editMediaInfoFragment.A0I.A0C.Alu().iterator();
            while (it.hasNext()) {
                1Xj A0t2 = C51966G9m.A0t(it);
                String id = A0t2.getId();
                id.getClass();
                if (!id.endsWith(AnonymousClass000.A00(5096))) {
                    editMediaInfoFragment.A1B.add(A0t2);
                    if (A0t2.A0C.BfH() == null) {
                        editMediaInfoFragment.A00++;
                    }
                }
            }
        }
    }

    public static void A05(EditMediaInfoFragment editMediaInfoFragment) {
        long j;
        1Wr r2 = 1Wr.A00;
        r2.getClass();
        r2.removeLocationUpdates(editMediaInfoFragment.getSession(), editMediaInfoFragment.A1A);
        r2.cancelSignalPackageRequest(editMediaInfoFragment.getSession(), editMediaInfoFragment.A1K);
        FragmentActivity requireActivity = editMediaInfoFragment.requireActivity();
        UserSession session = editMediaInfoFragment.getSession();
        Location location = editMediaInfoFragment.A01;
        LocationSignalPackage locationSignalPackage = editMediaInfoFragment.A0K;
        1Xj r0 = editMediaInfoFragment.A0I;
        if (r0 != null) {
            j = r0.A1A();
        } else {
            j = -1;
        }
        NearbyVenuesService.A01(requireActivity, location, session, locationSignalPackage, Long.valueOf(j));
    }

    public static void A06(EditMediaInfoFragment editMediaInfoFragment) {
        editMediaInfoFragment.mCaption.getClass();
        editMediaInfoFragment.mCaption.clearFocus();
        0nA.A0N(editMediaInfoFragment.mCaption);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(com.instagram.creation.fragment.EditMediaInfoFragment r6) {
        /*
            X.1Xj r0 = r6.A0I
            if (r0 == 0) goto L_0x000b
            boolean r1 = X.C254423sS.A08(r0)
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = 0
            if (r0 == 0) goto L_0x0074
            X.1Xj r0 = r6.A0I
            r0.getClass()
            X.1Xj r0 = r6.A0I
            X.0qQ.A0B(r0, r1)
            X.DTv r0 = X.C254423sS.A03(r0)
            if (r0 == 0) goto L_0x0072
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.Bfu()
            if (r0 == 0) goto L_0x0072
            com.instagram.user.model.User r5 = r0.BRo()
        L_0x0029:
            r5.getClass()
            X.8ab r4 = X.DbW.A0U(r6)
            r0 = 2131962242(0x7f132982, float:1.9561204E38)
            r4.A09(r0)
            android.content.res.Resources r2 = X.DbV.A05(r6)
            r1 = 2131961459(0x7f132673, float:1.9559616E38)
            r3 = 1
            X.4Cl r0 = r5.A03
            java.lang.String r0 = r0.getUsername()
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r4.A0q(r0)
            r2 = 2131971974(0x7f134f86, float:1.9580942E38)
            r0 = 47
            X.LV3 r1 = X.LV3.A00(r6, r0)
            X.8ae r0 = X.C358278ae.RED
            r4.A0Q(r1, r0, r2)
            r0 = 48
            X.LV3 r0 = X.LV3.A00(r6, r0)
            r4.A0C(r0)
            r4.A0r(r3)
            r1 = 2
            X.LTx r0 = new X.LTx
            r0.<init>(r6, r1)
            r4.A0B(r0)
            X.DbT.A1V(r4)
            return
        L_0x0072:
            r5 = 0
            goto L_0x0029
        L_0x0074:
            A0K(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A08(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    public static void A09(EditMediaInfoFragment editMediaInfoFragment) {
        1Xj r0;
        User user;
        ProductDetailsProductItemDictIntf Bfu;
        1Xj r02 = editMediaInfoFragment.A0I;
        if (r02 != null && C254423sS.A08(r02) && (r0 = editMediaInfoFragment.A0I) != null) {
            C46292DTv A032 = C254423sS.A03(r0);
            if (A032 == null || (Bfu = A032.Bfu()) == null) {
                user = null;
            } else {
                user = Bfu.BRo();
            }
            user.getClass();
            A06(editMediaInfoFragment);
            C358248ab A0U2 = DbW.A0U(editMediaInfoFragment);
            A0U2.A09(2131974175);
            A0U2.A0q(DbV.A0z(editMediaInfoFragment, user.A03.getUsername(), 2131974176));
            A0U2.A0G((DialogInterface.OnClickListener) null, 2131968772);
            DbT.A1V(A0U2);
        }
    }

    public static void A0A(EditMediaInfoFragment editMediaInfoFragment) {
        if (editMediaInfoFragment.A14 || editMediaInfoFragment.A0o || editMediaInfoFragment.mCommentPromptLabelView != null) {
            A06(editMediaInfoFragment);
            return;
        }
        editMediaInfoFragment.mCaption.getClass();
        editMediaInfoFragment.A14 = true;
        editMediaInfoFragment.mCaption.requestFocus();
        0nA.A0Q(editMediaInfoFragment.mCaption);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static void A0B(EditMediaInfoFragment editMediaInfoFragment) {
        int right;
        int bottom;
        int width;
        if (editMediaInfoFragment.mMediaTitleLayout != null && editMediaInfoFragment.mTextContainer != null && editMediaInfoFragment.mTimestamp != null && editMediaInfoFragment.mUserImageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editMediaInfoFragment.A0S().getLayoutParams();
            if (0mk.A02(editMediaInfoFragment.requireContext())) {
                0nA.A0Z(editMediaInfoFragment.A0S(), AnonymousClass7TG.A03(editMediaInfoFragment.requireContext()));
                right = editMediaInfoFragment.mTimestamp.getWidth();
                bottom = editMediaInfoFragment.mMediaTitleLayout.getBottom();
                width = (JTT.A06(editMediaInfoFragment) - editMediaInfoFragment.mTextContainer.getRight()) + DbV.A05(editMediaInfoFragment).getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            } else {
                right = editMediaInfoFragment.mUserImageView.getRight();
                bottom = editMediaInfoFragment.mMediaTitleLayout.getBottom();
                width = editMediaInfoFragment.mTimestamp.getWidth();
            }
            marginLayoutParams.setMargins(right, bottom, width, 0);
            TextView A0S2 = editMediaInfoFragment.A0S();
            A0S2.setHighlightColor(0);
            A0S2.setLayoutParams(marginLayoutParams);
            A0S2.setVisibility(0);
            DbX.A1G(A0S2, editMediaInfoFragment.A00());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(com.instagram.creation.fragment.EditMediaInfoFragment r12) {
        /*
            X.1Xj r0 = r12.A0I
            r0.getClass()
            X.1Xj r0 = r12.A0I
            X.3YD r4 = X.AnonymousClass3YC.A00
            boolean r0 = r4.A09(r0)
            if (r0 == 0) goto L_0x0074
            X.1Xj r0 = r12.A0I
            boolean r1 = r4.A08(r0)
            X.1Xj r0 = r12.A0I
            if (r1 == 0) goto L_0x0148
            java.lang.String r7 = r4.A03(r0)
        L_0x001d:
            X.1Xj r1 = r12.A0I
            r3 = 0
            X.0qQ.A0B(r1, r3)
            X.1Xy r0 = r1.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = r0.Aov()
            if (r0 == 0) goto L_0x0114
        L_0x0031:
            com.instagram.api.schemas.ProductCollectionV2Type r6 = X.V81.A00(r0)
        L_0x0035:
            X.1Xj r1 = r12.A0I
            X.0qQ.A0B(r1, r3)
            X.1Xy r0 = r1.A0C
            X.DUl r0 = r0.Bg2()
            r11 = 0
            if (r0 == 0) goto L_0x00de
            java.lang.Boolean r0 = r0.CP7()
            if (r0 == 0) goto L_0x00de
        L_0x0049:
            boolean r11 = r0.booleanValue()
        L_0x004d:
            if (r7 == 0) goto L_0x0074
            if (r6 == 0) goto L_0x0074
            r10 = 0
            r8 = 0
            X.1Xj r1 = r12.A0I
            r12.requireContext()
            X.0qQ.A0B(r1, r3)
            boolean r0 = r4.A0A(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.String r8 = r4.A04(r1)
        L_0x0065:
            X.1Xj r0 = r12.A0I
            java.lang.String r9 = r4.A06(r0)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r5 = new com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A0P = r5
            r12.A13 = r5
        L_0x0074:
            X.1Xj r0 = r12.A0I
            java.util.List r0 = r0.A3V()
            if (r0 == 0) goto L_0x008f
            java.util.ArrayList r1 = r12.A0Y
            if (r1 != 0) goto L_0x0086
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r12.A0Y = r1
        L_0x0086:
            X.1Xj r0 = r12.A0I
            java.util.List r0 = r0.A3V()
            r1.addAll(r0)
        L_0x008f:
            X.1Xj r0 = r12.A0I
            r0.A3R()
            java.util.ArrayList r1 = r12.A0Y
            if (r1 != 0) goto L_0x009e
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r12.A0Y = r1
        L_0x009e:
            X.1Xj r0 = r12.A0I
            java.util.List r0 = r0.A3R()
            r1.addAll(r0)
            java.util.ArrayList r1 = r12.A0X
            if (r1 != 0) goto L_0x00b1
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r12.A0X = r1
        L_0x00b1:
            X.1Xj r0 = r12.A0I
            java.util.List r0 = r0.A3R()
            r1.addAll(r0)
            boolean r1 = A0P(r12)
            X.1Xj r0 = r12.A0I
            if (r1 == 0) goto L_0x014e
            java.util.HashMap r0 = r0.A3M()
            r12.A0d = r0
            java.util.Iterator r2 = X.AnonymousClass7TF.A0t(r0)
        L_0x00cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r1 = r2.next()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r0 = r12.A0W
            r0.addAll(r1)
            goto L_0x00cc
        L_0x00de:
            java.util.List r0 = X.AnonymousClass3YD.A01(r1)
            r5 = 0
            if (r0 == 0) goto L_0x004d
            java.util.Iterator r2 = r0.iterator()
        L_0x00e9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x00e9
        L_0x00fe:
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x004d
            X.1Xy r0 = r1.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x004d
            java.lang.Boolean r0 = r0.CP7()
            if (r0 == 0) goto L_0x004d
            goto L_0x0049
        L_0x0112:
            r1 = r5
            goto L_0x00fe
        L_0x0114:
            java.util.List r0 = X.AnonymousClass3YD.A01(r1)
            r6 = 0
            if (r0 == 0) goto L_0x0035
            java.util.Iterator r2 = r0.iterator()
        L_0x011f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r4.A09(r0)
            if (r0 == 0) goto L_0x011f
        L_0x0132:
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0035
            X.1Xy r0 = r1.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r0.Aov()
            if (r0 == 0) goto L_0x0035
            goto L_0x0031
        L_0x0146:
            r1 = r6
            goto L_0x0132
        L_0x0148:
            java.lang.String r7 = r4.A05(r0)
            goto L_0x001d
        L_0x014e:
            java.util.ArrayList r0 = r0.A3E()
            if (r0 == 0) goto L_0x015e
            X.1Xj r0 = r12.A0I
            java.util.ArrayList r0 = r0.A3E()
            r12.A0a = r0
            r12.A0W = r0
        L_0x015e:
            X.1Xj r0 = r12.A0I
            java.util.ArrayList r0 = r0.A3I()
            if (r0 == 0) goto L_0x016e
            X.1Xj r0 = r12.A0I
            java.util.ArrayList r0 = r0.A3I()
            r12.A0Z = r0
        L_0x016e:
            X.1Xj r0 = r12.A0I
            java.util.ArrayList r0 = r0.A3G()
            if (r0 == 0) goto L_0x018f
            X.1Xj r0 = r12.A0I
            java.util.ArrayList r0 = r0.A3G()
            r12.A0b = r0
            return
        L_0x017f:
            X.1Xj r0 = r12.A0I
            java.util.HashMap r0 = r0.A3L()
            r12.A0c = r0
            X.1Xj r0 = r12.A0I
            java.util.HashMap r0 = r0.A3N()
            r12.A0e = r0
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0C(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    public static void A0D(EditMediaInfoFragment editMediaInfoFragment) {
        0xY A0p2 = AnonymousClass7TE.A0p(editMediaInfoFragment.A0N);
        A0p2.E5T("has_seen_boost_edit_caption_guidance_bottom_sheet", true);
        A0p2.apply();
        A06(editMediaInfoFragment);
        K4O k4o = new K4O();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putBoolean("ARGUMENT_IS_MESSAGING_ADS_SELECTED", editMediaInfoFragment.A17);
        k4o.setArguments(A0a2);
        C331127Pr A0W2 = DbS.A0W(editMediaInfoFragment.getSession());
        A0W2.A0d = editMediaInfoFragment.getString(2131970665);
        A0W2.A0g = editMediaInfoFragment.getString(2131970664);
        A0W2.A0v = true;
        A0W2.A1J = true;
        DbY.A13(editMediaInfoFragment, k4o, A0W2);
    }

    public static void A0E(EditMediaInfoFragment editMediaInfoFragment) {
        View view;
        int i;
        if (editMediaInfoFragment.mReplaceAudioLabelStubber != null && editMediaInfoFragment.mAddAudioLabelStubber != null) {
            if (LIZ.A01(editMediaInfoFragment.getSession(), editMediaInfoFragment.A0I)) {
                editMediaInfoFragment.mReplaceAudioLabelStubber.setVisibility(0);
                editMediaInfoFragment.mAddAudioLabelStubber.setVisibility(8);
                view = editMediaInfoFragment.mReplaceAudioLabelStubber.getView();
                View requireViewById = view.requireViewById(R.id.audio_unavailable_warning_icon);
                TextView A0G2 = DbU.A0G(view, R.id.audio_unavailable_text_label);
                AnonymousClass4Ke A012 = GIT.A01(editMediaInfoFragment.A0M);
                if (A012 != null) {
                    requireViewById.setVisibility(8);
                    A0G2.setText(AnonymousClass4Kf.A02(editMediaInfoFragment.requireContext(), editMediaInfoFragment.getSession(), A012));
                    i = 33;
                } else {
                    requireViewById.setVisibility(0);
                    A0G2.setText(2131953304);
                    i = 34;
                }
            } else {
                boolean A002 = LIZ.A00(editMediaInfoFragment.getSession(), editMediaInfoFragment.A0I);
                editMediaInfoFragment.mReplaceAudioLabelStubber.setVisibility(8);
                C252063oV r0 = editMediaInfoFragment.mAddAudioLabelStubber;
                if (A002) {
                    r0.setVisibility(0);
                    view = editMediaInfoFragment.mAddAudioLabelStubber.getView();
                    Context requireContext = editMediaInfoFragment.requireContext();
                    TextView A0G3 = DbU.A0G(view, R.id.add_audio_label);
                    AnonymousClass4Ke A013 = GIT.A01(editMediaInfoFragment.A0M);
                    if (A013 != null) {
                        A0G3.setText(AnonymousClass4Kf.A02(requireContext, editMediaInfoFragment.getSession(), A013));
                        DbY.A12(A0G3, requireContext);
                        i = 27;
                    } else {
                        A0G3.setText(2131952314);
                        DbT.A17(requireContext, A0G3, 2Yu.A0D(requireContext));
                        i = 28;
                    }
                } else {
                    r0.setVisibility(8);
                    return;
                }
            }
            AnonymousClass0fU.A00(new LYB(editMediaInfoFragment, i), view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3.A0r != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(com.instagram.creation.fragment.EditMediaInfoFragment r3) {
        /*
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0019
            X.2dZ r2 = X.Dba.A0A(r3)
            boolean r0 = r3.A0l
            if (r0 != 0) goto L_0x0010
            boolean r0 = r3.A0t
            if (r0 == 0) goto L_0x0015
        L_0x0010:
            boolean r1 = r3.A0r
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r2.ARJ(r0)
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0F(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(com.instagram.creation.fragment.EditMediaInfoFragment r5) {
        /*
            android.view.View r2 = r5.mView
            if (r2 == 0) goto L_0x0057
            boolean r1 = r5.A0m
            android.view.View r0 = r5.mFailedView
            if (r1 == 0) goto L_0x0069
            r4 = 0
            if (r0 != 0) goto L_0x0026
            r0 = 2131432197(0x7f0b1305, float:1.8486145E38)
            android.view.View r0 = X.DbY.A0F(r2, r0)
            r5.mFailedView = r0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r2 = r0.getChildAt(r4)
            r1 = 31
            X.LYB r0 = new X.LYB
            r0.<init>((com.instagram.creation.fragment.EditMediaInfoFragment) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x0026:
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            android.os.Bundle r2 = r5.mArguments
            if (r2 == 0) goto L_0x005e
            r0 = 235(0xeb, float:3.3E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.DbV.A0o(r2, r1)
            X.1iA r1 = X.1i9.A00(r0)
        L_0x0042:
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x0058
            r1 = 2131961448(0x7f132668, float:1.9559593E38)
            java.lang.String r0 = "edit_photo_failed"
        L_0x004b:
            X.C59689JTv.A01(r3, r0, r1, r4)
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A03(r3)
            r0.A0T()
        L_0x0057:
            return
        L_0x0058:
            r1 = 2131961449(0x7f132669, float:1.9559595E38)
            java.lang.String r0 = "edit_video_failed"
            goto L_0x004b
        L_0x005e:
            X.1Xj r0 = r5.A0I
            if (r0 == 0) goto L_0x0067
            X.1iA r1 = r0.BR7()
            goto L_0x0042
        L_0x0067:
            r1 = 0
            goto L_0x0042
        L_0x0069:
            X.AnonymousClass7TH.A0R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0G(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: X.4DU} */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object, X.Hvd] */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x077e, code lost:
        if (X.C253833rU.A02(r4) == false) goto L_0x0678;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0403  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(com.instagram.creation.fragment.EditMediaInfoFragment r28) {
        /*
            r3 = r28
            X.1Xj r0 = r3.A0I
            if (r0 == 0) goto L_0x0782
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.mUserImageView
            r0.getClass()
            android.widget.TextView r0 = r3.mUsername
            r0.getClass()
            android.widget.TextView r0 = r3.mBelowUsernameLabel
            r0.getClass()
            android.widget.TextView r0 = r3.mTimestamp
            r0.getClass()
            X.2eb r0 = r3.A10
            r0.getClass()
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r3.mCaption
            r0.getClass()
            com.instagram.common.session.UserSession r0 = r3.getSession()
            com.instagram.user.model.User r1 = X.DbT.A0j(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.mUserImageView
            X.DbU.A1S(r3, r0, r1)
            android.widget.TextView r0 = r3.mUsername
            X.DbU.A1H(r0, r1)
            boolean r1 = r3.A0M()
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x009c
            android.widget.TextView r1 = r3.mUsernameDotSeparator
            r1.getClass()
            android.widget.TextView r1 = r3.mUsernameAddCollaboratorsTextButton
            r1.getClass()
            android.content.Context r4 = r3.requireContext()
            r1 = 2131952285(0x7f13029d, float:1.9541008E38)
            java.lang.String r5 = r4.getString(r1)
            java.util.ArrayList r4 = r3.A0Y
            if (r4 == 0) goto L_0x005d
            int r1 = r4.size()
            if (r1 == r0) goto L_0x0067
        L_0x005d:
            java.lang.String r1 = r3.A0V
            if (r1 == 0) goto L_0x00c7
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00c7
        L_0x0067:
            android.content.Context r4 = r3.requireContext()
            r1 = 2131968818(0x7f134332, float:1.9574541E38)
            java.lang.String r5 = r4.getString(r1)
        L_0x0072:
            android.widget.TextView r1 = r3.mUsernameAddCollaboratorsTextButton
            r1.setText(r5)
            android.widget.TextView r1 = r3.mUsernameDotSeparator
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.mUsernameAddCollaboratorsTextButton
            r1.setVisibility(r2)
            android.widget.TextView r5 = r3.mUsernameAddCollaboratorsTextButton
            r4 = 25
            X.LYB r1 = new X.LYB
            r1.<init>((com.instagram.creation.fragment.EditMediaInfoFragment) r3, (int) r4)
            X.AnonymousClass0fU.A00(r1, r5)
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.27r r5 = X.27p.A01(r1)
            X.80P r4 = X.AnonymousClass80P.INVITE_COLLABORATOR
            X.4yP r1 = X.C279294yP.FEED
            r5.A14(r1, r4)
        L_0x009c:
            android.widget.TextView r1 = r3.mBelowUsernameLabel
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.mUsername
            r4 = 80
            r1.setGravity(r4)
            android.widget.TextView r1 = r3.mTimestamp
            r1.setGravity(r4)
            java.util.ArrayList r4 = r3.A0a
            if (r4 == 0) goto L_0x00f9
            X.1Xj r1 = r3.A0I
            if (r1 == 0) goto L_0x00f9
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r4.iterator()
        L_0x00bd:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00e5
            X.JTU.A1M(r5, r4)
            goto L_0x00bd
        L_0x00c7:
            if (r4 == 0) goto L_0x0072
            int r1 = r4.size()
            if (r1 <= r0) goto L_0x0072
            android.content.Context r5 = r3.requireContext()
            r4 = 2131967737(0x7f133ef9, float:1.9572349E38)
            java.util.ArrayList r1 = r3.A0Y
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = X.DbW.A0h(r5, r1, r4)
            goto L_0x0072
        L_0x00e5:
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.8Oa r4 = X.AnonymousClass8OY.A00(r1)
            X.1Xj r1 = r3.A0I
            java.lang.String r1 = r1.getId()
            r1.getClass()
            r4.A01(r1, r5)
        L_0x00f9:
            android.text.SpannableStringBuilder r6 = X.C51965G9l.A0E()
            com.instagram.common.session.UserSession r1 = r3.getSession()
            boolean r1 = X.AnonymousClass430.A00(r1)
            if (r1 != 0) goto L_0x011b
            java.util.List r1 = r3.A0g
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x011b
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r1 = r3.A05
            if (r1 == 0) goto L_0x0619
            com.instagram.api.schemas.BrandedContentProjectAction r4 = r1.AYA()
            com.instagram.api.schemas.BrandedContentProjectAction r1 = com.instagram.api.schemas.BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT
            if (r4 != r1) goto L_0x0619
        L_0x011b:
            X.1Xj r1 = r3.A0I
            boolean r1 = r1.A5h()
            if (r1 != 0) goto L_0x0619
            android.text.SpannableStringBuilder r5 = X.C51965G9l.A0E()
            java.util.List r1 = r3.A0g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x05d1
            android.content.Context r4 = r3.requireContext()
            java.util.List r1 = r3.A0g
            android.text.SpannableStringBuilder r5 = X.C49946FGa.A00(r4, r1)
        L_0x0139:
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r5)
            r7 = 2
            X.JdN r5 = new X.JdN
            r5.<init>(r3, r7)
            int r4 = r8.length()
            r1 = 33
            r8.setSpan(r5, r2, r4, r1)
            r6.append(r8)
            android.widget.TextView r1 = r3.mBelowUsernameLabel
            r1.getClass()
            android.widget.TextView r1 = r3.mBelowUsernameLabel
            r1.setText(r6)
            X.0qi r1 = X.C62000qj.A02
            X.0sa r1 = r1.A0B
            boolean r1 = X.C51971G9r.A1b(r1)
            android.widget.TextView r4 = r3.mBelowUsernameLabel
            if (r1 == 0) goto L_0x05c3
            X.M3C r1 = new X.M3C
            r1.<init>(r3)
            X.03T.A00(r4, r1)
        L_0x016e:
            com.instagram.common.session.UserSession r7 = r3.getSession()
            java.lang.Integer r5 = X.AnonymousClass05K.A0F
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            com.instagram.common.session.UserSession r1 = r3.getSession()
            java.lang.Integer r1 = X.LPL.A00(r1)
            X.JVF.A02(r3, r7, r5, r4, r1)
        L_0x0181:
            A0E(r3)
            X.3oV r1 = r3.mReplaceGenAILabelStubber
            if (r1 == 0) goto L_0x0203
            X.3oV r1 = r3.mAddGenAILabelStubber
            if (r1 == 0) goto L_0x0203
            com.instagram.common.session.UserSession r4 = r3.getSession()
            X.1Xj r1 = r3.A0I
            boolean r1 = X.C250563lf.A0q(r4, r1)
            if (r1 == 0) goto L_0x0203
            com.instagram.common.session.UserSession r1 = r3.getSession()
            boolean r1 = X.JUL.A01(r1)
            r7 = 8
            if (r1 == 0) goto L_0x01e2
            X.3oV r1 = r3.mReplaceGenAILabelStubber
            android.view.View r4 = r1.getView()
            r1 = 2131432214(0x7f0b1316, float:1.848618E38)
            android.widget.TextView r9 = X.DbU.A0G(r4, r1)
            X.3oV r1 = r3.mAddGenAILabelStubber
            android.view.View r4 = r1.getView()
            r1 = 2131427741(0x7f0b019d, float:1.8477107E38)
            android.widget.TextView r8 = X.DbU.A0G(r4, r1)
            X.3oV r1 = r3.mReplaceGenAILabelStubber
            android.view.View r4 = r1.getView()
            r1 = 2131432215(0x7f0b1317, float:1.8486181E38)
            android.view.View r5 = r4.requireViewById(r1)
            android.content.res.Resources r4 = X.DbV.A05(r3)
            r1 = 2131963014(0x7f132c86, float:1.956277E38)
            X.DbU.A1A(r4, r9, r1)
            android.content.res.Resources r4 = X.DbV.A05(r3)
            r1 = 2131964573(0x7f13329d, float:1.9565931E38)
            X.DbU.A1A(r4, r8, r1)
            r5.setVisibility(r7)
        L_0x01e2:
            X.1Xj r4 = r3.A0I
            if (r4 == 0) goto L_0x05b5
            com.instagram.common.session.UserSession r1 = r3.getSession()
            boolean r1 = r4.A6Y(r1)
            if (r1 == 0) goto L_0x05b5
            X.3oV r1 = r3.mReplaceGenAILabelStubber
            r1.setVisibility(r2)
            X.3oV r1 = r3.mAddGenAILabelStubber
            r1.setVisibility(r7)
            X.3oV r1 = r3.mReplaceGenAILabelStubber
        L_0x01fc:
            android.view.View r1 = r1.getView()
            A02(r1, r3)
        L_0x0203:
            android.widget.TextView r1 = r3.mBelowUsernameLabel
            r1.setHighlightColor(r2)
            android.widget.TextView r1 = r3.mBelowUsernameLabel
            r1.setText(r6)
            android.widget.TextView r1 = r3.mBelowUsernameLabel
            X.DbT.A1H(r1)
            android.widget.TextView r1 = r3.mTimestamp
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0229
            android.widget.TextView r5 = r3.mTimestamp
            X.1Xj r4 = r3.A0I
            android.content.Context r1 = r3.requireContext()
            java.lang.String r1 = r4.A34(r1)
            r5.setText(r1)
        L_0x0229:
            X.1Xj r4 = r3.A0I
            com.instagram.common.session.UserSession r1 = r3.getSession()
            com.instagram.user.model.UpcomingEvent r8 = r4.A27(r1)
            X.2eb r1 = r3.A10
            if (r8 == 0) goto L_0x05b0
            android.view.View r10 = r1.A01()
            android.widget.TextView r10 = (android.widget.TextView) r10
            r10.setVisibility(r2)
            android.text.TextPaint r1 = r10.getPaint()
            r1.setFakeBoldText(r0)
            java.lang.StringBuilder r9 = X.AnonymousClass7TE.A1A()
            android.content.Context r5 = r3.requireContext()
            r4 = 2131976014(0x7f135f4e, float:1.9589137E38)
            java.lang.String r1 = r8.getTitle()
            java.lang.String r1 = X.DbW.A0h(r5, r1, r4)
            r9.append(r1)
            com.instagram.common.session.UserSession r12 = r3.getSession()
            long r6 = X.C18810W3l.A02(r8)
            long r4 = X.C18810W3l.A00(r8)
            android.content.Context r8 = r3.requireContext()
            java.util.Calendar r1 = X.C14240TsN.A02
            X.0qQ.A0B(r12, r2)
            r15 = 3
            r13 = 0
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x05aa
            java.util.Calendar r11 = X.C14240TsN.A01
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            r11.setTime(r1)
            java.util.Calendar r13 = X.C14240TsN.A02
            java.util.Date r1 = new java.util.Date
            r1.<init>(r6)
            r13.setTime(r1)
            r1 = 5
            int r11 = r11.get(r1)
            int r1 = r13.get(r1)
            boolean r1 = X.AnonymousClass7TF.A1S(r11, r1)
            if (r1 == 0) goto L_0x0559
            r13 = 2131957432(0x7f1316b8, float:1.9551448E38)
            r14 = 2131957451(0x7f1316cb, float:1.9551486E38)
            java.lang.String r1 = "EE"
            java.lang.String r11 = X.C14240TsN.A04(r1, r6)
            java.lang.String r1 = "MMM d"
            java.lang.String r1 = X.C14240TsN.A04(r1, r6)
            java.lang.String r14 = X.DbV.A0u(r8, r11, r1, r14)
            X.0qQ.A07(r14)
            java.util.Locale r1 = X.C14240TsN.A05()
            java.text.DateFormat r11 = java.text.DateFormat.getTimeInstance(r15, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.String r11 = r11.format(r1)
            X.0qQ.A07(r11)
            java.util.Locale r1 = X.C14240TsN.A05()
            java.text.DateFormat r15 = java.text.DateFormat.getTimeInstance(r15, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = r15.format(r1)
            X.0qQ.A07(r4)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r6)
            java.lang.String r1 = X.C14240TsN.A03(r12, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r14, r11, r4, r1}
        L_0x02e8:
            java.lang.String r1 = r8.getString(r13, r1)
            X.0qQ.A0A(r1)
        L_0x02ef:
            r9.append(r1)
            r10.setText(r9)
            r4 = 26
            X.LYB r1 = new X.LYB
            r1.<init>((com.instagram.creation.fragment.EditMediaInfoFragment) r3, (int) r4)
            X.AnonymousClass0fU.A00(r1, r10)
        L_0x02ff:
            X.1Xj r1 = r3.A0I
            r1.getClass()
            X.1Xy r1 = r1.A0C
            X.47o r6 = r1.Amn()
            if (r6 == 0) goto L_0x0549
            java.lang.String r5 = r6.C6E()
            java.lang.String r4 = r6.getTitle()
            java.lang.Integer r1 = r6.BXU()
            if (r1 == 0) goto L_0x0546
            java.lang.Integer r1 = r6.BXU()
            int r1 = r1.intValue()
        L_0x0322:
            com.instagram.creation.channels.model.AddChannelsRowChannelInfo r8 = new com.instagram.creation.channels.model.AddChannelsRowChannelInfo
            r8.<init>(r5, r4, r1)
            r7 = 1
        L_0x0328:
            X.KWg r1 = r3.A0H
            if (r1 != 0) goto L_0x0333
            X.KWg r1 = new X.KWg
            r1.<init>()
            r3.A0H = r1
        L_0x0333:
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            com.instagram.common.session.UserSession r5 = r3.getSession()
            X.KWg r4 = r3.A0H
            r4.getClass()
            X.KDN r1 = new X.KDN
            r1.<init>(r5, r4, r2)
            X.2YN r4 = X.JTO.A0L(r1, r6)
            java.lang.Class<X.Jj3> r1 = X.C60304Jj3.class
            X.2YL r4 = r4.A00(r1)
            X.Jj3 r4 = (X.C60304Jj3) r4
            r3.A0B = r4
            r1 = r7 ^ 1
            r4.A03(r3, r8, r1)
            X.3oV r1 = r3.A0A
            r1.getClass()
            android.view.View r1 = r1.getView()
            X.Hn6 r6 = new X.Hn6
            r6.<init>(r1)
            X.Kst r5 = new X.Kst
            r5.<init>()
            X.Jj3 r1 = r3.A0B
            X.0Ud r1 = r1.A08
            X.0qQ.A0B(r1, r2)
            androidx.lifecycle.CoroutineLiveData r4 = X.DbT.A0G(r1)
            X.IHI r1 = new X.IHI
            r1.<init>(r2, r3, r5, r6)
            r4.A06(r3, r1)
        L_0x037e:
            com.instagram.common.session.UserSession r6 = r3.getSession()
            X.0Tu r1 = X.0Tu.A05
            r4 = 36317358692504658(0x810672000c1452, double:3.030582103180945E-306)
            boolean r1 = X.182.A06(r1, r6, r4)
            if (r1 == 0) goto L_0x03f4
            X.1Xj r1 = r3.A0I
            r1.getClass()
            X.1Xy r1 = r1.A0C
            X.1eb r1 = r1.BFi()
            boolean r14 = X.AnonymousClass7TF.A1V(r1)
            X.3oV r1 = r3.A09
            r1.getClass()
            android.view.View r9 = r1.getView()
            com.instagram.common.session.UserSession r11 = r3.getSession()
            android.content.Context r8 = r3.requireContext()
            X.Juw r1 = r3.A0D
            boolean r13 = X.AnonymousClass7TF.A1V(r1)
            java.lang.String r4 = r3.A0R
            r4.getClass()
            java.lang.String r1 = "_"
            java.lang.String[] r1 = r4.split(r1)
            r12 = r1[r2]
            X.KkS r6 = X.C62666KkS.BIO_IG_POST_EDIT
            X.LBJ r7 = new X.LBJ
            r10 = r6
            r15 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.Hvd r5 = new X.Hvd
            r5.<init>()
            X.Jil r1 = r3.A0E
            if (r1 == 0) goto L_0x03de
            X.2Fk r4 = r1.A01
            X.IHJ r1 = new X.IHJ
            r1.<init>(r7, r5)
            r4.A06(r3, r1)
        L_0x03de:
            boolean r1 = r3.A0i
            if (r1 != 0) goto L_0x03f4
            X.JbO r1 = r3.A0F
            X.0Aj r4 = X.C59899JbO.A01(r6, r1)
            if (r14 == 0) goto L_0x053c
            java.lang.String r1 = "seller_view_edit_product_button"
            X.DbS.A1I(r4, r1)
            r4.Cgf()
        L_0x03f2:
            r3.A0i = r0
        L_0x03f4:
            android.text.Editable r4 = r3.A03
            if (r4 == 0) goto L_0x0525
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r3.mCaption
            r1.setText(r4)
        L_0x03fd:
            boolean r1 = A0P(r3)
            if (r1 == 0) goto L_0x0627
            X.2eb r1 = r3.A0y
            r1.getClass()
            X.2eb r1 = r3.A0y
            android.view.View r5 = r1.A01()
            java.lang.Object r13 = r5.getTag()
            X.L8D r13 = (X.L8D) r13
            if (r13 != 0) goto L_0x0424
            X.L8D r13 = new X.L8D
            r13.<init>(r5)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r13.A02
            r1 = 0
            r4.setPageSpacing(r1)
            r5.setTag(r13)
        L_0x0424:
            X.3W1 r1 = r3.A0J
            if (r1 != 0) goto L_0x044b
            r3.requireArguments()
            X.1Xj r1 = r3.A0I
            int r4 = r1.A0o()
            X.1Xj r1 = r3.A0I
            boolean r1 = r1.A4o()
            X.3W1 r5 = new X.3W1
            r5.<init>(r4, r1)
            r3.A0J = r5
            android.os.Bundle r4 = r3.mArguments
            if (r4 != 0) goto L_0x050f
            r1 = 0
        L_0x0443:
            r5.A0B(r1)
            X.3W1 r1 = r3.A0J
            r1.A0D(r2)
        L_0x044b:
            X.LMp r12 = r3.A12
            X.1Xj r11 = r3.A0I
            X.3W1 r10 = r3.A0J
            java.util.HashMap r9 = r3.A0d
            java.util.HashMap r8 = r3.A0c
            java.util.HashMap r7 = r3.A0e
            java.util.List r6 = r3.A1B
            int r15 = X.DbW.A02(r0, r11, r10)
            r0 = 3
            X.C51974G9v.A0d(r0, r9, r8, r7, r6)
            X.AnonymousClass4FX.A01(r11, r10)
            X.3W1 r0 = r13.A00
            if (r0 == 0) goto L_0x047b
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x047b
            X.3W1 r1 = r13.A00
            if (r1 == 0) goto L_0x047b
            X.3TS r0 = r13.A01
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r0.A01()
            r1.A0S(r0)
        L_0x047b:
            r13.A00 = r10
            X.3TS r14 = r13.A01
            com.instagram.common.session.UserSession r5 = r12.A01
            boolean r4 = r11.A6W(r5)
            r1 = 0
            X.9IQ r0 = new X.9IQ
            r0.<init>(r1, r15, r2, r4)
            X.C250563lf.A0f(r0, r14, r10)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r13.A02
            r4.A0F()
            X.3uv r15 = r13.A03
            int r1 = r10.A03
            int r0 = r6.size()
            r15.A01(r1, r0)
            r4.A0P(r15)
            android.content.Context r0 = r12.A00
            r28 = r0
            X.2xS r15 = r12.A03
            X.5Dn r1 = r12.A02
            boolean r0 = r12.A04
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r0)
            X.Gdz r0 = new X.Gdz
            r21 = r10
            r22 = r15
            r24 = r9
            r25 = r8
            r26 = r7
            r27 = r6
            r20 = r3
            r18 = r1
            r19 = r11
            r16 = r14
            r17 = r5
            r14 = r0
            r15 = r28
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4.A0M(r2, r2)
            r4.setAdapter((android.widget.Adapter) r0)
            int r0 = r10.A03
            r4.A0K(r0)
            r4.setOverScrollOnEdgeItems(r2)
            X.KIB r0 = new X.KIB
            r17 = r11
            r14 = r0
            r15 = r13
            r16 = r12
            r18 = r10
            r19 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r4.A0P(r0)
            int r0 = r10.A03
            X.1Xj r0 = X.DbZ.A0T(r6, r0)
            if (r0 != 0) goto L_0x0505
            java.lang.String r1 = "EditMediaInfoCarouselMediaViewBinder"
            java.lang.String r0 = "Current carousel media is null."
            X.0wb.A03(r1, r0)
        L_0x04fc:
            X.4GT r0 = new X.4GT
            r0.<init>(r4)
            X.03v.A0B(r4, r0)
            return
        L_0x0505:
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x04fc
            X.C64095LMp.A00(r13, r12, r11, r10)
            goto L_0x04fc
        L_0x050f:
            r1 = 95
            java.lang.String r1 = X.C66579MXk.A00(r1)
            int r4 = r4.getInt(r1, r2)
            java.util.List r1 = r3.A1B
            int r1 = X.C51966G9m.A06(r1)
            int r1 = java.lang.Math.min(r4, r1)
            goto L_0x0443
        L_0x0525:
            X.1Xj r1 = r3.A0I
            X.3gp r1 = r1.A1T()
            if (r1 == 0) goto L_0x03fd
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r4 = r3.mCaption
            X.1Xj r1 = r3.A0I
            X.3gp r1 = r1.A1T()
            java.lang.String r1 = r1.A0d
            r4.setText(r1)
            goto L_0x03fd
        L_0x053c:
            java.lang.String r1 = "seller_view_add_purchase_button"
            X.DbS.A1I(r4, r1)
            r4.Cgf()
            goto L_0x03f2
        L_0x0546:
            r1 = 0
            goto L_0x0322
        L_0x0549:
            com.instagram.creation.channels.model.AddChannelsRowChannelInfo r8 = r3.A0C
            r7 = 0
            if (r8 != 0) goto L_0x0328
            X.3oV r4 = r3.A0A
            if (r4 == 0) goto L_0x037e
            r1 = 8
            r4.setVisibility(r1)
            goto L_0x037e
        L_0x0559:
            r16 = 2131957454(0x7f1316ce, float:1.9551492E38)
            java.lang.String r1 = "EE"
            java.lang.String r15 = X.C14240TsN.A04(r1, r6)
            java.lang.String r14 = "MMM d"
            java.lang.String r13 = X.C14240TsN.A04(r14, r6)
            java.lang.String r11 = X.C14240TsN.A01(r8, r6)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r6)
            java.lang.String r1 = X.C14240TsN.A03(r12, r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r15, r13, r11, r1}
            r1 = r16
            java.lang.String r11 = r8.getString(r1, r6)
            X.0qQ.A07(r11)
            r13 = 2131957422(0x7f1316ae, float:1.9551428E38)
            java.lang.String r7 = X.C14240TsN.A04(r14, r4)
            java.lang.String r6 = X.C14240TsN.A01(r8, r4)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            java.lang.String r1 = X.C14240TsN.A03(r12, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r6, r1}
            java.lang.String r1 = r8.getString(r13, r1)
            X.0qQ.A07(r1)
            r13 = 2131957431(0x7f1316b7, float:1.9551446E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r1}
            goto L_0x02e8
        L_0x05aa:
            java.lang.String r1 = X.C14240TsN.A02(r8, r12, r6)
            goto L_0x02ef
        L_0x05b0:
            r1.A02()
            goto L_0x02ff
        L_0x05b5:
            X.3oV r1 = r3.mReplaceGenAILabelStubber
            r1.setVisibility(r7)
            X.3oV r1 = r3.mAddGenAILabelStubber
            r1.setVisibility(r2)
            X.3oV r1 = r3.mAddGenAILabelStubber
            goto L_0x01fc
        L_0x05c3:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
            X.LZ1 r1 = new X.LZ1
            r1.<init>(r3, r7)
            r4.addOnPreDrawListener(r1)
            goto L_0x016e
        L_0x05d1:
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r1 = r3.A05
            if (r1 == 0) goto L_0x0606
            com.instagram.api.schemas.BrandedContentProjectAction r4 = r1.AYA()
            com.instagram.api.schemas.BrandedContentProjectAction r1 = com.instagram.api.schemas.BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT
            if (r4 != r1) goto L_0x0606
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r1 = r3.A05
            if (r1 == 0) goto L_0x0606
            android.content.Context r7 = r3.requireContext()
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r1 = r3.A05
            X.0qQ.A0B(r1, r0)
            java.lang.String r5 = r1.Ahf()
            java.lang.String r1 = r1.Ahm()
            com.instagram.user.model.User r4 = new com.instagram.user.model.User
            r4.<init>(r5, r1)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = new com.instagram.pendingmedia.model.BrandedContentTag
            r1.<init>((com.instagram.user.model.User) r4)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
            android.text.SpannableStringBuilder r5 = X.C49946FGa.A00(r7, r1)
            goto L_0x0139
        L_0x0606:
            boolean r4 = r3.A0q
            r1 = 2131952328(0x7f1302c8, float:1.9541096E38)
            if (r4 == 0) goto L_0x0610
            r1 = 2131969136(0x7f134470, float:1.9575186E38)
        L_0x0610:
            java.lang.String r1 = r3.getString(r1)
            r5.append(r1)
            goto L_0x0139
        L_0x0619:
            android.widget.TextView r1 = r3.mExtraLocationLabel
            X.0nA.A0O(r1)
            android.text.SpannableString r1 = r3.A00()
            r6.append(r1)
            goto L_0x0181
        L_0x0627:
            X.1Xj r1 = r3.A0I
            boolean r1 = r1.A56()
            if (r1 != 0) goto L_0x0782
            X.2eb r1 = r3.A0z
            r1.getClass()
            X.2eb r1 = r3.A0z
            android.view.View r5 = r1.A01()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r5
            r1 = 2131432198(0x7f0b1306, float:1.8486147E38)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = X.DbT.A0b(r5, r1)
            r1 = 2131432210(0x7f0b1312, float:1.848617E38)
            android.view.View r6 = r5.requireViewById(r1)
            X.1Xj r1 = r3.A0I
            boolean r1 = r1.CeS()
            if (r1 != 0) goto L_0x0665
            boolean r1 = r3.A0n
            if (r1 != 0) goto L_0x0665
            r1 = 2131432162(0x7f0b12e2, float:1.8486074E38)
            android.view.View r4 = r5.requireViewById(r1)
            r4.setVisibility(r2)
            android.view.View$OnClickListener r1 = r3.A18
            X.AnonymousClass0fU.A00(r1, r4)
        L_0x0665:
            X.1Xj r1 = r3.A0I
            boolean r1 = r1.A4o()
            if (r1 == 0) goto L_0x0770
            X.1Xj r1 = r3.A0I
            android.net.Uri r4 = r1.A05
            if (r4 == 0) goto L_0x0770
            r1 = -1
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.C253833rU.A00(r4, r1, r1)
        L_0x0678:
            r7.setUrl(r4, r3)
        L_0x067b:
            X.1Xj r1 = r3.A0I
            float r1 = r1.A0l()
            r5.A00 = r1
            A03(r5, r3)
            boolean r1 = r3.A0n
            if (r1 != 0) goto L_0x06f8
            r8 = 0
            X.1Xj r4 = r3.A0I
            com.instagram.common.session.UserSession r1 = r3.getSession()
            com.instagram.user.model.User r1 = r4.A2A(r1)
            if (r1 == 0) goto L_0x06a5
            X.1Xj r4 = r3.A0I
            com.instagram.common.session.UserSession r1 = r3.getSession()
            com.instagram.user.model.User r1 = r4.A2A(r1)
            java.lang.String r8 = r1.getId()
        L_0x06a5:
            r1 = 2131442441(0x7f0b3b09, float:1.8506922E38)
            android.view.View r11 = r5.requireViewById(r1)
            com.instagram.common.session.UserSession r10 = r3.getSession()
            X.1Xj r7 = r3.A0I
            boolean r1 = r3.A0M()
            if (r1 == 0) goto L_0x076c
            boolean r1 = A0O(r3)
            if (r1 == 0) goto L_0x076c
            java.util.ArrayList r13 = r3.A0a
            r4 = r13
            if (r13 != 0) goto L_0x0744
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
        L_0x06c7:
            java.util.ArrayList r14 = r3.A0b
            X.5Dn r12 = r3.A11
            java.util.ArrayList r15 = r3.A0Z
            X.LOQ r5 = X.LOQ.A00
            com.instagram.common.session.UserSession r4 = r3.getSession()
            X.1Xj r1 = r3.A0I
            boolean r1 = r1.A5G()
            boolean r4 = r5.A01(r4, r8, r1)
            boolean r1 = r7.CcK()
            if (r1 != 0) goto L_0x073e
            X.3QO r5 = r7.A1t()
            X.3QO r1 = X.AnonymousClass3QO.OPAL
            if (r5 == r1) goto L_0x073e
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = r12.A00
            boolean r1 = A0Q(r1)
            if (r1 == 0) goto L_0x0706
            r16 = r4
            X.C64190LSx.A03(r11, r12, r13, r14, r15, r16)
        L_0x06f8:
            X.1Xj r0 = r3.A0I
            X.1iA r1 = r0.BR7()
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x0782
            r6.setVisibility(r2)
            return
        L_0x0706:
            boolean r1 = X.C64190LSx.A05(r13)
            if (r1 != 0) goto L_0x0714
            boolean r1 = X.C64190LSx.A05(r15)
            if (r1 == 0) goto L_0x0718
            if (r4 == 0) goto L_0x0718
        L_0x0714:
            X.C64190LSx.A04(r11, r12, r13, r15, r4)
            goto L_0x06f8
        L_0x0718:
            boolean r1 = X.C64190LSx.A05(r14)
            if (r1 == 0) goto L_0x0722
            X.C64190LSx.A02(r11, r12, r14)
            goto L_0x06f8
        L_0x0722:
            boolean r1 = X.C367088qA.A01(r10)
            if (r1 == 0) goto L_0x0714
            r5 = 2131237848(0x7f081bd8, float:1.8091958E38)
            android.content.res.Resources r4 = r11.getResources()
            r1 = 2131974931(0x7f135b13, float:1.958694E38)
            java.lang.String r1 = r4.getString(r1)
            X.LY5 r0 = X.LY5.A00(r12, r0)
            X.C64190LSx.A00(r0, r11, r1, r5)
            goto L_0x06f8
        L_0x073e:
            r0 = 8
            r11.setVisibility(r0)
            goto L_0x06f8
        L_0x0744:
            java.util.ArrayList r1 = r3.A0Y
            if (r1 == 0) goto L_0x06c7
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r4.iterator()
        L_0x0750:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x06c7
            java.lang.Object r5 = r9.next()
            com.instagram.tagging.model.Tag r5 = (com.instagram.tagging.model.Tag) r5
            java.util.ArrayList r4 = r3.A0Y
            java.lang.String r1 = r5.getId()
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0750
            r13.add(r5)
            goto L_0x0750
        L_0x076c:
            java.util.ArrayList r13 = r3.A0a
            goto L_0x06c7
        L_0x0770:
            X.1Xj r4 = r3.A0I
            android.content.Context r1 = r3.requireContext()
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r4.A1n(r1)
            boolean r1 = X.C253833rU.A02(r4)
            if (r1 != 0) goto L_0x067b
            goto L_0x0678
        L_0x0782:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0H(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    public static void A0I(EditMediaInfoFragment editMediaInfoFragment, 1Xj r2) {
        if (r2 != null && editMediaInfoFragment.A0T != null && r2.A0C.AlM() != null && r2.A0C.AlM().BdV() != null) {
            if (editMediaInfoFragment.A0T.equals(r2.A0C.AlM().BdV().getPollId())) {
                r2.A0C.ER6((C272054k1) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.instagram.model.shopping.productcollection.ProductCollectionTagInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.instagram.model.shopping.productcollection.ProductCollectionTagInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: com.instagram.model.shopping.productcollection.ProductCollectionTagInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r41v2, types: [com.instagram.model.shopping.productcollection.ProductCollectionTagInfo] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0K(com.instagram.creation.fragment.EditMediaInfoFragment r52, boolean r53) {
        /*
            r5 = r52
            boolean r0 = r5.A0l
            if (r0 != 0) goto L_0x0012
            boolean r0 = r5.A0t
            if (r0 == 0) goto L_0x0012
            X.0hq r0 = r5.getParentFragmentManager()
            r0.A13()
        L_0x0011:
            return
        L_0x0012:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r5.mCaption
            if (r0 == 0) goto L_0x0273
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0273
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r5.mCaption
            java.lang.String r25 = X.AnonymousClass7TF.A0f(r0)
        L_0x0022:
            android.content.Context r26 = r5.requireContext()
            X.1Xj r0 = r5.A0I
            r30 = r0
            r30.getClass()
            com.instagram.common.session.UserSession r4 = r5.getSession()
            r32 = 0
            r1 = 0
            r0 = 0
            r27 = 0
            r22 = 0
            r15 = 0
            r19 = 0
            r21 = 0
            r13 = 0
            r20 = 0
            r37 = 0
            r2 = 0
            r3 = 0
            r17 = 0
            r6 = 3
            X.0qQ.A0B(r4, r6)
            r30.A5l()
            r14 = 0
            r6 = r25
            X.0qQ.A0B(r6, r14)
            com.instagram.model.venue.Venue r6 = r5.A0L
            r31 = r6
            boolean r6 = r5.A0q
            r52 = r6
            java.util.List r6 = r5.A1M
            r51 = r6
            java.util.List r6 = r5.A0g
            r50 = r6
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r6 = r5.A05
            r49 = r6
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r11 = r5.A04
            java.lang.String r23 = "edit_media_info"
            int r6 = r5.A0w
            r48 = r6
            int r6 = r5.A0v
            r47 = r6
            boolean r6 = r5.A15
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r6)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r9 = r5.A13
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r8 = r5.A0P
            r41 = 0
            if (r9 == 0) goto L_0x0254
            r10 = 0
            if (r8 == 0) goto L_0x024d
            java.lang.String r12 = r8.A01
            java.lang.String r7 = r9.A01
            boolean r6 = r12.equals(r7)
            if (r6 == 0) goto L_0x0095
            boolean r10 = r9.A05
            boolean r6 = r8.A05
            if (r10 == r6) goto L_0x026f
        L_0x0095:
            com.instagram.api.schemas.ProductCollectionV2Type r6 = r8.A00
            com.instagram.api.schemas.ProductCollectionV2Type r9 = r9.A00
            boolean r10 = r8.A05
            if (r6 == 0) goto L_0x00a1
            java.lang.String r41 = r6.toString()
        L_0x00a1:
            java.lang.String r43 = r9.toString()
            java.lang.Boolean r39 = java.lang.Boolean.valueOf(r10)
            com.instagram.model.shopping.productcollection.ProductCollectionTagInfo r6 = new com.instagram.model.shopping.productcollection.ProductCollectionTagInfo
            r38 = r6
            r40 = r12
            r42 = r7
            r38.<init>(r39, r40, r41, r42, r43)
        L_0x00b4:
            com.instagram.music.common.model.AudioOverlayTrack r7 = r5.A0M
            if (r7 == 0) goto L_0x00be
            r32 = r7
            java.lang.String r7 = r5.A0S
            r22 = r7
        L_0x00be:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r7 = r5.A06
            if (r7 == 0) goto L_0x00c4
            r27 = r7
        L_0x00c4:
            X.1Xj r7 = r5.A0I
            r7.getClass()
            boolean r7 = A0P(r5)
            if (r7 == 0) goto L_0x023e
            java.util.HashMap r13 = r5.A0d
            java.util.HashMap r0 = r5.A0c
            r21 = r0
            java.util.HashMap r0 = r5.A0e
            r20 = r0
            java.util.LinkedHashMap r0 = r5.A0f
            r19 = r0
            java.util.List r0 = r5.A1C
            X.0qQ.A0B(r0, r14)
            java.util.ArrayList r8 = r5.A0Y
        L_0x00e4:
            X.Jj3 r7 = r5.A0B
            r16 = 0
            if (r7 == 0) goto L_0x014a
            java.lang.String r18 = r7.A02()
            if (r18 != 0) goto L_0x0238
            X.0sn r37 = X.0sn.A00
        L_0x00f2:
            X.1Xj r7 = r5.A0I
            X.1Xy r7 = r7.A0C
            X.47o r7 = r7.Amn()
            if (r7 == 0) goto L_0x0235
            X.1Xj r7 = r5.A0I
            X.1Xy r7 = r7.A0C
            X.47o r7 = r7.Amn()
            java.lang.String r12 = r7.C6E()
        L_0x0108:
            if (r18 != 0) goto L_0x01c3
            if (r12 == 0) goto L_0x014a
            com.instagram.common.session.UserSession r7 = r5.getSession()
            X.6gx r9 = X.C313746gw.A00(r7)
            X.1Ln r10 = X.DbT.A0J(r9)
            boolean r7 = X.DbT.A1Y(r10)
            if (r7 == 0) goto L_0x014a
            X.DbW.A17(r10, r9)
            java.lang.String r7 = "remove_channel_from_post"
            X.DbV.A1M(r10, r7)
            java.lang.String r7 = "done_button"
            r10.A0p(r7)
            java.lang.String r7 = "existing_post_editor"
            X.Dba.A1E(r10, r7)
            r10.A0s(r1)
            X.JTT.A1F(r10, r9, r1)
            java.util.List r7 = X.AnonymousClass7TE.A1I(r12)
            java.lang.String r9 = r7.toString()
            java.lang.String r7 = "ig_thread_ids"
            java.util.Map r7 = X.AnonymousClass7TF.A0w(r7, r9)
            r10.A0w(r7)
            r10.Cgf()
        L_0x014a:
            X.1Xj r7 = r5.A0I
            X.1Xy r7 = r7.A0C
            X.1eb r7 = r7.BFi()
            X.Juw r9 = r5.A0D
            if (r7 == 0) goto L_0x01bc
            if (r9 != 0) goto L_0x01b7
            X.Juw r9 = X.C60289Jil.A0D
            r5.A0D = r9
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r9.A01 = r7
            X.1Xj r7 = r5.A0I
            X.1Xy r7 = r7.A0C
            r7.EZW(r1)
        L_0x0167:
            X.Juw r9 = r5.A0D
            if (r9 == 0) goto L_0x0170
            java.lang.Integer r7 = r9.A01
            if (r7 == 0) goto L_0x0170
            r1 = r9
        L_0x0170:
            com.instagram.common.session.UserSession r7 = r5.getSession()
            X.0wc r9 = X.AnonymousClass0kN.A01(r5, r7)
            java.lang.String r7 = "profile_grid_edit_post_done_clicked"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r9, r7)
            boolean r7 = r9.isSampled()
            if (r7 == 0) goto L_0x0195
            r7 = r23
            X.DbS.A1O(r9, r7)
            java.lang.String r7 = X.DbS.A0k()
            if (r7 == 0) goto L_0x0192
            X.C51965G9l.A1K(r9, r7)
        L_0x0192:
            r9.Cgf()
        L_0x0195:
            boolean r7 = r30.A56()
            if (r7 == 0) goto L_0x043a
            r28 = r4
            r29 = r1
            r34 = r25
            r35 = r22
            r36 = r0
            r38 = r48
            r39 = r47
            X.1NY r7 = X.LS0.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r30.A3M()
            java.lang.String r3 = "EditMediaInfoUtil"
            r2 = 0
            if (r13 == 0) goto L_0x02bd
            goto L_0x0277
        L_0x01b7:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            r9.A01 = r7
            goto L_0x0167
        L_0x01bc:
            if (r9 == 0) goto L_0x0167
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r9.A01 = r7
            goto L_0x0167
        L_0x01c3:
            com.instagram.common.session.UserSession r7 = r5.getSession()
            X.6gx r9 = X.C313746gw.A00(r7)
            X.1Ln r10 = X.DbT.A0J(r9)
            boolean r7 = X.DbT.A1Y(r10)
            if (r12 != 0) goto L_0x0205
            if (r7 == 0) goto L_0x014a
            X.DbW.A17(r10, r9)
            java.lang.String r7 = "shared_post_with_tagged_channels"
            X.DbV.A1M(r10, r7)
            java.lang.String r7 = "done_button"
            r10.A0p(r7)
            java.lang.String r7 = "existing_post_editor"
            X.Dba.A1E(r10, r7)
            r10.A0s(r1)
            X.JTT.A1F(r10, r9, r1)
            java.util.List r7 = X.AnonymousClass7TE.A1I(r18)
            java.lang.String r9 = r7.toString()
            java.lang.String r7 = "ig_thread_ids"
            java.util.Map r7 = X.AnonymousClass7TF.A0w(r7, r9)
            r10.A0w(r7)
            r10.Cgf()
            goto L_0x014a
        L_0x0205:
            if (r7 == 0) goto L_0x014a
            X.DbW.A17(r10, r9)
            java.lang.String r7 = "shared_post_with_tagged_channels"
            X.DbV.A1M(r10, r7)
            java.lang.String r7 = "done_after_edit_button"
            r10.A0p(r7)
            java.lang.String r7 = "existing_post_editor"
            X.Dba.A1E(r10, r7)
            r10.A0s(r1)
            X.JTT.A1F(r10, r9, r1)
            java.util.List r7 = X.AnonymousClass7TE.A1I(r18)
            java.lang.String r9 = r7.toString()
            java.lang.String r7 = "ig_thread_ids"
            java.util.Map r7 = X.AnonymousClass7TF.A0w(r7, r9)
            r10.A0w(r7)
            r10.Cgf()
            goto L_0x014a
        L_0x0235:
            r12 = r1
            goto L_0x0108
        L_0x0238:
            java.util.List r37 = X.AnonymousClass7TE.A1I(r18)
            goto L_0x00f2
        L_0x023e:
            java.util.ArrayList r3 = r5.A0a
            java.util.ArrayList r8 = r5.A0Y
            java.util.ArrayList r2 = r5.A0Z
            java.util.ArrayList r7 = r5.A0b
            r17 = r7
            java.lang.String r7 = r5.A0U
            r15 = r7
            goto L_0x00e4
        L_0x024d:
            java.lang.String r7 = r9.A01
            com.instagram.api.schemas.ProductCollectionV2Type r9 = r9.A00
            r12 = r1
            goto L_0x00a1
        L_0x0254:
            if (r8 == 0) goto L_0x026f
            java.lang.String r6 = r8.A01
            com.instagram.api.schemas.ProductCollectionV2Type r7 = r8.A00
            java.lang.String r44 = r7.toString()
            boolean r7 = r8.A05
            java.lang.Boolean r42 = java.lang.Boolean.valueOf(r7)
            com.instagram.model.shopping.productcollection.ProductCollectionTagInfo r41 = new com.instagram.model.shopping.productcollection.ProductCollectionTagInfo
            r43 = r6
            r45 = r1
            r46 = r1
            r41.<init>(r42, r43, r44, r45, r46)
        L_0x026f:
            r6 = r41
            goto L_0x00b4
        L_0x0273:
            java.lang.String r25 = ""
            goto L_0x0022
        L_0x0277:
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x02b7 }
            java.util.HashMap r1 = r30.A3M()     // Catch:{ IOException -> 0x02b7 }
            java.util.Set r1 = r1.keySet()     // Catch:{ IOException -> 0x02b7 }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ IOException -> 0x02b7 }
        L_0x0287:
            boolean r1 = r15.hasNext()     // Catch:{ IOException -> 0x02b7 }
            if (r1 == 0) goto L_0x02ad
            java.lang.Object r12 = X.AnonymousClass7TF.A0a(r15)     // Catch:{ IOException -> 0x02b7 }
            java.util.HashMap r1 = r30.A3M()     // Catch:{ IOException -> 0x02b7 }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ IOException -> 0x02b7 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ IOException -> 0x02b7 }
            java.lang.Object r14 = r13.get(r12)     // Catch:{ IOException -> 0x02b7 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ IOException -> 0x02b7 }
            java.util.ArrayList r9 = X.C63461KxQ.A00(r1, r14)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r1 = com.instagram.tagging.model.TagSerializer.A01(r14, r9, r2)     // Catch:{ IOException -> 0x02b7 }
            r10.put(r12, r1)     // Catch:{ IOException -> 0x02b7 }
            goto L_0x0287
        L_0x02ad:
            java.lang.String r9 = "children_usertags"
            java.lang.String r1 = X.JTQ.A0c(r10)     // Catch:{ IOException -> 0x02b7 }
            r7.AA0(r9, r1)     // Catch:{ IOException -> 0x02b7 }
            goto L_0x02bd
        L_0x02b7:
            r9 = move-exception
            java.lang.String r1 = "Unable to parse carousel people tag"
            X.0KC.A0F(r3, r1, r9)
        L_0x02bd:
            r30.A3L()
            if (r21 == 0) goto L_0x0320
            java.util.HashMap r14 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x031a }
            java.util.HashMap r1 = r30.A3L()     // Catch:{ IOException -> 0x031a }
            java.util.Set r1 = r1.keySet()     // Catch:{ IOException -> 0x031a }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ IOException -> 0x031a }
        L_0x02d2:
            boolean r1 = r17.hasNext()     // Catch:{ IOException -> 0x031a }
            if (r1 == 0) goto L_0x0308
            java.lang.Object r13 = X.AnonymousClass7TF.A0a(r17)     // Catch:{ IOException -> 0x031a }
            java.util.HashMap r1 = r30.A3L()     // Catch:{ IOException -> 0x031a }
            java.lang.Object r12 = r1.get(r13)     // Catch:{ IOException -> 0x031a }
            java.util.List r12 = (java.util.List) r12     // Catch:{ IOException -> 0x031a }
            r1 = r21
            java.lang.Object r15 = r1.get(r13)     // Catch:{ IOException -> 0x031a }
            java.util.List r15 = (java.util.List) r15     // Catch:{ IOException -> 0x031a }
            java.util.ArrayList r10 = X.C63461KxQ.A00(r12, r15)     // Catch:{ IOException -> 0x031a }
            X.LOQ r9 = X.LOQ.A00     // Catch:{ IOException -> 0x031a }
            java.lang.String r9 = r9.A00(r12, r15, r10, r2)     // Catch:{ IOException -> 0x031a }
            int r1 = r9.length()     // Catch:{ IOException -> 0x031a }
            if (r1 <= 0) goto L_0x02d2
            boolean r1 = X.C51966G9m.A1X(r9)     // Catch:{ IOException -> 0x031a }
            if (r1 == 0) goto L_0x02d2
            r14.put(r13, r9)     // Catch:{ IOException -> 0x031a }
            goto L_0x02d2
        L_0x0308:
            boolean r1 = r14.isEmpty()     // Catch:{ IOException -> 0x031a }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0320
            java.lang.String r9 = "children_fb_user_tags"
            java.lang.String r1 = X.JTQ.A0c(r14)     // Catch:{ IOException -> 0x031a }
            r7.AA0(r9, r1)     // Catch:{ IOException -> 0x031a }
            goto L_0x0320
        L_0x031a:
            r9 = move-exception
            java.lang.String r1 = "Unable to parse carousel fbUser tag"
            X.0KC.A0F(r3, r1, r9)
        L_0x0320:
            r30.A3N()
            if (r20 == 0) goto L_0x039d
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r1 = r30.A3N()
            java.util.Iterator r15 = X.AnonymousClass7TF.A0s(r1)
        L_0x0335:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0377
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r15)
            java.lang.Object r12 = r1.getKey()
            java.lang.Object r13 = r1.getValue()
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r1 = r20
            java.lang.Object r14 = r1.get(r12)
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            if (r14 != 0) goto L_0x0355
            X.0sn r14 = X.0sn.A00
        L_0x0355:
            if (r13 == 0) goto L_0x0362
            r1 = r30
            java.lang.String r1 = X.LS0.A01(r4, r1, r5, r13, r14)
            if (r1 == 0) goto L_0x0362
            r10.put(r12, r1)
        L_0x0362:
            if (r6 == 0) goto L_0x0335
            java.io.StringWriter r13 = X.JTO.A0v()
            X.17W r1 = X.JTO.A0Q(r13)
            X.C63337KvK.A00(r1, r6)
            java.lang.String r1 = X.JTR.A12(r1, r13)
            r9.put(r12, r1)
            goto L_0x0335
        L_0x0377:
            boolean r1 = r10.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x038c
            java.lang.String r6 = X.JTQ.A0c(r10)
            r1 = 2155(0x86b, float:3.02E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r7.AA0(r1, r6)
        L_0x038c:
            boolean r1 = r9.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x039d
            java.lang.String r6 = X.JTQ.A0c(r9)
            java.lang.String r1 = "children_product_collection_tag"
            r7.AA0(r1, r6)
        L_0x039d:
            if (r19 == 0) goto L_0x03c9
            if (r0 == 0) goto L_0x03c9
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r19)
        L_0x03a9:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x03cb
            java.util.Map$Entry r10 = X.AnonymousClass7TE.A1J(r12)
            java.lang.String r9 = X.DbT.A13(r10)
            r1 = 95
            java.lang.String r1 = X.00l.A0J(r9, r9, r1)
            boolean r1 = r0.contains(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x03a9
            X.JTR.A1U(r6, r10)
            goto L_0x03a9
        L_0x03c9:
            r6 = r19
        L_0x03cb:
            X.0Tu r9 = X.0Tu.A05     // Catch:{ IOException -> 0x0589 }
            r0 = 36313012185859681(0x81027e00100661, double:3.027833354876684E-306)
            boolean r0 = X.182.A06(r9, r4, r0)     // Catch:{ IOException -> 0x0589 }
            if (r0 == 0) goto L_0x058f
            java.util.List r0 = r30.A3V()     // Catch:{ IOException -> 0x0589 }
            if (r0 == 0) goto L_0x03e2
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ IOException -> 0x0589 }
        L_0x03e2:
            java.util.List r0 = r30.A3R()     // Catch:{ IOException -> 0x0589 }
            if (r2 == 0) goto L_0x03f0
            r2.addAll(r0)     // Catch:{ IOException -> 0x0589 }
            java.util.HashSet r1 = X.00k.A0V(r2)     // Catch:{ IOException -> 0x0589 }
            goto L_0x03f2
        L_0x03f0:
            X.0sl r1 = X.0sl.A00     // Catch:{ IOException -> 0x0589 }
        L_0x03f2:
            if (r8 == 0) goto L_0x03f5
            goto L_0x03f8
        L_0x03f5:
            X.0sl r0 = X.0sl.A00     // Catch:{ IOException -> 0x0589 }
            goto L_0x03fc
        L_0x03f8:
            java.util.HashSet r0 = X.00k.A0V(r8)     // Catch:{ IOException -> 0x0589 }
        L_0x03fc:
            java.util.Set r10 = X.094.A02(r1, r0)     // Catch:{ IOException -> 0x0589 }
            java.util.Set r9 = X.094.A02(r0, r1)     // Catch:{ IOException -> 0x0589 }
            boolean r0 = r10.isEmpty()     // Catch:{ IOException -> 0x0589 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0414
            boolean r0 = r9.isEmpty()     // Catch:{ IOException -> 0x0589 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x058f
        L_0x0414:
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()     // Catch:{ IOException -> 0x0589 }
            java.util.Iterator r2 = r10.iterator()     // Catch:{ IOException -> 0x0589 }
        L_0x041c:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0589 }
            if (r0 == 0) goto L_0x042f
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0589 }
            android.graphics.PointF r0 = new android.graphics.PointF     // Catch:{ IOException -> 0x0589 }
            r0.<init>()     // Catch:{ IOException -> 0x0589 }
            r8.put(r1, r0)     // Catch:{ IOException -> 0x0589 }
            goto L_0x041c
        L_0x042f:
            java.lang.String r1 = "coauthor_invites"
            java.lang.String r0 = com.instagram.tagging.model.TagSerializer.A02(r8, r10, r9)     // Catch:{ IOException -> 0x0589 }
            r7.A9m(r1, r0)     // Catch:{ IOException -> 0x0589 }
            goto L_0x058f
        L_0x043a:
            java.lang.String r9 = "container_module"
            java.lang.String r7 = "EditMediaInfoUtil"
            r28 = r4
            r29 = r1
            r34 = r25
            r35 = r22
            r36 = r0
            r38 = r48
            r39 = r47
            X.1NY r10 = X.LS0.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.util.ArrayList r1 = r30.A3E()     // Catch:{ IOException -> 0x04ec }
            java.util.ArrayList r12 = X.C63461KxQ.A00(r1, r3)     // Catch:{ IOException -> 0x04ec }
            r0 = r3
            if (r1 != 0) goto L_0x045e
            if (r3 != 0) goto L_0x0472
            goto L_0x0470
        L_0x045e:
            if (r3 != 0) goto L_0x0463
            X.0sn r0 = X.0sn.A00     // Catch:{ IOException -> 0x04ec }
            goto L_0x0472
        L_0x0463:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ IOException -> 0x04ec }
            r0.<init>(r3)     // Catch:{ IOException -> 0x04ec }
            r0.removeAll(r1)     // Catch:{ IOException -> 0x04ec }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ IOException -> 0x04ec }
            goto L_0x0472
        L_0x0470:
            X.0sn r0 = X.0sn.A00     // Catch:{ IOException -> 0x04ec }
        L_0x0472:
            java.lang.String r1 = "usertags"
            java.lang.String r0 = com.instagram.tagging.model.TagSerializer.A01(r3, r12, r0)     // Catch:{ IOException -> 0x04ec }
            r10.A9m(r1, r0)     // Catch:{ IOException -> 0x04ec }
            r0 = r23
            r10.A9m(r9, r0)     // Catch:{ IOException -> 0x04ec }
            if (r8 == 0) goto L_0x04f2
            boolean r0 = r8.isEmpty()     // Catch:{ IOException -> 0x04ec }
            if (r0 != 0) goto L_0x04f2
            r0 = r30
            X.1Xy r0 = r0.A0C     // Catch:{ IOException -> 0x04ec }
            X.DSX r0 = r0.Aqj()     // Catch:{ IOException -> 0x04ec }
            if (r0 == 0) goto L_0x04b6
            boolean r0 = X.C271174i4.A04(r4, r14)     // Catch:{ IOException -> 0x04ec }
            if (r0 == 0) goto L_0x04b6
        L_0x0498:
            java.util.List r0 = r30.A3V()     // Catch:{ IOException -> 0x04ec }
            if (r0 == 0) goto L_0x04b3
            java.util.HashSet r0 = X.00k.A0V(r0)     // Catch:{ IOException -> 0x04ec }
        L_0x04a2:
            java.util.HashSet r1 = X.00k.A0V(r8)     // Catch:{ IOException -> 0x04ec }
            java.util.Set r13 = X.094.A02(r0, r1)     // Catch:{ IOException -> 0x04ec }
            java.util.Set r12 = X.094.A02(r1, r0)     // Catch:{ IOException -> 0x04ec }
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()     // Catch:{ IOException -> 0x04ec }
            goto L_0x04c4
        L_0x04b3:
            X.0sl r0 = X.0sl.A00     // Catch:{ IOException -> 0x04ec }
            goto L_0x04a2
        L_0x04b6:
            X.0Tu r12 = X.0Tu.A05     // Catch:{ IOException -> 0x04ec }
            r0 = 36313012185728608(0x81027e000e0660, double:3.027833354793793E-306)
            boolean r0 = X.182.A06(r12, r4, r0)     // Catch:{ IOException -> 0x04ec }
            if (r0 == 0) goto L_0x04f2
            goto L_0x0498
        L_0x04c4:
            if (r3 == 0) goto L_0x04e2
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x04ec }
        L_0x04ca:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x04ec }
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r0 = r3.next()     // Catch:{ IOException -> 0x04ec }
            com.instagram.tagging.model.Tag r0 = (com.instagram.tagging.model.Tag) r0     // Catch:{ IOException -> 0x04ec }
            android.graphics.PointF r1 = r0.A00     // Catch:{ IOException -> 0x04ec }
            if (r1 == 0) goto L_0x04ca
            java.lang.String r0 = r0.getId()     // Catch:{ IOException -> 0x04ec }
            r8.put(r0, r1)     // Catch:{ IOException -> 0x04ec }
            goto L_0x04ca
        L_0x04e2:
            java.lang.String r1 = "coauthor_invites"
            java.lang.String r0 = com.instagram.tagging.model.TagSerializer.A02(r8, r13, r12)     // Catch:{ IOException -> 0x04ec }
            r10.A9m(r1, r0)     // Catch:{ IOException -> 0x04ec }
            goto L_0x04f2
        L_0x04ec:
            r1 = move-exception
            java.lang.String r0 = "Unable to parse people tag"
            X.0KC.A0F(r7, r0, r1)
        L_0x04f2:
            java.util.ArrayList r8 = r30.A39()     // Catch:{ IOException -> 0x0531 }
            java.util.ArrayList r3 = X.C63461KxQ.A00(r8, r2)     // Catch:{ IOException -> 0x0531 }
            r1 = r2
            if (r8 != 0) goto L_0x0500
            if (r2 != 0) goto L_0x0514
            goto L_0x0512
        L_0x0500:
            if (r2 != 0) goto L_0x0505
            X.0sn r1 = X.0sn.A00     // Catch:{ IOException -> 0x0531 }
            goto L_0x0514
        L_0x0505:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ IOException -> 0x0531 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0531 }
            r0.removeAll(r8)     // Catch:{ IOException -> 0x0531 }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ IOException -> 0x0531 }
            goto L_0x0514
        L_0x0512:
            X.0sn r1 = X.0sn.A00     // Catch:{ IOException -> 0x0531 }
        L_0x0514:
            X.LOQ r0 = X.LOQ.A00     // Catch:{ IOException -> 0x0531 }
            java.lang.String r1 = r0.A00(r8, r2, r3, r1)     // Catch:{ IOException -> 0x0531 }
            int r0 = r1.length()     // Catch:{ IOException -> 0x0531 }
            if (r0 <= 0) goto L_0x052b
            boolean r0 = X.C51966G9m.A1X(r1)     // Catch:{ IOException -> 0x0531 }
            if (r0 == 0) goto L_0x052b
            java.lang.String r0 = "fb_user_tags"
            r10.A9m(r0, r1)     // Catch:{ IOException -> 0x0531 }
        L_0x052b:
            r0 = r23
            r10.A9m(r9, r0)     // Catch:{ IOException -> 0x0531 }
            goto L_0x0537
        L_0x0531:
            r1 = move-exception
            java.lang.String r0 = "Unable to parse fbUser tag"
            X.0KC.A0F(r7, r0, r1)
        L_0x0537:
            java.util.ArrayList r2 = r30.A3G()
            if (r2 != 0) goto L_0x053f
            X.0sn r2 = X.0sn.A00
        L_0x053f:
            if (r17 == 0) goto L_0x054e
            r1 = r30
            r0 = r17
            java.lang.String r1 = X.LS0.A01(r4, r1, r5, r2, r0)
            java.lang.String r0 = "product_tags"
            r10.A9m(r0, r1)
        L_0x054e:
            if (r6 == 0) goto L_0x0568
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C63337KvK.A00(r0, r6)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            r0 = 3780(0xec4, float:5.297E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x0568:
            r2 = r51
            r1 = r50
            r0 = r52
            X.LSV.A04(r10, r4, r2, r1, r0)
            r0 = r49
            X.LSV.A03(r10, r0)
            if (r11 == 0) goto L_0x057b
            X.LSV.A02(r10, r11)
        L_0x057b:
            r0 = 1257(0x4e9, float:1.761E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r10.A0G(r1, r15)
            X.1OC r3 = r10.A0M()
            goto L_0x05b5
        L_0x0589:
            r1 = move-exception
            java.lang.String r0 = "Unable to parse collaborators"
            X.0KC.A0F(r3, r0, r1)
        L_0x058f:
            if (r6 == 0) goto L_0x0597
            java.lang.String r3 = X.JTQ.A0c(r6)
            if (r3 != 0) goto L_0x0599
        L_0x0597:
            java.lang.String r3 = ""
        L_0x0599:
            r2 = r51
            r1 = r50
            r0 = r52
            X.LSV.A04(r7, r4, r2, r1, r0)
            r0 = r49
            X.LSV.A03(r7, r0)
            if (r11 == 0) goto L_0x05ac
            X.LSV.A02(r7, r11)
        L_0x05ac:
            java.lang.String r0 = "children_custom_accessibility_caption"
            r7.AA0(r0, r3)
            X.1OC r3 = r7.A0M()
        L_0x05b5:
            X.1Xj r0 = r5.A0I
            r2 = 0
            if (r0 == 0) goto L_0x05f4
            X.3gp r0 = r0.A1T()
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x0623
            r0 = r4
        L_0x05c3:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r5.mCaption
            if (r1 == 0) goto L_0x05d3
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x05d3
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r5.mCaption
            java.lang.String r4 = X.AnonymousClass7TF.A0f(r1)
        L_0x05d3:
            boolean r0 = r4.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x05f4
            X.1Xj r0 = r5.A0I
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.ApT()
            java.lang.Integer r1 = X.C49157EqO.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x05f3
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x05f3
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x05f4
        L_0x05f3:
            r2 = 1
        L_0x05f4:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A0M
            if (r0 == 0) goto L_0x05fc
            java.lang.String r0 = r0.A0A
            r16 = r0
        L_0x05fc:
            X.KAa r1 = new X.KAa
            r4 = r53
            r0 = r16
            r1.<init>(r5, r0, r4, r2)
            r3.A00 = r1
            r5.schedule(r3)
            java.lang.String r0 = r5.A0R
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r5.A0T
            if (r0 == 0) goto L_0x0011
            com.instagram.common.session.UserSession r3 = r5.getSession()
            java.lang.String r2 = r5.A0R
            java.lang.String r1 = r5.A0T
            X.KAW r0 = new X.KAW
            r0.<init>(r5)
            X.AnonymousClass3YY.A03(r0, r3, r5, r2, r1)
            return
        L_0x0623:
            X.1Xj r0 = r5.A0I
            X.3gp r0 = r0.A1T()
            java.lang.String r0 = r0.A0d
            goto L_0x05c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0K(com.instagram.creation.fragment.EditMediaInfoFragment, boolean):void");
    }

    public static void A0L(EditMediaInfoFragment editMediaInfoFragment, boolean z) {
        editMediaInfoFragment.A16 = z;
        if (editMediaInfoFragment.mView != null) {
            Dba.A0A(editMediaInfoFragment).setIsLoading(editMediaInfoFragment.A16);
        }
    }

    public static boolean A0N(EditMediaInfoFragment editMediaInfoFragment) {
        1Xj r0 = editMediaInfoFragment.A0I;
        if (r0 == null || r0.A0C.Aqj() == null || editMediaInfoFragment.A0I.A0C.Aqj().Bpd() == null) {
            return false;
        }
        return true;
    }

    public static boolean A0O(EditMediaInfoFragment editMediaInfoFragment) {
        if (editMediaInfoFragment.A0I != null) {
            UserSession session = editMediaInfoFragment.getSession();
            if (!182.A06(AnonymousClass7TF.A0H(session), session, 2342156021399881315L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0P(EditMediaInfoFragment editMediaInfoFragment) {
        1Xj r0 = editMediaInfoFragment.A0I;
        if (r0 != null && r0.A56()) {
            return true;
        }
        1Xj r02 = editMediaInfoFragment.A0I;
        if (r02 == null || r02.A0C.Aqj() == null || editMediaInfoFragment.A0I.A0C.Alu() == null || editMediaInfoFragment.A0I.A0C.Alu().size() <= 0) {
            return false;
        }
        return true;
    }

    public final TextView A0S() {
        TextView textView = this.mExtraLocationLabel;
        if (textView != null) {
            return textView;
        }
        this.mView.getClass();
        TextView textView2 = (TextView) DbY.A0F(this.mView, R.id.extra_location_label_stub);
        this.mExtraLocationLabel = textView2;
        return textView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (A0O(r13) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T() {
        /*
            r13 = this;
            X.1Xj r0 = r13.A0I
            r0.getClass()
            android.content.Context r1 = r13.requireContext()
            X.Kj1 r0 = X.C62630Kj1.PEOPLE
            X.LRj r3 = new X.LRj
            r3.<init>(r1, r0)
            com.instagram.common.session.UserSession r0 = r13.getSession()
            r3.A03(r0)
            r2 = 1
            r3.A0B = r2
            X.C64167LRj.A01(r13, r3)
            boolean r0 = A0Q(r13)
            r3.A0J = r0
            X.1Xj r0 = r13.A0I
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.ApT()
            r3.A04 = r0
            boolean r0 = r13.A0M()
            if (r0 == 0) goto L_0x0045
            boolean r0 = A0P(r13)
            if (r0 != 0) goto L_0x0040
            boolean r1 = A0O(r13)
            r0 = 0
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 1
        L_0x0041:
            r3.A0I = r2
            r3.A0H = r0
        L_0x0045:
            boolean r0 = A0P(r13)
            if (r0 == 0) goto L_0x0067
            X.C64167LRj.A00(r13, r3)
        L_0x004e:
            android.content.Intent r2 = r3.A02()
            com.instagram.common.session.UserSession r0 = r13.getSession()
            X.2cc r1 = X.C71342cb.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            r1.A06(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            X.0kR.A05(r13, r2, r0)
            return
        L_0x0067:
            X.1Xj r4 = r13.A0I
            java.util.ArrayList r6 = r13.A0a
            java.util.ArrayList r7 = r13.A0W
            java.util.ArrayList r8 = r13.A0b
            java.util.List r10 = r13.A0g
            java.util.ArrayList r11 = r13.A0Y
            java.util.ArrayList r12 = r13.A0X
            java.lang.String r5 = r13.A0V
            java.util.ArrayList r9 = r13.A0Z
            r3.A07(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0T():void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r3.A0r != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            X.Jbl r2 = new X.Jbl
            r2.<init>()
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131961455(0x7f13266f, float:1.9559607E38)
            X.C59922Jbl.A02(r1, r2, r0)
            r1 = 32
            X.LYB r0 = new X.LYB
            r0.<init>((com.instagram.creation.fragment.EditMediaInfoFragment) r3, (int) r1)
            com.instagram.actionbar.ActionButton r2 = X.C59904JbT.A00(r0, r4, r2)
            boolean r0 = r3.A0m
            if (r0 == 0) goto L_0x0028
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x0028:
            boolean r0 = r3.A16
            r4.setIsLoading(r0)
            boolean r0 = r3.A0l
            if (r0 != 0) goto L_0x0035
            boolean r0 = r3.A0t
            if (r0 == 0) goto L_0x003a
        L_0x0035:
            boolean r1 = r3.A0r
            r0 = 1
            if (r1 == 0) goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            r2.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.configureActionBar(X.2da):void");
    }

    private SpannableString A00() {
        String string = getString(2131952305);
        if (this.A0u) {
            string = getString(2131952305);
        } else {
            Venue venue = this.A0L;
            if (venue == null) {
                1Xj r0 = this.A0I;
                if (!(r0 == null || r0.A23() == null)) {
                    venue = this.A0I.A23();
                    this.A0L = venue;
                }
            }
            string = venue.A00.getName();
        }
        if (string == null) {
            string = "";
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C60014JdN(this, 1), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static void A01(Activity activity, EditMediaInfoFragment editMediaInfoFragment) {
        C358248ab A0X2 = DbS.A0X(activity);
        A0X2.A09(2131961440);
        A0X2.A0J(LV3.A00(editMediaInfoFragment, 50), 2131968772);
        A0X2.A0G(LV3.A00(editMediaInfoFragment, 51), 2131953556);
        A0X2.A0r(true);
        LV8.A00(A0X2, editMediaInfoFragment, 6);
        DbT.A1V(A0X2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (X.0mp.A0G(r2.A02(), r9.A0I.A0C.Amn().C6E()) != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (A0R(r5.A3I(), r2) != false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(com.instagram.creation.fragment.EditMediaInfoFragment r9) {
        /*
            boolean r0 = r9.isVisible()
            if (r0 == 0) goto L_0x0110
            X.1Xj r0 = r9.A0I
            if (r0 == 0) goto L_0x0110
            X.3gp r0 = r0.A1T()
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x0150
            r0 = r6
        L_0x0013:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r9.mCaption
            if (r1 == 0) goto L_0x0023
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0023
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r9.mCaption
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r1)
        L_0x0023:
            boolean r1 = A0P(r9)
            r7 = 0
            if (r1 == 0) goto L_0x0127
            java.util.List r1 = r9.A1B
            java.util.Iterator r8 = r1.iterator()
        L_0x0030:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0124
            X.1Xj r5 = X.C51966G9m.A0t(r8)
            java.lang.String r2 = r5.getId()
            java.util.HashMap r1 = r9.A0d
            java.lang.Object r4 = r1.get(r2)
            java.util.List r4 = (java.util.List) r4
            java.util.HashMap r1 = r9.A0e
            java.lang.Object r3 = r1.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.util.HashMap r1 = r9.A0c
            java.lang.Object r2 = r1.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r1 = r5.A3E()
            boolean r1 = A0R(r1, r4)
            if (r1 != 0) goto L_0x0074
            java.util.ArrayList r1 = r5.A3G()
            boolean r1 = A0R(r1, r3)
            if (r1 != 0) goto L_0x0074
            java.util.ArrayList r1 = r5.A3I()
            boolean r1 = A0R(r1, r2)
            if (r1 == 0) goto L_0x0030
        L_0x0074:
            r1 = 1
        L_0x0075:
            java.util.List r3 = r9.A1M
            java.util.List r2 = r9.A0g
            boolean r2 = X.2PP.A00(r3, r2)
            r8 = r2 ^ 1
            boolean r2 = A0P(r9)
            if (r2 == 0) goto L_0x0113
            java.util.List r2 = r9.A1B
            java.util.Iterator r5 = r2.iterator()
        L_0x008b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0111
            X.1Xj r2 = X.C51966G9m.A0t(r5)
            java.lang.String r4 = r2.getId()
            X.1Xy r2 = r2.A0C
            java.lang.String r3 = r2.AXm()
            java.util.LinkedHashMap r2 = r9.A0f
            java.lang.Object r2 = r2.get(r4)
            boolean r2 = X.2PP.A00(r3, r2)
            if (r2 != 0) goto L_0x008b
            r4 = 1
        L_0x00ac:
            X.1Xj r2 = r9.A0I
            X.1Xy r2 = r2.A0C
            X.47o r2 = r2.Amn()
            if (r2 == 0) goto L_0x00d1
            X.Jj3 r2 = r9.A0B
            if (r2 == 0) goto L_0x00d1
            java.lang.String r3 = r2.A02()
            X.1Xj r2 = r9.A0I
            X.1Xy r2 = r2.A0C
            X.47o r2 = r2.Amn()
            java.lang.String r2 = r2.C6E()
            boolean r2 = X.0mp.A0G(r3, r2)
            r3 = 1
            if (r2 == 0) goto L_0x00d2
        L_0x00d1:
            r3 = 0
        L_0x00d2:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010a
            X.1Xj r0 = r9.A0I
            com.instagram.model.venue.Venue r2 = r0.A23()
            com.instagram.model.venue.Venue r0 = r9.A0L
            boolean r0 = X.2PP.A00(r2, r0)
            if (r0 == 0) goto L_0x010a
            if (r1 != 0) goto L_0x010a
            if (r8 != 0) goto L_0x010a
            if (r4 != 0) goto L_0x010a
            if (r3 != 0) goto L_0x010a
            java.lang.String r0 = r9.A0T
            if (r0 != 0) goto L_0x010a
            java.util.List r0 = r9.A1C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010a
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A0M
            if (r0 != 0) goto L_0x010a
            boolean r0 = r9.A0p
            if (r0 != 0) goto L_0x010a
            boolean r0 = r9.A0k
            if (r0 != 0) goto L_0x010a
            boolean r0 = r9.A0j
            if (r0 == 0) goto L_0x010b
        L_0x010a:
            r7 = 1
        L_0x010b:
            r9.A0l = r7
            A0F(r9)
        L_0x0110:
            return
        L_0x0111:
            r4 = 0
            goto L_0x00ac
        L_0x0113:
            X.1Xj r2 = r9.A0I
            X.1Xy r2 = r2.A0C
            java.lang.String r3 = r2.AXm()
            java.lang.String r2 = r9.A0U
            boolean r2 = X.2PP.A00(r3, r2)
            r4 = r2 ^ 1
            goto L_0x00ac
        L_0x0124:
            r1 = 0
            goto L_0x0075
        L_0x0127:
            X.1Xj r5 = r9.A0I
            java.util.ArrayList r4 = r9.A0a
            java.util.ArrayList r3 = r9.A0b
            java.util.ArrayList r2 = r9.A0Z
            java.util.ArrayList r1 = r5.A3E()
            boolean r1 = A0R(r1, r4)
            if (r1 != 0) goto L_0x0074
            java.util.ArrayList r1 = r5.A3G()
            boolean r1 = A0R(r1, r3)
            if (r1 != 0) goto L_0x0074
            java.util.ArrayList r1 = r5.A3I()
            boolean r2 = A0R(r1, r2)
            r1 = 0
            if (r2 == 0) goto L_0x0075
            goto L_0x0074
        L_0x0150:
            X.1Xj r0 = r9.A0I
            X.3gp r0 = r0.A1T()
            java.lang.String r0 = r0.A0d
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A07(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    private boolean A0M() {
        UserSession userSession;
        0Tu r2;
        long j;
        if (A0N(this)) {
            1Xj r0 = this.A0I;
            userSession = getSession();
            if (r0 != null) {
                return C271174i4.A04(userSession, this.A0I.A5G());
            }
            r2 = AnonymousClass7TF.A0H(userSession);
            j = 36324977964102180L;
        } else {
            boolean A0P2 = A0P(this);
            userSession = getSession();
            r2 = AnonymousClass7TF.A0H(userSession);
            if (A0P2) {
                j = 36313012185859681L;
            } else {
                j = 36313012185728608L;
            }
        }
        return 182.A06(r2, userSession, j);
    }

    public static boolean A0Q(EditMediaInfoFragment editMediaInfoFragment) {
        if (A0N(editMediaInfoFragment)) {
            return false;
        }
        if (C367088qA.A01(editMediaInfoFragment.getSession()) && ((editMediaInfoFragment.A0g.isEmpty() || DbT.A0j(editMediaInfoFragment.getSession()).A1R()) && editMediaInfoFragment.A0O.A06())) {
            return true;
        }
        UserSession session = editMediaInfoFragment.getSession();
        1Xj r0 = editMediaInfoFragment.A0I;
        ArrayList arrayList = editMediaInfoFragment.A0W;
        DbY.A1S(session, arrayList);
        if ((((r0 == null || !r0.A5j()) && !LTZ.A0L(arrayList)) || !LTZ.A0J(session, true)) && !LTZ.A0K(session, true)) {
            return false;
        }
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            switch (i) {
                case IgNetworkConsentStorage.MAX_ENTRIES /*1000*/:
                case 1001:
                    intent.getClass();
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
                    ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = (ProductCollectionFeedTaggingMeta) intent.getParcelableExtra("tagged_collection_info");
                    parcelableArrayListExtra.getClass();
                    if (this.A0I == null || !A0P(this)) {
                        MediaTaggingInfo A0p2 = JTO.A0p(parcelableArrayListExtra, 0);
                        this.A0a = A0p2.A0B;
                        this.A0Z = A0p2.A0A;
                        this.A0W.addAll(A0p2.A0F);
                        this.A0b = A0p2.A0C;
                        if (!A0O(this)) {
                            this.A0V = A0p2.A05;
                            this.A0Y = AnonymousClass7TE.A1D(A0p2.A0E);
                            this.A0X = AnonymousClass7TE.A1D(A0p2.A09);
                        }
                    } else {
                        HashSet A1F2 = AnonymousClass7TE.A1F();
                        HashSet A1F3 = AnonymousClass7TE.A1F();
                        Iterator it = parcelableArrayListExtra.iterator();
                        while (it.hasNext()) {
                            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                            Object obj = this.A1B.get(mediaTaggingInfo.A01);
                            obj.getClass();
                            1Xj r8 = (1Xj) obj;
                            this.A0d.put(r8.getId(), mediaTaggingInfo.A0B);
                            this.A0c.put(r8.getId(), mediaTaggingInfo.A0A);
                            this.A0W.addAll(mediaTaggingInfo.A0F);
                            this.A0e.put(r8.getId(), mediaTaggingInfo.A0C);
                            A1F2.addAll(AnonymousClass7TE.A1D(mediaTaggingInfo.A0E));
                            A1F3.addAll(AnonymousClass7TE.A1D(mediaTaggingInfo.A09));
                        }
                        this.A0Y = AnonymousClass7TE.A1D(A1F2);
                        this.A0X = AnonymousClass7TE.A1D(A1F3);
                        AnonymousClass3W1 r1 = this.A0J;
                        r1.getClass();
                        r1.A0B(intent.getIntExtra("last_page", 0));
                    }
                    this.A0P = productCollectionFeedTaggingMeta;
                    break;
                case 1003:
                    intent.getClass();
                    ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("media_tagging_info_list");
                    parcelableArrayListExtra2.getClass();
                    if (this.A0I != null) {
                        MediaTaggingInfo A0p3 = JTO.A0p(parcelableArrayListExtra2, 0);
                        this.A0a = A0p3.A0B;
                        this.A0Z = A0p3.A0A;
                        this.A0W.addAll(A0p3.A0F);
                        this.A0V = A0p3.A05;
                        this.A0Y = AnonymousClass7TE.A1D(A0p3.A0E);
                        this.A0X = AnonymousClass7TE.A1D(A0p3.A09);
                        break;
                    }
                    break;
                case 1004:
                    if (intent != null) {
                        this.A0M = (AudioOverlayTrack) intent.getParcelableExtra("extra_audio_track");
                        this.A0S = intent.getStringExtra("args_music_browse_session_full_id");
                        if (this.A0M != null) {
                            this.A0l = true;
                            A0F(this);
                        }
                        String str2 = this.A0R;
                        if (str2 != null) {
                            AtomicBoolean atomicBoolean = 1Xj.A0i;
                            str = 1Xv.A06(str2);
                        } else {
                            str = null;
                        }
                        27r A012 = 27p.A01(getSession());
                        0Aj A0e2 = AnonymousClass7TE.A0e(A012.A01, "ig_camera_share_sheet_entity_impression");
                        if (A0e2.isSampled()) {
                            JTP.A1H(A0e2);
                            AnonymousClass283 r2 = A012.A04;
                            JTP.A1I(A0e2, r2);
                            AnonymousClass7TE.A1W(A0e2, "entity_type", 18);
                            DbS.A1K(A0e2, "edit_media_info");
                            JTS.A19(A0e2, r2);
                            C51965G9l.A1A(C59725JVj.SHARE_SHEET, A0e2);
                            DbY.A1C(A0e2);
                            JTQ.A13(A0e2, 27x.A0F(str));
                        }
                    }
                    DbX.A10(getActivity(), AnonymousClass37D.A00);
                    return;
                default:
                    return;
            }
            A07(this);
        }
    }

    /* JADX WARNING: type inference failed for: r0v89, types: [X.2rR, java.lang.Object, X.LrO] */
    public final void onCreate(Bundle bundle) {
        int min;
        String str;
        BrandedContentTag brandedContentTag;
        int A022 = AnonymousClass0fD.A02(1118663305);
        Bundle requireArguments = requireArguments();
        EditMediaInfoFragment.super.onCreate(bundle);
        1Ng A002 = AnonymousClass1Nd.A00(getSession());
        A002.A01(this.A1I, C64648Lfa.class);
        A002.A01(this.A1G, C64629LfH.class);
        A002.A01(this.A1F, C64624LfC.class);
        A002.A01(this.A1H, C64679Lg6.class);
        A002.A01(this.A08, C64646LfY.class);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A0x = A012;
        A012.A9Y(this.A1J);
        this.A0N = 1Au.A00(getSession());
        this.A07 = WGU.A00(getSession());
        this.A02 = new Handler();
        if (bundle != null) {
            this.A0a = bundle.getParcelableArrayList("people_tags");
            this.A0V = bundle.getString("collaborator_id");
            this.A0Y = bundle.getStringArrayList("collaborator_ids");
            this.A0X = bundle.getStringArrayList("awaiting_response_collaborator_ids");
            this.A0Z = bundle.getParcelableArrayList("fb_user_tags");
            ArrayList arrayList = this.A0a;
            if (arrayList == null) {
                arrayList = AnonymousClass7TE.A1C();
            }
            this.A0W = arrayList;
            this.A0b = bundle.getParcelableArrayList("product_tags");
            this.A0P = (ProductCollectionFeedTaggingMeta) bundle.getParcelable("tagged_collection_info");
            this.A0U = (String) bundle.getParcelable("alt_text");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("carousel_media_ids");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it);
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(002.A0R("carousel_people_tags", A182));
                    if (parcelableArrayList != null) {
                        this.A0d.put(A182, parcelableArrayList);
                        this.A0W.addAll(parcelableArrayList);
                    }
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(002.A0R("carousel_fb_user_tags", A182));
                    if (parcelableArrayList2 != null) {
                        this.A0c.put(A182, parcelableArrayList2);
                    }
                    ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(002.A0R("carousel_product_tags", A182));
                    if (parcelableArrayList3 != null) {
                        this.A0e.put(A182, parcelableArrayList3);
                    }
                    Parcelable parcelable = bundle.getParcelable(002.A0R("carousel_alt_text", A182));
                    if (parcelable != null) {
                        this.A0f.put(A182, parcelable);
                    }
                }
            }
            this.A0s = true;
            this.A0h = true;
            this.A0L = (Venue) bundle.getParcelable("venue");
            this.A0u = bundle.getBoolean("venue_cleared");
            this.A0M = (AudioOverlayTrack) bundle.getParcelable("updated_audio");
        }
        this.A0n = requireArguments.getBoolean(C66579MXk.A00(554));
        this.A0o = requireArguments.getBoolean(AnonymousClass000.A00(2250));
        this.A17 = requireArguments.getBoolean(C66579MXk.A00(555));
        this.A0C = (AddChannelsRowChannelInfo) requireArguments.getParcelable(C66579MXk.A00(553));
        this.A0R = requireArguments.getString(C66579MXk.A00(96));
        1Xj A023 = 1E7.A00(getSession()).A02(this.A0R);
        this.A0I = A023;
        if (A023 == null) {
            this.A0R.getClass();
            1OC A042 = C3724090s.A04(getSession(), this.A0R);
            A042.A00 = new KAX(this);
            schedule(A042);
        } else {
            if (!this.A0s) {
                A0C(this);
            }
            if (!this.A0h) {
                boolean A0P2 = A0P(this);
                1Xj r0 = this.A0I;
                if (A0P2) {
                    this.A0f = r0.A3O();
                } else if (r0.A0C.AXm() != null) {
                    this.A0U = this.A0I.A0C.AXm();
                }
            }
            A04(this);
            this.A0q = this.A0I.A5l();
            if (this.A0I.A4z()) {
                for (AnonymousClass536 r8 : this.A0I.A3j()) {
                    Boolean bool = Boolean.TRUE;
                    boolean equals = bool.equals(r8.Bbh());
                    boolean equals2 = bool.equals(r8.CYy());
                    this.A0g.add(new BrandedContentTag(r8.ByI(), equals, equals2));
                    this.A1M.add(new BrandedContentTag(new BrandedContentTag(r8.ByI(), equals, equals2)));
                }
                this.A05 = this.A0I.A0C.Aho();
            }
            if (this.A0I.A0C.BQ3() != null) {
                this.A04 = this.A0I.A0C.BQ3();
            }
            this.A0E = JTO.A0L(new C61529KBi(getSession()), requireActivity()).A00(C60289Jil.class);
            AnonymousClass1eb BFi = this.A0I.A0C.BFi();
            if (BFi != null) {
                this.A0E.A01(String.valueOf(BFi.BfK()), BFi.getTitle(), BFi.BgZ(), BFi.BfL(), false);
                this.A0D = C60289Jil.A0D;
            }
            this.A0i = false;
            this.A0k = false;
            if (this.A0o) {
                A0J(this, true);
            }
            this.A06 = this.A0I.A1I();
        }
        this.A0F = JZM.A00(getSession());
        this.A0w = requireArguments.getInt(C66579MXk.A00(234), -1);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            min = 0;
        } else {
            min = Math.min(bundle2.getInt(C66579MXk.A00(95), 0), C51966G9m.A06(this.A1B));
        }
        this.A0v = min;
        this.A15 = requireArguments.getBoolean(C66579MXk.A00(233), false);
        this.A11 = new C282555Dn(this);
        Context requireContext = requireContext();
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Context requireContext2 = requireContext();
        UserSession session = getSession();
        1Xj r2 = this.A0I;
        ? obj = new Object();
        obj.A00 = r2;
        AnonymousClass2xS r82 = new AnonymousClass2xS(requireContext2, session, this, obj);
        this.A12 = new C64095LMp(requireContext, getSession(), this.A11, r82, this.A0n);
        C249713kF r5 = C249713kF.A00;
        Context context = getContext();
        context.getClass();
        LPD A0I2 = r5.A0I(context, AnonymousClass07i.A00(this), getSession(), this.A1L);
        this.A0O = A0I2;
        if (this.A0g.isEmpty() || (brandedContentTag = (BrandedContentTag) this.A0g.get(0)) == null) {
            str = null;
        } else {
            str = brandedContentTag.A01;
        }
        A0I2.A04(str);
        registerLifecycleListener(new EE7(getActivity()));
        AnonymousClass0fD.A09(1215713838, A022);
    }

    /* JADX WARNING: type inference failed for: r0v43, types: [java.lang.Object, X.8av] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1008489550);
        View inflate = layoutInflater.inflate(R.layout.layout_edit_media_info, viewGroup, false);
        this.mScrollView = inflate.requireViewById(R.id.edit_media_scroll_view);
        this.mUserImageView = (CircularImageView) inflate.requireViewById(R.id.edit_media_user_imageview);
        this.mUsername = DbU.A0G(inflate, R.id.edit_media_username);
        this.mUsernameDotSeparator = DbU.A0G(inflate, R.id.edit_media_username_separator);
        this.mUsernameAddCollaboratorsTextButton = DbU.A0G(inflate, R.id.edit_media_username_collaborators);
        this.mBelowUsernameLabel = DbU.A0G(inflate, R.id.below_username_label);
        this.mReplaceAudioLabelStubber = DbV.A0T(inflate, R.id.replace_audio_label_stub, false);
        this.mAddAudioLabelStubber = DbV.A0T(inflate, R.id.add_audio_label_stub, false);
        this.mReplaceGenAILabelStubber = DbV.A0T(inflate, R.id.replace_gen_ai_label_stub, false);
        this.mAddGenAILabelStubber = DbV.A0T(inflate, R.id.add_gen_ai_label_stub, false);
        this.mTimestamp = DbU.A0G(inflate, R.id.edit_media_timestamp);
        this.mTextContainer = inflate.requireViewById(R.id.edit_media_linear_layout);
        this.A0z = DbY.A0S(inflate, R.id.single_media_group_stub);
        this.A0y = DbY.A0S(inflate, R.id.carousel_media_group_stub);
        this.A10 = DbY.A0S(inflate, R.id.upcoming_event_stub);
        this.A0A = DbV.A0T(inflate, R.id.tagged_channels_stub, false);
        this.A09 = DbV.A0T(inflate, R.id.bio_product_stub, false);
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) inflate.requireViewById(R.id.edit_media_caption);
        this.mCaption = igAutoCompleteTextView;
        igAutoCompleteTextView.addTextChangedListener(this.A1D);
        this.mCaption.getClass();
        this.mScrollView.getClass();
        C64723Lh0 lh0 = new C64723Lh0(this, getSession(), this);
        this.A0G = lh0;
        lh0.A02(Dba.A0A(this).A0S, new Object(), this.mCaption);
        this.mScrollView.addOnLayoutChangeListener(this.A19);
        this.mPostOverlayView = inflate.findViewById(R.id.content_overlay);
        1Yl A002 = C357108Wn.A00();
        UserSession session = getSession();
        C357108Wn.A00();
        this.A0Q = A002.A00((ViewStub) inflate.findViewById(R.id.warning_nudge), this, session, new M16(false), new M17(this, 1));
        A09(this);
        if (this.A0n && !this.A0N.A01.getBoolean("has_seen_boost_edit_caption_guidance_bottom_sheet", false)) {
            inflate.postDelayed(new M3D(this), 500);
        }
        if (!(this.A0I == null || !JUO.A01(getSession()) || this.A0I.A0C.AlM() == null || this.A0I.A0C.AlM().BdV() == null || this.A0I.A0C.AlM().BdV().C48() == null)) {
            C272034jz BdV = this.A0I.A0C.AlM().BdV();
            List C48 = BdV.C48();
            C48.getClass();
            int size = C48.size();
            ViewGroup viewGroup2 = (ViewGroup) DbY.A0F(inflate, R.id.poll_stub);
            this.mOptionsContainer = viewGroup2;
            ViewGroup A0C2 = DbU.A0C(viewGroup2, R.id.option_rows);
            LayoutInflater A0E2 = DbV.A0E(this);
            for (int i = 0; i < size; i++) {
                View inflate2 = A0E2.inflate(R.layout.comment_poll_consumption_option_row_unfilled, A0C2, false);
                0nA.A0e(inflate2, DbV.A05(this).getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material));
                View findViewById = inflate2.findViewById(R.id.option_row_text);
                findViewById.getClass();
                TextView textView = (TextView) findViewById;
                textView.setTextColor(DbV.A05(this).getColor(2Yu.A07(requireContext())));
                textView.setText(((C272014jx) C48.get(i)).getText());
                A0C2.addView(inflate2);
            }
            View requireViewById = inflate.requireViewById(R.id.delete_poll);
            DbU.A12(requireContext(), requireViewById, 2131957585);
            LY9.A00(requireViewById, this, BdV, size, 5);
        }
        1Xj r0 = this.A0I;
        if (!(r0 == null || AnonymousClass4LK.A00(r0) == null || this.mCaption == null)) {
            View A0F2 = DbY.A0F(inflate, R.id.comment_prompt_stub);
            this.mCommentPromptLabelView = A0F2;
            AnonymousClass0fU.A00(new LYB(this, 29), A0F2);
            this.mCaption.setFocusable(false);
            AnonymousClass0fU.A00(new LYB(this, 30), this.mCaption);
        }
        AnonymousClass0fD.A09(-911550738, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(931004003);
        super.onDestroy();
        1Ng A002 = AnonymousClass1Nd.A00(getSession());
        A002.A02(this.A1I, C64648Lfa.class);
        A002.A02(this.A1G, C64629LfH.class);
        A002.A02(this.A1F, C64624LfC.class);
        A002.A02(this.A1H, C64679Lg6.class);
        A002.A02(this.A08, C64646LfY.class);
        C60289Jil jil = this.A0E;
        if (jil != null) {
            jil.A00();
        }
        AnonymousClass0fD.A09(66184387, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1496428916);
        super.onDestroyView();
        IgAutoCompleteTextView igAutoCompleteTextView = this.mCaption;
        if (igAutoCompleteTextView != null) {
            igAutoCompleteTextView.removeTextChangedListener(this.A1D);
            this.mCaption = null;
        }
        this.mUserImageView = null;
        this.mUsername = null;
        this.mUsernameDotSeparator = null;
        this.mUsernameAddCollaboratorsTextButton = null;
        this.mBelowUsernameLabel = null;
        this.mReplaceAudioLabelStubber = null;
        this.mAddAudioLabelStubber = null;
        this.mExtraLocationLabel = null;
        this.mTimestamp = null;
        this.mFailedView = null;
        this.A0z = null;
        this.A0y = null;
        C357128Wq r0 = this.A0Q;
        if (r0 != null) {
            r0.A05();
            this.A0Q = null;
        }
        this.mReplaceGenAILabelStubber = null;
        this.mAddGenAILabelStubber = null;
        AnonymousClass0fD.A09(-1209876219, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1066294855);
        EditMediaInfoFragment.super.onPause();
        0nA.A0N(this.mCaption);
        1Wr r2 = 1Wr.A00;
        if (r2 != null) {
            r2.removeLocationUpdates(getSession(), this.A1A);
            1Wr.A00.cancelSignalPackageRequest(getSession(), this.A1K);
        }
        AnonymousClass0fD.A09(1530373287, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-890600391);
        super.onResume();
        if (this.A0m) {
            A0G(this);
        } else {
            A0H(this);
            if (this.A01 == null) {
                1Wr r3 = 1Wr.A00;
                r3.getClass();
                Location lastLocation = r3.getLastLocation(getSession(), "EditMediaInfoFragment");
                if (lastLocation == null || !C270984hi.A00(lastLocation)) {
                    r3.requestLocationUpdates(getSession(), this.A1A, "EditMediaInfoFragment");
                } else {
                    this.A01 = lastLocation;
                    r3.removeLocationUpdates(getSession(), this.A1A);
                }
            }
        }
        A0A(this);
        AnonymousClass0fD.A09(-1743298891, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("people_tags", this.A0a);
        bundle.putString("collaborator_id", this.A0V);
        bundle.putStringArrayList("collaborator_ids", this.A0Y);
        bundle.putStringArrayList("awaiting_response_collaborator_ids", this.A0X);
        bundle.putParcelableArrayList("fb_user_tags", this.A0Z);
        bundle.putParcelableArrayList("product_tags", this.A0b);
        bundle.putParcelable("tagged_collection_info", this.A0P);
        bundle.putParcelable("venue", this.A0L);
        bundle.putBoolean("venue_cleared", this.A0u);
        bundle.putParcelable("updated_audio", this.A0M);
        bundle.putCharSequence("alt_text", this.A0U);
        ArrayList A1D2 = AnonymousClass7TE.A1D(this.A0d.keySet());
        Iterator it = A1D2.iterator();
        while (it.hasNext()) {
            String A182 = AnonymousClass7TE.A18(it);
            bundle.putParcelableArrayList(002.A0R("carousel_people_tags", A182), (ArrayList) this.A0d.get(A182));
        }
        Iterator it2 = AnonymousClass7TE.A1D(this.A0c.keySet()).iterator();
        while (it2.hasNext()) {
            String A183 = AnonymousClass7TE.A18(it2);
            bundle.putParcelableArrayList(002.A0R("carousel_fb_user_tags", A183), (ArrayList) this.A0c.get(A183));
        }
        ArrayList A1D3 = AnonymousClass7TE.A1D(this.A0e.keySet());
        Iterator it3 = A1D3.iterator();
        while (it3.hasNext()) {
            String A184 = AnonymousClass7TE.A18(it3);
            bundle.putParcelableArrayList(002.A0R("carousel_product_tags", A184), (ArrayList) this.A0e.get(A184));
        }
        ArrayList A1D4 = AnonymousClass7TE.A1D(this.A0f.keySet());
        Iterator it4 = A1D4.iterator();
        while (it4.hasNext()) {
            String A185 = AnonymousClass7TE.A18(it4);
            bundle.putCharSequence(002.A0R("carousel_alt_text", A185), DbS.A0r(A185, this.A0f));
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A1C2.addAll(A1D2);
        A1C2.addAll(A1D3);
        A1C2.addAll(A1D4);
        bundle.putStringArrayList("carousel_media_ids", A1C2);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-498051827);
        EditMediaInfoFragment.super.onStart();
        AnonymousClass3E6 r0 = this.A0x;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        AnonymousClass0fD.A09(1362601597, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(997291793);
        EditMediaInfoFragment.super.onStop();
        AnonymousClass3E6 r0 = this.A0x;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass0fD.A09(-1897397011, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Activity requireActivity = requireActivity();
        while (requireActivity.getParent() != null) {
            requireActivity = requireActivity.getParent();
        }
        Window window = requireActivity.getWindow();
        window.getClass();
        this.mActionBar = DbS.A0E(window.getDecorView(), R.id.action_bar_container);
        this.mMediaTitleLayout = DbS.A0E(view, R.id.edit_media_relative_layout);
    }
}
