package com.instagram.tagging.activity;

import X.00y;
import X.03v;
import X.0Aj;
import X.0eE;
import X.0nA;
import X.0qQ;
import X.0sn;
import X.0wb;
import X.15p;
import X.1ES;
import X.1NY;
import X.1Ng;
import X.1QE;
import X.1XP;
import X.1XY;
import X.1iA;
import X.1wn;
import X.1xC;
import X.28D;
import X.28K;
import X.2dZ;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass0t1;
import X.AnonymousClass3GP;
import X.AnonymousClass3JR;
import X.AnonymousClass3M8;
import X.AnonymousClass3Q2;
import X.AnonymousClass3ZA;
import X.AnonymousClass3z2;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9PF;
import X.C14502TxO;
import X.C15401Uc7;
import X.C20695WxR;
import X.C249453jo;
import X.C249803kO;
import X.C254073rt;
import X.C258383yv;
import X.C273654mx;
import X.C354838No;
import X.C46205DQi;
import X.C46325Dbt;
import X.C46720Djx;
import X.C49627Ezk;
import X.C49926FFc;
import X.C51970G9q;
import X.C56588I2s;
import X.C59689JTv;
import X.C59899JbO;
import X.C60053JeL;
import X.C60762Jqt;
import X.C62100Ka5;
import X.C62101Ka6;
import X.C62103Ka8;
import X.C62152KbA;
import X.C62153KbB;
import X.C62565Khv;
import X.C62630Kj1;
import X.C62940Kos;
import X.C63263Ku8;
import X.C63634L0w;
import X.C63664L2a;
import X.C64273LXz;
import X.C64832Lit;
import X.C65706LyL;
import X.C66469MSx;
import X.C66573MXe;
import X.C71342cb;
import X.C71662eb;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.G6R;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.JTR;
import X.JTT;
import X.JTU;
import X.KB3;
import X.L58;
import X.LM3;
import X.LMz;
import X.LOQ;
import X.LPD;
import X.LRC;
import X.LSN;
import X.LTQ;
import X.LTX;
import X.LTZ;
import X.LY5;
import X.LY7;
import X.LYE;
import X.MRC;
import X.MRD;
import X.MUG;
import X.MUJ;
import X.MVH;
import X.MXd;
import X.U7D;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.model.shopping.ProductTag;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.PhotoScrollView;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class TaggingActivity extends IgFragmentActivity implements AnonymousClass4DU, C249453jo, MVH, AnonymousClass4DS, C66573MXe, MUJ, C66469MSx, MUG, MXd, G6R, MRC, MRD {
    public int A00;
    public View A01;
    public 2da A02;
    public 1wn A03;
    public 1wn A04;
    public ReboundViewPager A05;
    public C59899JbO A06;
    public AnonymousClass9PF A07;
    public C46720Djx A08;
    public C46720Djx A09;
    public AnonymousClass3M8 A0A;
    public L58 A0B;
    public LPD A0C;
    public ProductCollectionFeedTaggingMeta A0D;
    public LSN A0E;
    public C62103Ka8 A0F;
    public LMz A0G;
    public C62630Kj1 A0H;
    public PhotoScrollView A0I;
    public Integer A0J;
    public String A0K;
    public String A0L;
    public ArrayList A0M;
    public List A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public View A0U;
    public TextView A0V;
    public 2dZ A0W;
    public 1wn A0X;
    public 1wn A0Y;
    public C258383yv A0Z;
    public IgSegmentedTabLayout A0a;
    public KB3 A0b;
    public C60053JeL A0c;
    public C65706LyL A0d;
    public C62940Kos A0e;
    public String A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public final Map A0m = AnonymousClass7TE.A1H();
    public final Set A0n = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A0o = AnonymousClass0eN.A01(new C20695WxR(this, 39));

    private final void A08() {
        String str;
        if (CKU()) {
            EvN();
            return;
        }
        LSN lsn = this.A0E;
        if (lsn == null) {
            str = "helpTextController";
        } else {
            lsn.A0D.setVisibility(8);
            ListView listView = lsn.A02;
            if (listView != null) {
                listView.setVisibility(8);
            }
            A0A(this);
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) this.A0m.get(A0X());
            if (tagsInteractiveLayout != null) {
                C15401Uc7.A0M.A00(this, AnonymousClass7TE.A0l(this.A0o), tagsInteractiveLayout, this.A0f, BbX(), true);
                tagsInteractiveLayout.A08(new PointF(0.5f, 0.5f));
                return;
            }
            C65706LyL lyL = this.A0d;
            if (lyL == null) {
                str = "tagSearchController";
            } else {
                String str2 = this.A0f;
                C15401Uc7.A0M.A00(this, lyL.A00, lyL, str2, AnonymousClass7TE.A1D(lyL.A01.BbX()), true);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(com.instagram.tagging.activity.TaggingActivity r8) {
        /*
            r7 = r8
            android.view.View r1 = r8.A01
            if (r1 == 0) goto L_0x0075
            X.3yv r0 = r8.A0Z
            if (r0 != 0) goto L_0x0020
            android.content.Context r4 = X.DbT.A05(r8)
            X.0eM r0 = r8.A0o
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            r8 = 0
            X.LrG r6 = new X.LrG
            r6.<init>()
            X.3yv r3 = new X.3yv
            r3.<init>(r4, r5, r6, r7, r8)
            r7.A0Z = r3
        L_0x0020:
            java.lang.Object r6 = r1.getTag()
            X.3rt r6 = (X.C254073rt) r6
            if (r6 == 0) goto L_0x0075
            X.3yv r1 = r7.A0Z
            if (r1 == 0) goto L_0x0075
            r5 = 0
            android.view.ViewGroup r4 = r6.A0J
            r4.setVisibility(r5)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r8 = r6.A0P
            r8.setVisibility(r5)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A0O
            r3 = 8
            r0.setVisibility(r3)
            android.widget.TextView r7 = r6.A01
            android.content.Context r1 = r1.A00
            r0 = 2131976670(0x7f1361de, float:1.9590467E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r7.setText(r0)
            X.3z2 r2 = r6.A0S
            int r0 = r2.A03
            r8.setNormalColor(r0)
            int r0 = r2.A09
            r7.setTextColor(r0)
            int r0 = r2.A01
            r4.setBackgroundColor(r0)
            android.view.View r1 = r6.A0H
            int r0 = r2.A04
            r1.setBackgroundColor(r0)
            X.2eb r0 = r6.A0Q
            android.view.View r0 = r0.A01()
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r0 = r6.A06
            r0.setVisibility(r3)
            r4.setClickable(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A09(com.instagram.tagging.activity.TaggingActivity):void");
    }

    public static final void A0D(TaggingActivity taggingActivity) {
        String str;
        String str2;
        TaggingActivity taggingActivity2 = taggingActivity;
        if (taggingActivity.A0T) {
            List list = taggingActivity.A0O;
            if (list != null) {
                if (list.isEmpty()) {
                    List list2 = taggingActivity.A0N;
                    if (list2 != null) {
                        if (list2.isEmpty()) {
                            return;
                        }
                    }
                    str = "mentionedSellerIds";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                A0H(taggingActivity);
                AnonymousClass0eM r3 = taggingActivity.A0o;
                UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                ArrayList arrayList = taggingActivity.A0M;
                if (arrayList == null) {
                    str = "mediaTaggingInfos";
                } else {
                    ArrayList A0q = AnonymousClass7TF.A0q(A0l2, 0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                        0qQ.A0B(mediaTaggingInfo, 1);
                        AnonymousClass3Q2 A032 = 28K.A00(A0l2).A03(mediaTaggingInfo.A06);
                        if (!(A032 == null || !A032.A0q() || (str2 = A032.A33) == null)) {
                            A0q.add(str2);
                        }
                    }
                    ArrayList A052 = LTZ.A05(A0q);
                    0qQ.A0C(A052, AnonymousClass000.A00(52));
                    List<Object> list3 = taggingActivity.A0N;
                    if (list3 != null) {
                        List list4 = taggingActivity.A0O;
                        if (list4 != null) {
                            ArrayList A1D = AnonymousClass7TE.A1D(list4);
                            for (Object A1S : list3) {
                                JTR.A1S(A1S, A1D);
                            }
                            ArrayList A1D2 = AnonymousClass7TE.A1D(A1D);
                            UserSession A0l3 = AnonymousClass7TE.A0l(r3);
                            String str3 = taggingActivity2.A0K;
                            if (str3 == null) {
                                str = "_shoppingCreationSessionId";
                            } else {
                                new LRC((AnonymousClass0iw) taggingActivity2, A0l3, str3, "feed", A052, A1D2).A01();
                                return;
                            }
                        }
                    }
                    str = "mentionedSellerIds";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "taggedSellerIds";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final boolean A0S(TaggingActivity taggingActivity) {
        AnonymousClass0eM r2 = taggingActivity.A0o;
        UserSession A0l2 = AnonymousClass7TE.A0l(r2);
        ArrayList BbX = taggingActivity.BbX();
        AnonymousClass7TF.A1H(A0l2, BbX);
        if ((!LTZ.A0L(BbX) || !LTZ.A0J(A0l2, false)) && !LTZ.A0K(AnonymousClass7TE.A0l(r2), false)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TF.A0L(r9.A0o, 0), 36324342309662744L) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A84(com.instagram.user.model.User r10) {
        /*
            r9 = this;
            r5 = 0
            java.util.ArrayList r0 = r9.A0M
            r4 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "mediaTaggingInfos"
        L_0x0008:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0010:
            java.util.Iterator r8 = X.AnonymousClass7TE.A1G(r0)
        L_0x0014:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r7 = X.AnonymousClass7TF.A0a(r8)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r7 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r7
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L_0x0037
            X.0eM r0 = r9.A0o
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324342309662744(0x810ccc00113018, double:3.034998570792488E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0056
        L_0x0037:
            java.util.ArrayList r0 = r7.A0B
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.JTU.A0Y(r1)
            r2.add(r0)
            goto L_0x0041
        L_0x004f:
            boolean r0 = X.JTQ.A1T(r10, r2)
            if (r0 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            X.0eM r0 = r9.A0o
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = r9.A0g
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.LTZ.A0F(r4, r1, r0)
            java.lang.String r6 = r10.getId()
            if (r0 == 0) goto L_0x009e
            java.util.ArrayList r0 = r7.A0E
            r0.add(r5, r6)
            java.util.ArrayList r3 = r7.A0B
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r3)
        L_0x0077:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r1)
            com.instagram.tagging.model.Tag r2 = (com.instagram.tagging.model.Tag) r2
            java.lang.String r0 = r2.getId()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0077
            r3.remove(r2)
            r3.add(r2)
            java.util.ArrayList r1 = r7.A09
            java.lang.String r0 = r2.getId()
            r1.add(r0)
            goto L_0x0014
        L_0x009e:
            r7.A05 = r6
            java.util.ArrayList r3 = r7.A0B
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r3)
        L_0x00a6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r2)
            com.instagram.tagging.model.Tag r1 = (com.instagram.tagging.model.Tag) r1
            java.lang.String r0 = r1.getId()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x00a6
            r3.remove(r1)
            r3.add(r5, r1)
            goto L_0x0014
        L_0x00c4:
            X.JbO r4 = r9.A06
            if (r4 != 0) goto L_0x00cc
            java.lang.String r0 = "creationLogger"
            goto L_0x0008
        L_0x00cc:
            java.lang.String r3 = r4.A02
            if (r3 == 0) goto L_0x00df
            com.instagram.common.session.UserSession r0 = r4.A05
            X.27r r0 = X.27p.A01(r0)
            X.29Y r2 = r0.A0E
            java.lang.String r1 = "ig_creation_client_events"
            X.28D r0 = r4.A00
            r2.A0R(r0, r3, r1)
        L_0x00df:
            A0G(r9)
            A0C(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A84(com.instagram.user.model.User):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.tagging.activity.TaggingActivity, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Cnh(com.instagram.tagging.widget.TagsInteractiveLayout r33, java.util.ArrayList r34, java.util.ArrayList r35) {
        /*
            r32 = this;
            r2 = 0
            r1 = 1
            r4 = r34
            r5 = r35
            int r7 = X.DbW.A02(r1, r4, r5)
            r0 = r32
            X.Kj1 r3 = r0.A0H
            r10 = 0
            if (r3 != 0) goto L_0x001b
            java.lang.String r0 = "tagType"
        L_0x0013:
            X.0qQ.A0F(r0)
        L_0x0016:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001b:
            int r3 = r3.ordinal()
            r6 = r33
            if (r3 == r1) goto L_0x01e0
            if (r3 != r7) goto L_0x0273
            java.lang.Integer r4 = r0.A0J
            r3 = 3
            if (r4 == 0) goto L_0x0035
            int r4 = r4.intValue()
            if (r4 == r3) goto L_0x01ee
            r3 = 4
            if (r4 == r3) goto L_0x01ee
            if (r4 == r7) goto L_0x01ee
        L_0x0035:
            X.6SR r3 = X.AnonymousClass6SR.A01()
            r3.A0V = r1
            java.util.Map r4 = r0.A0m
            java.lang.String r3 = r0.A0X()
            r4.put(r3, r6)
            r0.A05()
            java.lang.String r18 = r0.getModuleName()
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            X.Uxb r11 = X.C16581Uxb.FEED_SHARING
            java.lang.String r9 = r0.A0K
            if (r9 == 0) goto L_0x01dc
            r23 = 0
            r8 = 0
            r20 = 0
            X.AnonymousClass7TF.A1C(r14, r7, r11)
            X.0sn r25 = X.0sn.A00
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r12 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState
            r24 = r12
            r26 = r25
            r27 = r25
            r28 = r25
            r29 = r25
            r30 = r25
            r31 = r25
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r21 = r0.A0X()
            java.util.ArrayList r3 = r0.Aas()
            X.C64174LSb.A04(r12, r5, r3)
            java.util.ArrayList r3 = r0.A0M
            if (r3 != 0) goto L_0x0083
            X.JTO.A1L()
            goto L_0x0016
        L_0x0083:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r3 = X.JTT.A0i(r0, r3)
            java.util.List r3 = r3.A0G
            if (r3 == 0) goto L_0x0098
            java.util.List r3 = X.00k.A0X(r3)
            java.util.List r3 = X.00k.A0W(r3)
            X.0qQ.A0B(r3, r2)
            r12.A00 = r3
        L_0x0098:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r3 = r0.A0M
            if (r3 == 0) goto L_0x01d8
            java.util.Iterator r7 = X.AnonymousClass7TE.A1G(r3)
        L_0x00a4:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x00c0
            java.lang.Object r3 = X.AnonymousClass7TF.A0a(r7)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r3 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r3
            java.util.List r3 = r3.A0F
            java.util.Iterator r3 = r3.iterator()
        L_0x00b6:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00a4
            X.JTU.A1M(r4, r3)
            goto L_0x00b6
        L_0x00c0:
            java.util.List r3 = r12.A06
            java.util.List r3 = X.JTU.A0b(r3, r4)
            r12.A06 = r3
            java.util.ArrayList r3 = r0.A04()
            X.0qQ.A0B(r3, r2)
            r12.A02 = r3
            boolean r24 = A0S(r0)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r4 = r0.A0D
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r6 = r5.iterator()
        L_0x00df:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x00ed
            com.instagram.user.model.Product r5 = X.JTS.A0Y(r6)
            r3.add(r5)
            goto L_0x00df
        L_0x00ed:
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r13 = new com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState
            r13.<init>(r4, r10, r3, r10)
            java.lang.String r3 = X.C64174LSb.A02(r12, r13)
            java.util.List r4 = r12.A03
            java.util.List r3 = X.0sr.A1N(r3)
            java.util.List r3 = X.JTU.A0b(r4, r3)
            r12.A03 = r3
            X.0eM r7 = r0.A0o
            X.0lg r6 = X.DbT.A0X(r7)
            X.0Tu r5 = X.0Tu.A06
            r3 = 36318063066355548(0x8107160000175c, double:3.031027552040534E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            if (r3 == 0) goto L_0x011f
            java.util.List r3 = r0.A0N
            if (r3 != 0) goto L_0x011d
            java.lang.String r0 = "mentionedSellerIds"
            goto L_0x0013
        L_0x011d:
            r12.A01 = r3
        L_0x011f:
            java.util.ArrayList r3 = r0.A04()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0176
            java.util.LinkedHashSet r5 = X.DbS.A0y()
            java.util.ArrayList r4 = r0.A0M
            if (r4 == 0) goto L_0x01d8
            int r3 = r0.A00
            java.lang.Object r3 = X.DbZ.A0g(r4, r3)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r3 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r3
            java.util.ArrayList r3 = r3.A0D
            if (r3 == 0) goto L_0x0172
            java.util.Iterator r6 = r3.iterator()
        L_0x0141:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0172
            java.lang.Object r3 = r6.next()
            com.instagram.tagging.api.model.MediaSuggestedProductTag r3 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r3
            java.util.List r3 = r3.A02
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3)
            X.3kO r4 = r3.iterator()
            X.0qQ.A07(r4)
        L_0x015a:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0141
            java.lang.Object r3 = r4.next()
            com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer r3 = (com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer) r3
            com.instagram.user.model.ProductDetailsProductItemDict r3 = r3.A01
            com.instagram.user.model.Product r3 = X.C14502TxO.A00(r3)
            java.lang.String r3 = r3.A0H
            r5.add(r3)
            goto L_0x015a
        L_0x0172:
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1D(r5)
        L_0x0176:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r4 = r0.A0D
            if (r4 == 0) goto L_0x019a
            boolean r3 = r4.A05
            if (r3 != 0) goto L_0x018c
            com.instagram.api.schemas.ProductCollectionV2Type r5 = r4.A00
            com.instagram.api.schemas.ProductCollectionV2Type r3 = com.instagram.api.schemas.ProductCollectionV2Type.DISCOUNT
            if (r5 != r3) goto L_0x01d5
            com.instagram.shopping.model.taggingfeed.SourceType r3 = com.instagram.shopping.model.taggingfeed.SourceType.STOREFRONT_DISCOUNT
        L_0x0186:
            java.lang.String r20 = r3.toString()
            java.lang.String r8 = r4.A01
        L_0x018c:
            java.lang.String r3 = r4.A01
            java.util.List r4 = r12.A03
            java.util.List r3 = X.0sr.A1N(r3)
            java.util.List r3 = X.JTU.A0b(r4, r3)
            r12.A03 = r3
        L_0x019a:
            r15 = r10
            r16 = r10
            r17 = r10
            r19 = r8
            r22 = r9
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r9 = X.C64174LSb.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.Liw r8 = X.C17053VGb.A00(r3)
            java.lang.String r6 = r0.A0K
            if (r6 == 0) goto L_0x01dc
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = X.DbX.A0l(r3, r7)
            boolean r5 = r3.A1x()
            java.lang.String r4 = r0.getModuleName()
            java.lang.String r3 = "feed"
            r8.A05(r6, r4, r5, r3)
            X.3kF r4 = X.C249713kF.A00
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r7)
            r5 = r10
            r6 = r0
            r7 = r0
            r11 = r2
            r12 = r2
            r4.A0j(r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x01d5:
            com.instagram.shopping.model.taggingfeed.SourceType r3 = com.instagram.shopping.model.taggingfeed.SourceType.STOREFRONT_COLLECTION
            goto L_0x0186
        L_0x01d8:
            java.lang.String r0 = "mediaTaggingInfos"
            goto L_0x0013
        L_0x01dc:
            java.lang.String r0 = "_shoppingCreationSessionId"
            goto L_0x0013
        L_0x01e0:
            boolean r3 = A0T(r0)
            if (r3 == 0) goto L_0x02b1
            X.JbO r5 = r0.A06
            if (r5 != 0) goto L_0x0274
            java.lang.String r0 = "creationLogger"
            goto L_0x0013
        L_0x01ee:
            java.lang.String r4 = r0.A0X()
            java.lang.String r3 = "_"
            java.util.List r5 = X.DbW.A0o(r4, r3)
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x0270
            java.util.ListIterator r4 = X.C51968G9o.A18(r5)
        L_0x0202:
            boolean r3 = r4.hasPrevious()
            if (r3 == 0) goto L_0x0270
            int r3 = X.DbX.A06(r4)
            if (r3 == 0) goto L_0x0202
            java.util.List r3 = X.DbX.A0y(r5, r4)
        L_0x0212:
            java.lang.String[] r4 = X.DbU.A1b(r3, r2)
            X.0eM r3 = r0.A0o
            X.0lg r8 = X.DbT.A0X(r3)
            r3 = r4[r2]
            java.lang.Integer r0 = r0.A0J
            if (r0 == 0) goto L_0x026e
            java.lang.String r7 = X.C49158EqP.A00(r0)
        L_0x0226:
            int r0 = r4.length
            if (r0 <= r1) goto L_0x022b
            r10 = r4[r1]
        L_0x022b:
            X.0qQ.A0B(r8, r1)
            if (r3 == 0) goto L_0x026b
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r3)
            if (r0 == 0) goto L_0x026b
            long r5 = r0.longValue()
        L_0x023a:
            if (r7 != 0) goto L_0x023e
            java.lang.String r7 = ""
        L_0x023e:
            if (r10 == 0) goto L_0x0264
            X.4Ny r4 = X.C263944Ny.A00(r10)
        L_0x0244:
            r0 = 0
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r8)
            java.lang.String r0 = "instagram_shopping_commerce_media_untagging_interaction"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0273
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "ig_media_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = "product_tags_edit_blocked"
            X.JTU.A0v(r4, r3, r0, r7)
            return r2
        L_0x0264:
            java.lang.String r0 = "-1"
            X.4Ny r4 = X.C263944Ny.A00(r0)
            goto L_0x0244
        L_0x026b:
            r5 = -1
            goto L_0x023a
        L_0x026e:
            r7 = r10
            goto L_0x0226
        L_0x0270:
            X.0sn r3 = X.0sn.A00
            goto L_0x0212
        L_0x0273:
            return r2
        L_0x0274:
            java.lang.String r3 = r0.getModuleName()
            r5.A0D(r3)
            X.0eM r8 = r0.A0o
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r8)
            java.util.ArrayList r3 = r0.C3x()
            int r5 = r3.size()
            boolean r3 = r0.A0g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = X.LTZ.A0G(r10, r7, r3, r5)
            if (r3 == 0) goto L_0x02a1
            java.util.ArrayList r1 = r0.C3x()
            int r1 = r1.size()
            X.C49926FFc.A01(r0, r1)
            return r2
        L_0x02a1:
            X.LBj r3 = X.C15401Uc7.A0M
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r8)
            java.lang.String r2 = r0.A0f
            r7 = r2
            r8 = r4
            r9 = r1
            r4 = r0
            r3.A00(r4, r5, r6, r7, r8, r9)
            return r1
        L_0x02b1:
            boolean r3 = A0S(r0)
            if (r3 == 0) goto L_0x02ba
            r6.A06()
        L_0x02ba:
            X.LBj r5 = X.C15401Uc7.A0M
            X.0eM r3 = r0.A0o
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r3 = r0.A0f
            r8 = r6
            r9 = r3
            r10 = r4
            r11 = r2
            r6 = r0
            r5.A00(r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.Cnh(com.instagram.tagging.widget.TagsInteractiveLayout, java.util.ArrayList, java.util.ArrayList):boolean");
    }

    public final void CuE() {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, java.lang.Object, com.instagram.tagging.activity.TaggingActivity] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        this.A02 = r4;
        r4.Eom(A01(this.A0T));
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A06 = R.drawable.instagram_check_pano_outline_24;
        A0K2.A0P = true;
        A0K2.A02 = 1QE.A04(DbT.A05(this));
        A0K2.A05 = 2131960992;
        A0K2.A0G = new C64273LXz(this, 68);
        03v.A0B(C51970G9q.A0P(A0K2, r4), new U7D(4));
        DbX.A1A(new C64273LXz(this, 67), DbX.A0M(), r4);
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        TaggingActivity.super.onSaveInstanceState(bundle);
        ArrayList arrayList = this.A0M;
        if (arrayList == null) {
            JTO.A1L();
            throw AnonymousClass00P.createAndThrow();
        } else {
            bundle.putParcelableArrayList("media_tagging_info_list", arrayList);
        }
    }

    public static final int A00(TaggingActivity taggingActivity) {
        String str;
        int i;
        int i2;
        C62630Kj1 kj1 = taggingActivity.A0H;
        if (kj1 == null) {
            str = "tagType";
        } else {
            int ordinal = kj1.ordinal();
            str = "mediaTaggingInfos";
            if (ordinal == 1) {
                ArrayList BbX = taggingActivity.BbX();
                ArrayList A032 = taggingActivity.A03();
                if (A0T(taggingActivity)) {
                    i = A032.size();
                } else {
                    boolean z = taggingActivity.A0R;
                    i = BbX.size();
                    if (!z) {
                        i -= A032.size();
                    }
                }
                LOQ loq = LOQ.A00;
                UserSession A0l2 = AnonymousClass7TE.A0l(taggingActivity.A0o);
                ArrayList arrayList = taggingActivity.A0M;
                if (arrayList == null) {
                    JTO.A1L();
                    throw AnonymousClass00P.createAndThrow();
                } else if (!loq.A01(A0l2, JTT.A0i(taggingActivity, arrayList).A07, false)) {
                    return i;
                } else {
                    ArrayList arrayList2 = taggingActivity.A0M;
                    if (arrayList2 != null) {
                        int i3 = taggingActivity.A00;
                        if (JTO.A0p(arrayList2, i3).A0A.isEmpty() || !taggingActivity.A0S) {
                            return i;
                        }
                        i2 = JTO.A0p(arrayList2, i3).A0A.size();
                    }
                }
            } else if (ordinal == 2) {
                boolean A0W2 = A0W(taggingActivity, taggingActivity.A00);
                ArrayList arrayList3 = taggingActivity.A0M;
                if (A0W2) {
                    if (arrayList3 != null) {
                        int i4 = taggingActivity.A00;
                        i = JTO.A0p(arrayList3, i4).A0C.size();
                        ArrayList arrayList4 = taggingActivity.A0M;
                        if (arrayList4 != null) {
                            i2 = 0;
                            Iterator A1G = AnonymousClass7TE.A1G(JTO.A0p(arrayList4, i4).A0D);
                            while (A1G.hasNext()) {
                                i2 += ((MediaSuggestedProductTag) AnonymousClass7TF.A0a(A1G)).A09() ? 1 : 0;
                            }
                        }
                    }
                } else if (arrayList3 != null) {
                    return JTT.A0i(taggingActivity, arrayList3).A0C.size();
                }
            } else {
                throw AnonymousClass7TE.A1B("Unsupported tag type");
            }
            return i + i2;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final int A01(boolean z) {
        if (z) {
            return 2131969869;
        }
        C62630Kj1 kj1 = this.A0H;
        if (kj1 == null) {
            0qQ.A0F("tagType");
            throw AnonymousClass00P.createAndThrow();
        }
        int ordinal = kj1.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 2131969865;
            }
            0wb.A03("TaggingActivity", "Unsupported tag type");
            return 0;
        } else if (A0T(this)) {
            return 2131952285;
        } else {
            return 2131969343;
        }
    }

    public static final C60762Jqt A02(TaggingActivity taggingActivity) {
        String str;
        C64832Lit A002 = C64832Lit.A04.A00(AnonymousClass7TE.A0l(taggingActivity.A0o));
        String str2 = taggingActivity.A0K;
        if (str2 == null) {
            str = "_shoppingCreationSessionId";
        } else {
            ArrayList arrayList = taggingActivity.A0M;
            if (arrayList != null) {
                return A002.A00(str2, JTT.A0i(taggingActivity, arrayList).A06);
            }
            str = "mediaTaggingInfos";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A05() {
        if (this.A0X == null) {
            this.A0X = new C62100Ka5(this);
        }
        if (this.A0Y == null) {
            this.A0Y = new C62101Ka6(this);
        }
        1Ng A0R2 = DbX.A0R(this.A0o);
        Class<C62153KbB> cls = C62153KbB.class;
        1wn r0 = this.A0X;
        if (r0 != null) {
            A0R2.A01(r0, cls);
            Class<C62152KbA> cls2 = C62152KbA.class;
            1wn r02 = this.A0Y;
            if (r02 != null) {
                A0R2.A01(r02, cls2);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A0A(TaggingActivity taggingActivity) {
        IgSegmentedTabLayout igSegmentedTabLayout = taggingActivity.A0a;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.setVisibility(8);
            PhotoScrollView photoScrollView = taggingActivity.A0I;
            if (photoScrollView != null) {
                0nA.A0T(photoScrollView, 0);
            }
        }
        View view = taggingActivity.A0U;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.tagging.activity.TaggingActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        if (r4 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(com.instagram.tagging.activity.TaggingActivity r31) {
        /*
            r3 = r31
            boolean r0 = r3.CKU()
            if (r0 == 0) goto L_0x000c
            r3.EvN()
        L_0x000b:
            return
        L_0x000c:
            boolean r0 = A0T(r3)
            r8 = 0
            if (r0 == 0) goto L_0x0039
            X.0eM r0 = r3.A0o
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.util.ArrayList r0 = r3.C3x()
            int r1 = r0.size()
            boolean r0 = r3.A0g
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.LTZ.A0G(r8, r2, r0, r1)
            if (r0 == 0) goto L_0x0039
            java.util.ArrayList r0 = r3.C3x()
            int r0 = r0.size()
            X.C49926FFc.A01(r3, r0)
            return
        L_0x0039:
            X.Kj1 r0 = r3.A0H
            if (r0 != 0) goto L_0x0047
            java.lang.String r7 = "tagType"
        L_0x003f:
            X.0qQ.A0F(r7)
        L_0x0042:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0047:
            int r0 = r0.ordinal()
            r5 = 1
            java.lang.String r7 = "tagSearchController"
            if (r0 == r5) goto L_0x00bf
            r6 = 2
            if (r0 != r6) goto L_0x000b
            r3.A05()
            java.util.Set r1 = r3.A0n
            java.lang.String r0 = r3.A0X()
            r1.add(r0)
            X.LyL r1 = r3.A0d
            if (r1 == 0) goto L_0x003f
            java.lang.String r19 = r3.A0X()
            X.6SR r0 = X.AnonymousClass6SR.A01()
            r0.A0V = r5
            X.MXe r2 = r1.A01
            java.util.ArrayList r0 = r2.BgW()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r0)
            X.3kF r23 = X.C249713kF.A00
            com.instagram.common.session.UserSession r4 = r1.A00
            java.lang.String r16 = r3.getModuleName()
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.Uxb r9 = X.C16581Uxb.FEED_SHARING
            r1 = r2
            com.instagram.tagging.activity.TaggingActivity r1 = (com.instagram.tagging.activity.TaggingActivity) r1
            java.lang.String r5 = r1.A0K
            if (r5 != 0) goto L_0x008d
            java.lang.String r7 = "_shoppingCreationSessionId"
            goto L_0x003f
        L_0x008d:
            X.AnonymousClass7TF.A1C(r12, r6, r9)
            X.0sn r6 = X.0sn.A00
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r10 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState
            r24 = r10
            r25 = r6
            r26 = r6
            r27 = r6
            r28 = r6
            r29 = r6
            r30 = r6
            r31 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            java.util.ArrayList r0 = r2.Aas()
            X.C64174LSb.A04(r10, r7, r0)
            java.util.List r0 = r10.A04
            r2 = 0
            java.util.List r0 = X.JTU.A0b(r0, r6)
            r10.A04 = r0
            java.util.ArrayList r0 = r1.A0M
            if (r0 != 0) goto L_0x0111
            X.JTO.A1L()
            goto L_0x0042
        L_0x00bf:
            X.LSN r2 = r3.A0E
            if (r2 != 0) goto L_0x00c7
            java.lang.String r7 = "helpTextController"
            goto L_0x003f
        L_0x00c7:
            android.view.View r0 = r2.A0D
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ListView r0 = r2.A02
            if (r0 == 0) goto L_0x00d5
            r0.setVisibility(r1)
        L_0x00d5:
            A0A(r3)
            boolean r0 = A0T(r3)
            if (r0 == 0) goto L_0x00f3
            X.JbO r1 = r3.A06
            if (r1 != 0) goto L_0x00e6
            java.lang.String r7 = "creationLogger"
            goto L_0x003f
        L_0x00e6:
            java.lang.String r0 = r3.getModuleName()
            r1.A0D(r0)
            X.LyL r4 = r3.A0d
            if (r4 != 0) goto L_0x00f8
            goto L_0x003f
        L_0x00f3:
            X.LyL r4 = r3.A0d
            if (r4 == 0) goto L_0x003f
            r5 = 0
        L_0x00f8:
            java.lang.String r2 = r3.A0f
            com.instagram.common.session.UserSession r1 = r4.A00
            X.MXe r0 = r4.A01
            java.util.ArrayList r0 = r0.BbX()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1D(r0)
            X.LBj r6 = X.C15401Uc7.A0M
            r7 = r3
            r8 = r1
            r9 = r4
            r10 = r2
            r12 = r5
            r6.A00(r7, r8, r9, r10, r11, r12)
            return
        L_0x0111:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTT.A0i(r1, r0)
            java.util.List r0 = r0.A0G
            if (r0 == 0) goto L_0x0126
            java.util.List r0 = X.00k.A0X(r0)
            java.util.List r0 = X.00k.A0W(r0)
            X.0qQ.A0B(r0, r2)
            r10.A00 = r0
        L_0x0126:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r6 = r1.A0D
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x0130:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x013e
            com.instagram.user.model.Product r0 = X.JTS.A0Y(r7)
            r1.add(r0)
            goto L_0x0130
        L_0x013e:
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r11 = new com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState
            r11.<init>(r6, r8, r1, r8)
            java.lang.String r0 = X.C64174LSb.A02(r10, r11)
            java.util.List r1 = r10.A03
            java.util.List r0 = X.0sr.A1N(r0)
            java.util.List r0 = X.JTU.A0b(r1, r0)
            r10.A03 = r0
            r13 = r8
            r14 = r8
            r15 = r8
            r17 = r8
            r18 = r8
            r20 = r5
            r21 = r8
            r22 = r2
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r28 = X.C64174LSb.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r24 = r8
            r25 = r3
            r26 = r3
            r27 = r4
            r29 = r8
            r30 = r2
            r31 = r2
            r23.A0j(r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0B(com.instagram.tagging.activity.TaggingActivity):void");
    }

    public static final void A0C(TaggingActivity taggingActivity) {
        String str;
        LSN lsn;
        1iA r1;
        C62630Kj1 kj1;
        ArrayList arrayList = taggingActivity.A0M;
        if (arrayList == null) {
            str = "mediaTaggingInfos";
        } else {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) DbZ.A0g(arrayList, taggingActivity.A00);
            int A002 = A00(taggingActivity);
            C62630Kj1 kj12 = taggingActivity.A0H;
            if (kj12 == null) {
                str = "tagType";
            } else {
                int ordinal = kj12.ordinal();
                str = "helpTextController";
                boolean z = false;
                if (ordinal == 1) {
                    TextView textView = taggingActivity.A0V;
                    if (!taggingActivity.A0S || taggingActivity.A0R || !DbT.A1b(taggingActivity.A03())) {
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    } else if (textView != null) {
                        textView.setVisibility(0);
                    }
                    lsn = taggingActivity.A0E;
                    if (lsn != null) {
                        r1 = mediaTaggingInfo.A03;
                        kj1 = C62630Kj1.PEOPLE;
                    }
                } else if (ordinal == 2) {
                    TextView textView2 = taggingActivity.A0V;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    lsn = taggingActivity.A0E;
                    if (lsn != null) {
                        r1 = mediaTaggingInfo.A03;
                        if (taggingActivity.A0D != null) {
                            z = true;
                        }
                        kj1 = C62630Kj1.PRODUCT;
                    }
                } else {
                    return;
                }
                LSN.A00(r1, lsn, kj1, A002, z);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0E(TaggingActivity taggingActivity) {
        String str;
        String str2;
        TaggingActivity taggingActivity2 = taggingActivity;
        if (A0W(taggingActivity2, taggingActivity2.A00)) {
            UserSession A0l2 = AnonymousClass7TE.A0l(taggingActivity2.A0o);
            String str3 = taggingActivity2.A0K;
            if (str3 == null) {
                str2 = "_shoppingCreationSessionId";
            } else {
                boolean z = !A0U(taggingActivity2);
                ArrayList arrayList = taggingActivity2.A0M;
                if (arrayList == null) {
                    str2 = "mediaTaggingInfos";
                } else {
                    int i = taggingActivity2.A00;
                    0sn r3 = JTO.A0p(arrayList, i).A0D;
                    if (r3 == null) {
                        r3 = 0sn.A00;
                    }
                    C60762Jqt A022 = A02(taggingActivity2);
                    if (A0S(taggingActivity2)) {
                        str = "opt";
                    } else {
                        str = "seller";
                    }
                    0qQ.A0B(A0l2, 0);
                    HashMap A032 = LTQ.A03(r3);
                    long j = 0;
                    long A052 = JTU.A05(JTO.A0z("high_confidence_count", A032));
                    long A053 = JTU.A05(JTO.A0z("medium_confidence_count", A032));
                    Number A0z = JTO.A0z("low_confidence_count", A032);
                    if (A0z != null) {
                        j = (long) A0z.intValue();
                    }
                    0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(taggingActivity2, A0l2), "ig_suggested_tags_view_tags");
                    String str4 = A0l2.A06;
                    LTQ.A06(A0e2, str4, str3);
                    A0e2.AAJ(C46325Dbt.A00(9, 10, 79), str3);
                    A0e2.A9F("ig_user_id", 00y.A0n(10, str4));
                    A0e2.AAJ("user_tag_type", str);
                    JTQ.A17(A0e2, z);
                    A0e2.A9F("high_confidence_suggestions_count", Long.valueOf(A052));
                    JTU.A0w(A0e2, A053, j);
                    A0e2.AAK(A022, "suggested_tags_info");
                    C51970G9q.A19(A0e2, (long) i);
                    A0e2.AAJ("media_format", "feed");
                    A0e2.Cgf();
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0F(TaggingActivity taggingActivity) {
        View A0D2;
        ArrayList arrayList = taggingActivity.A0M;
        if (arrayList == null) {
            JTO.A1L();
            throw AnonymousClass00P.createAndThrow();
        } else if (JTT.A0i(taggingActivity, arrayList).A03 == 1iA.A0a) {
            ReboundViewPager reboundViewPager = taggingActivity.A05;
            if (reboundViewPager == null || (A0D2 = reboundViewPager.A0D(taggingActivity.A00)) == null) {
                throw AnonymousClass7TE.A0y();
            }
            taggingActivity.A0e = (C62940Kos) A0D2.getTag();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r11.A0R == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(com.instagram.tagging.activity.TaggingActivity r11) {
        /*
            android.view.View r8 = r11.A0U
            if (r8 == 0) goto L_0x00cb
            X.0eM r4 = r11.A0o
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            java.lang.String r0 = r11.A0X()
            X.3Q2 r0 = r1.A03(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0032
            X.JxB r0 = r0.A0v
            if (r0 == 0) goto L_0x0032
            java.lang.Integer r0 = r0.A00
        L_0x001f:
            r5 = 0
            boolean r3 = X.AnonymousClass7TF.A1V(r0)
            X.Kj1 r1 = r11.A0H
            if (r1 != 0) goto L_0x0034
            java.lang.String r0 = "tagType"
        L_0x002a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0032:
            r0 = r2
            goto L_0x001f
        L_0x0034:
            X.Kj1 r0 = X.C62630Kj1.PEOPLE
            if (r1 != r0) goto L_0x00d5
            if (r3 != 0) goto L_0x00d5
            boolean r0 = A0T(r11)
            if (r0 != 0) goto L_0x0045
            boolean r0 = r11.A0R
            r10 = 0
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r10 = 1
        L_0x0046:
            r8.setVisibility(r5)
            r0 = 2131427734(0x7f0b0196, float:1.8477093E38)
            r8.findViewById(r0)
            r0 = 2131435016(0x7f0b1e08, float:1.8491862E38)
            android.widget.TextView r7 = X.AnonymousClass7TE.A0d(r8, r0)
            r0 = 2131427735(0x7f0b0197, float:1.8477095E38)
            android.view.View r9 = r8.findViewById(r0)
            r0 = 2131435017(0x7f0b1e09, float:1.8491864E38)
            android.view.View r6 = r8.findViewById(r0)
            java.util.ArrayList r3 = r11.A0M
            java.lang.String r0 = "mediaTaggingInfos"
            if (r3 == 0) goto L_0x002a
            int r1 = r11.A00
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTO.A0p(r3, r1)
            java.lang.String r0 = r0.A05
            if (r0 != 0) goto L_0x0084
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTO.A0p(r3, r1)
            java.util.ArrayList r0 = r0.A0E
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0085
        L_0x0084:
            r5 = 1
        L_0x0085:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = r11.A0g
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r4 = X.LTZ.A0F(r2, r1, r0)
            r0 = r10 ^ 1
            if (r6 == 0) goto L_0x00cb
            if (r9 == 0) goto L_0x00cb
            android.content.Context r3 = r6.getContext()
            r2 = 17
            r10 = 8
            r9.setVisibility(r10)
            r1 = 0
            if (r0 == 0) goto L_0x00d8
            r7.getClass()
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r2
            if (r4 == 0) goto L_0x00cc
            r0 = 2131952284(0x7f13029c, float:1.9541006E38)
        L_0x00b7:
            r7.setText(r0)
            X.DbU.A12(r3, r7, r0)
            r0 = 65
            X.C64273LXz.A00(r6, r0, r11)
            X.1QE.A0H(r6, r7)
            r6.setVisibility(r1)
            r8.setVisibility(r1)
        L_0x00cb:
            return
        L_0x00cc:
            r0 = 2131964480(0x7f133240, float:1.9565743E38)
            if (r5 == 0) goto L_0x00b7
            r0 = 2131961441(0x7f132661, float:1.955958E38)
            goto L_0x00b7
        L_0x00d5:
            r10 = 8
            goto L_0x00db
        L_0x00d8:
            r6.setVisibility(r10)
        L_0x00db:
            r8.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0G(com.instagram.tagging.activity.TaggingActivity):void");
    }

    public static final void A0H(TaggingActivity taggingActivity) {
        ArrayList arrayList = taggingActivity.A0M;
        if (arrayList == null) {
            JTO.A1L();
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) AnonymousClass7TF.A0a(A1G);
            mediaTaggingInfo.A0D = AnonymousClass7TE.A1C();
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) taggingActivity.A0m.get(mediaTaggingInfo.A06);
            if (tagsInteractiveLayout != null) {
                ArrayList arrayList2 = tagsInteractiveLayout.A0C;
                if (!arrayList2.isEmpty()) {
                    tagsInteractiveLayout.A0A(arrayList2);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(com.instagram.tagging.activity.TaggingActivity r3) {
        /*
            com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout r1 = r3.A0a
            if (r1 == 0) goto L_0x001a
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.tagging.widget.PhotoScrollView r2 = r3.A0I
            if (r2 == 0) goto L_0x001a
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0T(r2, r0)
        L_0x001a:
            A0G(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0I(com.instagram.tagging.activity.TaggingActivity):void");
    }

    public static final void A0J(TaggingActivity taggingActivity) {
        C62940Kos kos = taggingActivity.A0e;
        if (kos != null) {
            ArrayList arrayList = taggingActivity.A0M;
            if (arrayList == null) {
                JTO.A1L();
                throw AnonymousClass00P.createAndThrow();
            }
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) DbZ.A0g(arrayList, taggingActivity.A00);
            LOQ loq = LOQ.A00;
            UserSession A0l2 = AnonymousClass7TE.A0l(taggingActivity.A0o);
            ArrayList arrayList2 = taggingActivity.A0M;
            if (arrayList2 == null) {
                JTO.A1L();
                throw AnonymousClass00P.createAndThrow();
            } else {
                kos.A00(LTZ.A02(mediaTaggingInfo, loq.A01(A0l2, JTT.A0i(taggingActivity, arrayList2).A07, false)));
            }
        }
    }

    public static final void A0K(TaggingActivity taggingActivity, Tag tag) {
        TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) taggingActivity.A0m.get(taggingActivity.A0X());
        if (tagsInteractiveLayout != null) {
            tagsInteractiveLayout.A09(tag);
        }
        A0J(taggingActivity);
        A0C(taggingActivity);
        taggingActivity.A06();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0L(com.instagram.tagging.activity.TaggingActivity r7, X.C62630Kj1 r8, boolean r9) {
        /*
            com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout r0 = r7.A0a
            if (r0 == 0) goto L_0x013b
            r7.A0H = r8
            A0G(r7)
            X.Djx r2 = r7.A08
            if (r2 == 0) goto L_0x0037
            X.Djx r0 = r7.A09
            if (r0 == 0) goto L_0x0037
            X.Kj1 r0 = r7.A0H
            if (r0 == 0) goto L_0x0067
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0051
            r0 = 2
            if (r1 != r0) goto L_0x0037
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131974956(0x7f135b2c, float:1.958699E38)
            X.DbT.A1A(r1, r2, r0)
            X.Djx r2 = r7.A09
            if (r2 == 0) goto L_0x0037
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131974960(0x7f135b30, float:1.9586999E38)
        L_0x0034:
            X.DbT.A1A(r1, r2, r0)
        L_0x0037:
            com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout r3 = r7.A0a
            r6 = 1
            if (r3 == 0) goto L_0x006e
            X.Kj1 r0 = r7.A0H
            if (r0 == 0) goto L_0x0067
            int r2 = r0.ordinal()
            r1 = 1
            if (r2 == r6) goto L_0x006a
            r0 = 2
            if (r2 == r0) goto L_0x006b
            java.lang.String r0 = "Unsupported tag type"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0051:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131974957(0x7f135b2d, float:1.9586993E38)
            X.DbT.A1A(r1, r2, r0)
            X.Djx r2 = r7.A09
            if (r2 == 0) goto L_0x0037
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131974959(0x7f135b2f, float:1.9586997E38)
            goto L_0x0034
        L_0x0067:
            java.lang.String r5 = "tagType"
            goto L_0x0074
        L_0x006a:
            r1 = 0
        L_0x006b:
            r3.A01(r1, r6)
        L_0x006e:
            X.LSN r4 = r7.A0E
            if (r4 != 0) goto L_0x007c
            java.lang.String r5 = "helpTextController"
        L_0x0074:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007c:
            java.util.ArrayList r0 = r7.A0M
            if (r0 != 0) goto L_0x0083
            java.lang.String r5 = "mediaTaggingInfos"
            goto L_0x0074
        L_0x0083:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTT.A0i(r7, r0)
            X.1iA r3 = r0.A03
            X.Kj1 r2 = r7.A0H
            java.lang.String r5 = "tagType"
            if (r2 == 0) goto L_0x0074
            int r1 = A00(r7)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r7.A0D
            if (r0 != 0) goto L_0x0098
            r6 = 0
        L_0x0098:
            r4.A05 = r2
            r4.A00 = r1
            X.LSN.A00(r3, r4, r2, r1, r6)
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x00b1
            android.view.ViewStub r3 = r4.A0F
            X.Kj1 r2 = r4.A05
            X.Kj1 r1 = X.C62630Kj1.PRODUCT
            r0 = 8
            if (r2 != r1) goto L_0x00ae
            r0 = 0
        L_0x00ae:
            r3.setVisibility(r0)
        L_0x00b1:
            X.LSN.A02(r4)
            X.LSN.A01(r4)
            X.Ka8 r0 = r7.A0F
            if (r0 == 0) goto L_0x00c4
            X.Kj1 r1 = r7.A0H
            if (r1 == 0) goto L_0x0074
            com.instagram.tagging.widget.TagsInteractiveLayout r0 = r0.A01
            r0.setEditingTagType(r1)
        L_0x00c4:
            X.JeL r1 = r7.A0c
            if (r1 == 0) goto L_0x00d4
            X.Kj1 r0 = r7.A0H
            if (r0 == 0) goto L_0x0074
            r1.A00 = r0
            r0 = -1751941621(0xffffffff97937e0b, float:-9.53147E-25)
            X.0fE.A00(r1, r0)
        L_0x00d4:
            if (r9 == 0) goto L_0x013b
            X.LMz r4 = r7.A0G
            if (r4 != 0) goto L_0x00dd
            java.lang.String r5 = "taggingTypeIndicatorController"
            goto L_0x0074
        L_0x00dd:
            X.Kj1 r0 = r7.A0H
            if (r0 == 0) goto L_0x0074
            int r1 = r0.ordinal()
            r3 = 1
            if (r1 == r3) goto L_0x012e
            r0 = 2
            if (r1 != r0) goto L_0x0134
            android.widget.ImageView r2 = r4.A03
            r0 = 2131239605(0x7f0822b5, float:1.8095522E38)
        L_0x00f0:
            r2.setImageResource(r0)
            android.view.View r1 = r4.A01
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r4.A02
            r0 = 8
            r1.setVisibility(r0)
            android.os.Handler r1 = r4.A00
            java.lang.Runnable r0 = r4.A05
            r1.removeCallbacks(r0)
            X.2co r0 = X.C315596kB.A02
            X.5nL r1 = X.C294975nL.A00(r2)
            X.2co r0 = X.LMz.A06
            X.5nL r0 = r1.A0E(r0)
            X.5nL r3 = r0.A0F(r3)
            r2 = 1063675494(0x3f666666, float:0.9)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.A0U(r2, r1, r0)
            r3.A0V(r2, r1, r0)
            r0 = 0
            r3.A0M(r0, r1)
            r0 = 24
            X.C65724Lye.A00(r3, r4, r0)
            return
        L_0x012e:
            android.widget.ImageView r2 = r4.A03
            r0 = 2131239468(0x7f08222c, float:1.8095244E38)
            goto L_0x00f0
        L_0x0134:
            java.lang.String r0 = "Unsupported tag type"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0L(com.instagram.tagging.activity.TaggingActivity, X.Kj1, boolean):void");
    }

    public static final void A0M(TaggingActivity taggingActivity, Product product) {
        String str = null;
        1NY A0a2 = AnonymousClass7TG.A0a(DbT.A0X(taggingActivity.A0o));
        A0a2.A0K("commerce/products/%s/on_tag/", new Object[]{product.A0H});
        A0a2.A0O((15p) null, 1XP.class, 1XY.class, false);
        User user = product.A0B;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        }
        A0a2.A0G("merchant_id", str);
        1ES.A03(DbT.A0U(A0a2, true));
    }

    public static final void A0N(TaggingActivity taggingActivity, Product product, String str) {
        Map map = taggingActivity.A0m;
        if (map.containsKey(str)) {
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) map.get(str);
            if (tagsInteractiveLayout != null) {
                TagsInteractiveLayout.A01(tagsInteractiveLayout, product, true);
            }
        } else if (taggingActivity.A0n.contains(str)) {
            C65706LyL lyL = taggingActivity.A0d;
            if (lyL == null) {
                0qQ.A0F("tagSearchController");
                throw AnonymousClass00P.createAndThrow();
            }
            C66573MXe mXe = lyL.A01;
            Iterator it = mXe.BgW().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (JTU.A0Y(it).equals(product.A0H)) {
                        break;
                    }
                } else {
                    mXe.BgW().add(new ProductTag(product));
                    break;
                }
            }
            lyL.AVW();
        }
        A0M(taggingActivity, product);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbY.A0R(r10.A0o), 36324342309662744L) != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0O(com.instagram.tagging.activity.TaggingActivity r10, com.instagram.user.model.User r11) {
        /*
            java.util.ArrayList r0 = r10.A0M
            r4 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r9 = "mediaTaggingInfos"
        L_0x0007:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            java.util.Iterator r8 = X.AnonymousClass7TE.A1G(r0)
        L_0x0013:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r6 = X.AnonymousClass7TF.A0a(r8)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r6 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r6
            java.util.ArrayList r0 = r6.A0E
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            boolean r0 = r0.isEmpty()
            java.lang.String r9 = "creationLogger"
            if (r0 != 0) goto L_0x0091
            java.util.ArrayList r0 = r6.A0E
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = r11.getId()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0091
            java.lang.String r7 = r11.getId()
            boolean r0 = r10.A0Q
            if (r0 != 0) goto L_0x0059
            X.0eM r0 = r10.A0o
            X.0lg r3 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324342309662744(0x810ccc00113018, double:3.034998570792488E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5 = 0
            if (r0 == 0) goto L_0x005a
        L_0x0059:
            r5 = 1
        L_0x005a:
            java.util.ArrayList r3 = r6.A0B
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r3)
        L_0x0060:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r1)
            com.instagram.tagging.model.Tag r2 = (com.instagram.tagging.model.Tag) r2
            java.lang.String r0 = r2.getId()
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x0060
            if (r5 == 0) goto L_0x007b
            r3.remove(r2)
        L_0x007b:
            java.util.ArrayList r1 = r6.A09
            java.lang.String r0 = r2.getId()
            r1.remove(r0)
        L_0x0084:
            java.util.ArrayList r0 = r6.A0E
            r0.remove(r7)
            X.JbO r0 = r10.A06
            if (r0 == 0) goto L_0x0007
            r0.A05()
            goto L_0x0013
        L_0x0091:
            java.lang.String r1 = r6.A05
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = r11.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r6.A05 = r4
            X.JbO r0 = r10.A06
            if (r0 == 0) goto L_0x0007
            r0.A05()
            goto L_0x0013
        L_0x00aa:
            A0G(r10)
            A0C(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0O(com.instagram.tagging.activity.TaggingActivity, com.instagram.user.model.User):void");
    }

    public static final void A0P(TaggingActivity taggingActivity, String str) {
        Map map = taggingActivity.A0m;
        if (map.containsKey(str)) {
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) map.get(str);
            if (tagsInteractiveLayout != null) {
                tagsInteractiveLayout.AVW();
            }
        } else if (taggingActivity.A0n.contains(str)) {
            C65706LyL lyL = taggingActivity.A0d;
            if (lyL == null) {
                0qQ.A0F("tagSearchController");
                throw AnonymousClass00P.createAndThrow();
            } else {
                lyL.AVW();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity, androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.3YT, java.lang.Object] */
    public static final void A0Q(TaggingActivity taggingActivity, boolean z) {
        CharSequence A16;
        ? r1 = taggingActivity;
        if (r1.A01 == null) {
            View findViewById = r1.findViewById(R.id.row_feed_cta_stub);
            0qQ.A0C(findViewById, C273654mx.A00(15));
            r1.A01 = ((ViewStub) findViewById).inflate();
        }
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r3 = r1.A0o;
        if (DbX.A0l(r0, r3).A1x()) {
            View view = r1.A01;
            if (view != null) {
                AnonymousClass9PF r13 = r1.A07;
                if (r13 == null) {
                    r13 = new AnonymousClass9PF(DbT.A05(r1), AnonymousClass7TE.A0l(r3), (C46205DQi) null, r1, new C63664L2a(r1), false);
                    view.setTag(r13.A01(DbT.A05(r1), view, (ViewGroup) null, AnonymousClass7TE.A0l(r3), new Object(), r1));
                    r1.A07 = r13;
                }
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                C254073rt r6 = (C254073rt) tag;
                ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = r1.A0D;
                0qQ.A0B(r6, 0);
                if (productCollectionFeedTaggingMeta != null) {
                    ViewGroup viewGroup = r6.A0J;
                    viewGroup.setVisibility(0);
                    if (z) {
                        r6.A0P.setVisibility(0);
                        r6.A0O.setVisibility(8);
                    }
                    AnonymousClass3z2 r7 = r6.A0S;
                    ColorFilterAlphaImageView colorFilterAlphaImageView = r6.A0P;
                    int i = r7.A03;
                    colorFilterAlphaImageView.setNormalColor(i);
                    IgSimpleImageView igSimpleImageView = r6.A0O;
                    igSimpleImageView.setColorFilter(i);
                    TextView textView = r6.A01;
                    Context context = r13.A00;
                    if (productCollectionFeedTaggingMeta.A00.ordinal() == 2) {
                        A16 = C63263Ku8.A00(context, productCollectionFeedTaggingMeta.A02, (String) null, productCollectionFeedTaggingMeta.A03);
                    } else {
                        A16 = AnonymousClass7TE.A16(context, 2131976619);
                    }
                    textView.setText(A16);
                    String str = productCollectionFeedTaggingMeta.A02;
                    C71662eb r2 = r6.A0Q;
                    View A012 = r2.A01();
                    if (str != null) {
                        A012.setVisibility(0);
                        IgTextView igTextView = r6.A06;
                        igTextView.setVisibility(0);
                        ((TextView) r2.A01()).setText("•");
                        igTextView.setText(str);
                        igTextView.setTextColor(r7.A09);
                    } else {
                        A012.setVisibility(8);
                        r6.A06.setVisibility(8);
                    }
                    textView.setTextColor(r7.A09);
                    viewGroup.setBackgroundColor(r7.A01);
                    r6.A0H.setBackgroundColor(r7.A04);
                    LY7.A00(viewGroup, 8, r6, r13);
                    LYE.A00(igSimpleImageView, 55, r13);
                } else {
                    r6.A0J.setVisibility(8);
                }
            }
            if (r1.A0D == null && r1.A0R()) {
                A09(r1);
            }
        }
    }

    public static final boolean A0T(TaggingActivity taggingActivity) {
        if (!taggingActivity.A0R || taggingActivity.A0S) {
            return false;
        }
        return true;
    }

    public static final boolean A0U(TaggingActivity taggingActivity) {
        ArrayList arrayList = taggingActivity.A0M;
        if (arrayList == null) {
            JTO.A1L();
            throw AnonymousClass00P.createAndThrow();
        } else if (arrayList.size() != 1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (X.182.A06(r5, X.AnonymousClass7TF.A0L(r6, 0), 2342156021399881315L) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (X.182.A06(r5, X.AnonymousClass7TF.A0L(r6, 0), 36313012185859681L) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0V(com.instagram.tagging.activity.TaggingActivity r7) {
        /*
            X.0eM r6 = r7.A0o
            X.0lg r2 = X.DbT.A0X(r6)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36313012184811092(0x81027e00000654, double:3.027833354213552E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            r3 = 0
            if (r0 == 0) goto L_0x006c
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r0 = r7.A0M
            if (r0 == 0) goto L_0x006d
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0033
            X.0lg r2 = X.AnonymousClass7TF.A0L(r6, r3)
            r0 = 36313012185859681(0x81027e00100661, double:3.027833354876684E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            r4 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x0062
            java.util.ArrayList r0 = r7.A0M
            if (r0 == 0) goto L_0x006d
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x0062
            X.0lg r2 = X.AnonymousClass7TF.A0L(r6, r3)
            r0 = 36313012185728608(0x81027e000e0660, double:3.027833354793793E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0062
            X.0lg r2 = X.AnonymousClass7TF.A0L(r6, r3)
            r0 = 2342156021399881315(0x2081027e00150663, double:4.059660806883877E-152)
            boolean r0 = X.182.A06(r5, r2, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x006b
            if (r4 != 0) goto L_0x006b
            if (r1 == 0) goto L_0x006c
        L_0x006b:
            r3 = 1
        L_0x006c:
            return r3
        L_0x006d:
            X.JTO.A1L()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0V(com.instagram.tagging.activity.TaggingActivity):boolean");
    }

    public static final boolean A0W(TaggingActivity taggingActivity, int i) {
        ArrayList arrayList = taggingActivity.A0M;
        if (arrayList != null) {
            return DbT.A1b(JTO.A0p(arrayList, i).A0D);
        }
        JTO.A1L();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A0X() {
        ArrayList arrayList = this.A0M;
        if (arrayList != null) {
            return JTT.A0i(this, arrayList).A06;
        }
        JTO.A1L();
        throw AnonymousClass00P.createAndThrow();
    }

    public final 2dZ AYJ() {
        2dZ r0 = this.A0W;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_actionBarService");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ArrayList BbX() {
        ArrayList arrayList = this.A0M;
        if (arrayList != null) {
            return ((MediaTaggingInfo) DbZ.A0g(arrayList, this.A00)).A0B;
        }
        JTO.A1L();
        throw AnonymousClass00P.createAndThrow();
    }

    public final ArrayList BgW() {
        ArrayList arrayList = this.A0M;
        if (arrayList != null) {
            return ((MediaTaggingInfo) DbZ.A0g(arrayList, this.A00)).A0C;
        }
        JTO.A1L();
        throw AnonymousClass00P.createAndThrow();
    }

    public final ArrayList C3x() {
        ArrayList arrayList = this.A0M;
        if (arrayList != null) {
            return AnonymousClass7TE.A1D(((MediaTaggingInfo) DbZ.A0g(arrayList, this.A00)).A0E);
        }
        JTO.A1L();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKU() {
        ArrayList arrayList = this.A0M;
        if (arrayList == null) {
            JTO.A1L();
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        int i = 0;
        while (A1G.hasNext()) {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) AnonymousClass7TF.A0a(A1G);
            i = i + mediaTaggingInfo.A0C.size() + mediaTaggingInfo.A0B.size();
        }
        return JTQ.A1P(i, 20);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, X.G6R, com.instagram.tagging.activity.TaggingActivity, android.app.Activity] */
    public final void DLd() {
        C63634L0w l0w;
        int i;
        int i2;
        C59899JbO jbO = this.A06;
        if (jbO == null) {
            0qQ.A0F("creationLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        jbO.A0D(getModuleName());
        if (this.A0i) {
            LM3.A00(new LM3(this), 2131961825, 2131961797);
        } else if (this.A0j) {
            C56588I2s.A01(this, 2131968985);
        } else {
            if (this.A0h) {
                l0w = new C63634L0w(this);
                i = 2131953238;
                i2 = 2131953236;
            } else if (this.A0l) {
                l0w = new C63634L0w(this);
                i = 2131953239;
                i2 = 2131953237;
            } else {
                AnonymousClass0eM r3 = this.A0o;
                if (LTZ.A0G((28D) null, AnonymousClass7TE.A0l(r3), Boolean.valueOf(this.A0g), C3x().size())) {
                    C49926FFc.A01(this, C3x().size());
                    return;
                } else if (!LTZ.A0E(this, AnonymousClass7TE.A0l(r3), this, Boolean.valueOf(this.A0g))) {
                    A08();
                    return;
                } else {
                    return;
                }
            }
            Dba.A1L(JTU.A0N(l0w.A00, i, i2));
        }
    }

    public final void Dp9(MediaSuggestedProductTag mediaSuggestedProductTag, Product product, boolean z) {
        Product product2;
        String str;
        String str2;
        String str3;
        MediaSuggestedProductTag mediaSuggestedProductTag2 = mediaSuggestedProductTag;
        C249803kO it = ImmutableList.copyOf((Collection) mediaSuggestedProductTag2.A02).iterator();
        0qQ.A07(it);
        String str4 = null;
        Integer num = null;
        Float f = null;
        while (true) {
            product2 = product;
            if (!it.hasNext()) {
                break;
            }
            MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer = (MediaSuggestedProductTagProductItemContainer) it.next();
            if (0qQ.A0K(C14502TxO.A00(mediaSuggestedProductTagProductItemContainer.A01).A0H, product2.A0H)) {
                num = Integer.valueOf(ImmutableList.copyOf((Collection) mediaSuggestedProductTag2.A02).indexOf(mediaSuggestedProductTagProductItemContainer));
                f = Float.valueOf(mediaSuggestedProductTagProductItemContainer.A00);
            }
        }
        boolean A092 = mediaSuggestedProductTag2.A09();
        AnonymousClass0eM r1 = this.A0o;
        UserSession A0l2 = AnonymousClass7TE.A0l(r1);
        String str5 = this.A0K;
        if (str5 == null) {
            str3 = "_shoppingCreationSessionId";
        } else {
            boolean z2 = !A0U(this);
            int i = this.A00;
            r1.getValue();
            if (!mediaSuggestedProductTag2.A09() || !z) {
                str = "add";
            } else {
                str = "change";
            }
            if (A092) {
                str4 = JTT.A0n(mediaSuggestedProductTag2);
            }
            String str6 = product2.A0H;
            PointF pointF = mediaSuggestedProductTag2.A00;
            C60762Jqt A022 = A02(this);
            C62565Khv khv = mediaSuggestedProductTag2.A01;
            0qQ.A07(khv);
            String str7 = this.A0L;
            if (str7 == null) {
                str3 = "priorSubmodule";
            } else {
                if (A0S(this)) {
                    str2 = "opt";
                } else {
                    str2 = "seller";
                }
                LTQ.A04(pointF, A022, this, A0l2, khv, f, num, str5, str, str4, str6, str7, "feed", str2, i, z2);
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity, android.app.Activity] */
    public final void EvN() {
        String str;
        String str2;
        C59899JbO jbO = this.A06;
        if (jbO == null) {
            str2 = "creationLogger";
        } else {
            if (this.A0Q) {
                str = "edit_media_info";
            } else {
                str = "followers_share";
            }
            ArrayList arrayList = this.A0M;
            if (arrayList != null) {
                Iterator A1G = AnonymousClass7TE.A1G(arrayList);
                int i = 0;
                while (A1G.hasNext()) {
                    i += ((MediaTaggingInfo) AnonymousClass7TF.A0a(A1G)).A0B.size();
                }
                ArrayList arrayList2 = this.A0M;
                if (arrayList2 != null) {
                    Iterator A1G2 = AnonymousClass7TE.A1G(arrayList2);
                    int i2 = 0;
                    while (A1G2.hasNext()) {
                        i2 += ((MediaTaggingInfo) AnonymousClass7TF.A0a(A1G2)).A0C.size();
                    }
                    jbO.A0E(str, i, i2, A0S(this));
                    if (A0T(this)) {
                        C49926FFc.A00(this);
                        return;
                    } else {
                        C59689JTv.A07(this, 2131969667);
                        return;
                    }
                }
            }
            str2 = "mediaTaggingInfos";
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        C62630Kj1 kj1 = this.A0H;
        if (kj1 == null) {
            0qQ.A0F("tagType");
            throw AnonymousClass00P.createAndThrow();
        }
        int ordinal = kj1.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return "";
            }
            return "product_tagging";
        } else if (A0T(this)) {
            return "collab_tagging";
        } else {
            return "people_tagging";
        }
    }

    private final ArrayList A03() {
        ArrayList BbX = BbX();
        ArrayList arrayList = this.A0M;
        if (arrayList == null) {
            JTO.A1L();
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList A1D = AnonymousClass7TE.A1D(JTT.A0i(this, arrayList).A0E);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = BbX.size();
        for (int i = 0; i < size; i++) {
            Tag tag = (Tag) BbX.get(i);
            if (A1D.contains(tag.getId())) {
                A1C.add(tag);
            }
        }
        return A1C;
    }

    private final ArrayList A04() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList arrayList = this.A0M;
        if (arrayList == null) {
            JTO.A1L();
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            ArrayList arrayList2 = ((MediaTaggingInfo) AnonymousClass7TF.A0a(A1G)).A0D;
            if (arrayList2 != null) {
                A1C.addAll(arrayList2);
            }
        }
        return AnonymousClass7TE.A1D(LTX.A0A(A1C));
    }

    private final void A06() {
        C254073rt r0;
        if (!A0R()) {
            this.A0D = null;
            View view = this.A01;
            if (view != null && (r0 = (C254073rt) view.getTag()) != null) {
                r0.A0J.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, java.lang.Object, com.instagram.tagging.activity.TaggingActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    private final void A07() {
        String str;
        String str2;
        View findViewById = findViewById(R.id.tagging_tab_bar_view_stub);
        0qQ.A0C(findViewById, C273654mx.A00(15));
        View inflate = ((ViewStub) findViewById).inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout");
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) inflate;
        this.A0a = igSegmentedTabLayout;
        if (igSegmentedTabLayout != null) {
            this.A0o.getValue();
        }
        C46720Djx djx = new C46720Djx(DbT.A05(this), new C49627Ezk(getApplicationContext().getDrawable(R.drawable.instagram_tag_down_pano_outline_24), (CharSequence) null, (CharSequence) null, -1, true));
        this.A08 = djx;
        IgSegmentedTabLayout igSegmentedTabLayout2 = this.A0a;
        if (igSegmentedTabLayout2 != null) {
            igSegmentedTabLayout2.addView(djx);
        }
        C46720Djx djx2 = this.A08;
        if (djx2 != null) {
            C64273LXz.A00(djx2, 70, this);
        }
        if (this.A0T) {
            C46720Djx djx3 = new C46720Djx(DbT.A05(this), new C49627Ezk(getApplicationContext().getDrawable(R.drawable.instagram_shopping_bag_pano_outline_24), (CharSequence) null, (CharSequence) null, -1, true));
            this.A09 = djx3;
            IgSegmentedTabLayout igSegmentedTabLayout3 = this.A0a;
            if (igSegmentedTabLayout3 != null) {
                igSegmentedTabLayout3.addView(djx3);
            }
            C59899JbO jbO = this.A06;
            str = "creationLogger";
            if (jbO != null) {
                if (this.A0Q) {
                    str2 = "edit_media_info";
                } else {
                    str2 = "followers_share";
                }
                boolean A0S2 = A0S(this);
                0Aj A0e2 = AnonymousClass7TE.A0e(jbO.A04, "instagram_shopping_product_tagging_tab_impression");
                A0e2.AAJ("waterfall_id", C59899JbO.A02(A0e2, jbO, "session_instance_id", C59899JbO.A02(A0e2, jbO, "prior_module", str2)));
                A0e2.A7p("is_organic_product_tagging", JTP.A0g(A0e2, "usage", "feed_sharing", A0S2));
                A0e2.AAJ("prior_submodule", (String) null);
                A0e2.Cgf();
                C46720Djx djx4 = this.A09;
                if (djx4 != null) {
                    LY5.A01(djx4, 0, this);
                }
                if (!this.A0P) {
                    UserSession A0l2 = AnonymousClass7TE.A0l(this.A0o);
                    ArrayList BbX = BbX();
                    0qQ.A0B(A0l2, 0);
                    0qQ.A0B(BbX, 1);
                    if (LTZ.A0L(BbX) && LTZ.A0J(A0l2, false)) {
                        KB3 kb3 = this.A0b;
                        if (kb3 != null) {
                            Integer num = AnonymousClass05K.A0j;
                            if (kb3.A01(num)) {
                                KB3 kb32 = this.A0b;
                                if (kb32 != null) {
                                    IgSegmentedTabLayout igSegmentedTabLayout4 = this.A0a;
                                    0qQ.A0C(igSegmentedTabLayout4, "null cannot be cast to non-null type android.view.View");
                                    C46720Djx djx5 = this.A09;
                                    0qQ.A0C(djx5, "null cannot be cast to non-null type android.view.View");
                                    kb32.A00(this, igSegmentedTabLayout4, djx5, num);
                                    C59899JbO jbO2 = this.A06;
                                    if (jbO2 != null) {
                                        String moduleName = getModuleName();
                                        0Aj A0e3 = AnonymousClass7TE.A0e(jbO2.A04, "instagram_shopping_product_tagging_tab_tooltip_impression");
                                        A0e3.AAJ("waterfall_id", C59899JbO.A02(A0e3, jbO2, "session_instance_id", C59899JbO.A02(A0e3, jbO2, "prior_module", moduleName)));
                                        A0e3.A7p("is_organic_product_tagging", JTP.A0g(A0e3, "usage", "feed_sharing", true));
                                        A0e3.AAJ("prior_submodule", (String) null);
                                        A0e3.Cgf();
                                        this.A0P = true;
                                    }
                                }
                            }
                        }
                        0qQ.A0F("tagProductsTooltipController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C62630Kj1 kj1 = this.A0H;
        if (kj1 == null) {
            str = "tagType";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        A0L(this, kj1, false);
    }

    private final boolean A0R() {
        if (!A0U(this)) {
            ArrayList Aas = Aas();
            if (Aas == null || Aas.isEmpty()) {
                return false;
            }
        } else if (!BgW().isEmpty()) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final ArrayList Aas() {
        ArrayList arrayList = null;
        if (!A0U(this)) {
            arrayList = AnonymousClass7TE.A1C();
            ArrayList arrayList2 = this.A0M;
            if (arrayList2 == null) {
                JTO.A1L();
                throw AnonymousClass00P.createAndThrow();
            }
            Iterator A1G = AnonymousClass7TE.A1G(arrayList2);
            while (A1G.hasNext()) {
                arrayList.addAll(((MediaTaggingInfo) AnonymousClass7TF.A0a(A1G)).A0C);
            }
        }
        return arrayList;
    }

    public final void DLa() {
        A08();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DqQ(com.instagram.model.people.PeopleTag r10) {
        /*
            r9 = this;
            boolean r0 = A0T(r9)
            r3 = 1
            if (r0 != 0) goto L_0x018d
            X.0eM r1 = r9.A0o
            r1.getValue()
            java.util.ArrayList r0 = r9.BbX()
            boolean r0 = X.LTZ.A0L(r0)
            if (r0 == 0) goto L_0x018d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.LTZ.A0K(r0, r3)
            if (r0 != 0) goto L_0x002a
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.LTZ.A0J(r0, r3)
            if (r0 == 0) goto L_0x018d
        L_0x002a:
            r8 = 1
            boolean r0 = r9.A0T
            if (r0 != 0) goto L_0x00a8
            com.instagram.common.session.UserSession r4 = X.DbW.A0S(r1, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36595831486351627(0x8203b70001090b, double:3.2066894193297054E-306)
            long r6 = X.182.A01(r2, r4, r0)
            r5 = 0
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            X.1Am r1 = X.1Al.A01(r4)
            X.1An r0 = X.1An.A2s
            X.0xa r1 = r1.A03(r0)
            java.lang.String r0 = "organic_product_tagging_dialog_impressions"
            int r0 = r1.getInt(r0, r5)
            long r1 = (long) r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0083
        L_0x005a:
            X.8ab r2 = X.DbS.A0X(r9)
            r0 = 2131237644(0x7f081b0c, float:1.8091544E38)
            X.DbU.A16(r9, r2, r0)
            r1 = 2131974942(0x7f135b1e, float:1.9586962E38)
            X.LUv r0 = X.C64231LUv.A00
            r2.A0I(r0, r1)
            r1 = 2131974940(0x7f135b1c, float:1.9586958E38)
            X.LUw r0 = X.C64232LUw.A00
            r2.A0G(r0, r1)
            r0 = 2131974943(0x7f135b1f, float:1.9586964E38)
            r2.A09(r0)
            r0 = 2131974941(0x7f135b1d, float:1.958696E38)
            r2.A08(r0)
            X.DbT.A1V(r2)
        L_0x0083:
            X.1Am r1 = X.1Al.A01(r4)
            X.1An r0 = X.1An.A2s
            X.0xa r1 = r1.A03(r0)
            java.lang.String r0 = "organic_product_tagging_dialog_impressions"
            X.0xY r0 = X.AnonymousClass7TG.A0g(r1, r0)
            r0.apply()
            r9.A0T = r3
            r9.A07()
            X.2da r1 = r9.A02
            if (r1 == 0) goto L_0x00a8
            boolean r0 = r9.A0T
            int r0 = r9.A01(r0)
            r1.Eom(r0)
        L_0x00a8:
            if (r10 == 0) goto L_0x0174
            java.util.List r0 = r9.A0O
            java.lang.String r2 = "taggedSellerIds"
            if (r0 == 0) goto L_0x00f3
            boolean r0 = X.JTQ.A1S(r10, r0)
            if (r0 != 0) goto L_0x0174
            com.instagram.model.people.PeopleTag$UserInfo r0 = r10.A00
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0174
            java.util.List r0 = r9.A0O
            if (r0 == 0) goto L_0x00f3
            boolean r0 = X.JTQ.A1S(r10, r0)
            if (r0 != 0) goto L_0x0174
            java.util.List r1 = r9.A0O
            if (r1 == 0) goto L_0x00f3
            java.lang.String r0 = r10.getId()
            X.0qQ.A07(r0)
            r1.add(r0)
            if (r8 == 0) goto L_0x00d9
            A0D(r9)
        L_0x00d9:
            A0I(r9)
            r2 = 0
            if (r10 == 0) goto L_0x0139
            com.instagram.user.model.User r0 = r10.A07()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.SellerShoppableFeedType r1 = r0.BsB()
            com.instagram.api.schemas.SellerShoppableFeedType r0 = com.instagram.api.schemas.SellerShoppableFeedType.A06
            if (r1 == r0) goto L_0x0139
            X.JbO r0 = r9.A06
            if (r0 != 0) goto L_0x00fb
            java.lang.String r2 = "creationLogger"
        L_0x00f3:
            X.0qQ.A0F(r2)
        L_0x00f6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fb:
            com.instagram.user.model.User r7 = r10.A07()
            java.lang.String r6 = r9.getModuleName()
            java.lang.String r5 = r0.A02
            if (r5 == 0) goto L_0x0139
            X.0wc r1 = r0.A04
            java.lang.String r0 = "instagram_shopping_brand_tag_add"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "prior_module"
            r4.AAJ(r0, r6)
            java.lang.String r0 = "session_instance_id"
            r4.AAJ(r0, r5)
            java.lang.String r0 = "waterfall_id"
            r4.AAJ(r0, r5)
            java.lang.String r1 = "feed_sharing"
            java.lang.String r0 = "usage"
            r4.AAJ(r0, r1)
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r7)
            X.4Ny r1 = X.C263944Ny.A00(r0)
            java.lang.String r0 = "merchant_id"
            r4.AAE(r1, r0)
            boolean r0 = r7.A1V()
            X.JTU.A12(r4, r0)
        L_0x0139:
            A0J(r9)
            X.JeL r1 = r9.A0c
            if (r1 == 0) goto L_0x0146
            r0 = 1056056731(0x3ef2259b, float:0.47294316)
            X.0fE.A00(r1, r0)
        L_0x0146:
            X.Kj1 r1 = r9.A0H
            if (r1 != 0) goto L_0x014d
            java.lang.String r2 = "tagType"
            goto L_0x00f3
        L_0x014d:
            X.Kj1 r0 = X.C62630Kj1.PEOPLE
            if (r1 != r0) goto L_0x0153
            java.lang.String r2 = "PeopleTagSearch"
        L_0x0153:
            X.0hq r1 = r9.getSupportFragmentManager()
            boolean r0 = r1.A0G
            r4 = 1
            if (r0 != 0) goto L_0x015f
            r1.A19(r2, r3)
        L_0x015f:
            A0C(r9)
            r9.A06()
            X.LSN r3 = r9.A0E
            if (r3 != 0) goto L_0x016c
            java.lang.String r2 = "helpTextController"
            goto L_0x00f3
        L_0x016c:
            java.util.ArrayList r0 = r9.A0M
            if (r0 != 0) goto L_0x0190
            X.JTO.A1L()
            goto L_0x00f6
        L_0x0174:
            boolean r0 = A0S(r9)
            if (r0 == 0) goto L_0x00d9
            java.util.Map r1 = r9.A0m
            java.lang.String r0 = r9.A0X()
            java.lang.Object r0 = r1.get(r0)
            com.instagram.tagging.widget.TagsInteractiveLayout r0 = (com.instagram.tagging.widget.TagsInteractiveLayout) r0
            if (r0 == 0) goto L_0x00d9
            r0.A07()
            goto L_0x00d9
        L_0x018d:
            r8 = 0
            goto L_0x00a8
        L_0x0190:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTT.A0i(r9, r0)
            X.1iA r2 = r0.A03
            X.1iA r0 = X.1iA.A0Q
            r1 = 0
            if (r2 != r0) goto L_0x01a2
            int r0 = A00(r9)
            if (r0 != 0) goto L_0x01a2
            r1 = 1
        L_0x01a2:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r9.A0D
            if (r0 != 0) goto L_0x01a7
            r4 = 0
        L_0x01a7:
            r3.A03(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.DqQ(com.instagram.model.people.PeopleTag):void");
    }

    public final void DqV() {
        A0B(this);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity, com.instagram.base.activity.IgFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r4.A05 != true) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 18
            if (r7 != r0) goto L_0x00b9
            X.0qQ.A0A(r9)
            r0 = 5316(0x14c4, float:7.45E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r9.getStringExtra(r0)
            if (r2 == 0) goto L_0x00e7
            r0 = -1
            if (r8 != r0) goto L_0x00e3
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r4 = r6.A0D
            r0 = 366(0x16e, float:5.13E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r1 = r9.getParcelableExtra(r0)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            if (r1 == 0) goto L_0x00d6
            r0 = 1873(0x751, float:2.625E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r9.getParcelableExtra(r0)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            r6.A0D = r0
            A0N(r6, r1, r2)
        L_0x003a:
            boolean r0 = r6.A0R()
            if (r0 == 0) goto L_0x00d2
            r3 = 1
            if (r4 == 0) goto L_0x0048
            boolean r1 = r4.A05
            r0 = 1
            if (r1 == r3) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            java.lang.String r1 = r4.A01
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r6.A0D
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = r0.A01
        L_0x0054:
            boolean r0 = X.0mp.A0G(r1, r0)
            if (r0 != 0) goto L_0x00bc
            r6.A0D = r2
            r5 = 1
        L_0x005d:
            r3 = 1
            A0Q(r6, r3)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r6.A0D
            if (r0 == 0) goto L_0x0091
            boolean r0 = r0.A05
            if (r0 != r3) goto L_0x0091
            if (r4 != 0) goto L_0x0091
            X.L58 r0 = r6.A0B
            java.lang.String r4 = "discountAutoTagTooltipController"
            if (r0 == 0) goto L_0x00db
            com.instagram.common.session.UserSession r0 = r0.A01
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "has_shown_discount_auto_tag_nux"
            boolean r0 = X.DbT.A1a(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0091
            X.L58 r2 = r6.A0B
            if (r2 == 0) goto L_0x00db
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x0091
            X.M7z r0 = new X.M7z
            r0.<init>(r1, r2)
            r1.post(r0)
        L_0x0091:
            X.0eM r0 = r6.A0o
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Liw r2 = X.C17053VGb.A00(r0)
            r1 = 0
            java.lang.String r0 = r6.getModuleName()
            r2.A01(r3, r1, r0)
            if (r5 == 0) goto L_0x00b9
            X.6ap r2 = X.DbS.A0a()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131960838(0x7f132406, float:1.9558356E38)
            X.DbT.A1D(r1, r2, r0)
            r2.A06()
            X.DbY.A1N(r2)
        L_0x00b9:
            return
        L_0x00ba:
            r0 = r2
            goto L_0x0054
        L_0x00bc:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r1 = r6.A0D
            if (r1 == 0) goto L_0x00d2
            boolean r0 = r1.A05
            if (r0 != r3) goto L_0x00d2
            java.lang.String r1 = r1.A01
            if (r4 == 0) goto L_0x00d4
            java.lang.String r0 = r4.A01
        L_0x00ca:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00d2
            r6.A0D = r2
        L_0x00d2:
            r5 = 0
            goto L_0x005d
        L_0x00d4:
            r0 = r2
            goto L_0x00ca
        L_0x00d6:
            A0P(r6, r2)
            goto L_0x003a
        L_0x00db:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e3:
            A0P(r6, r2)
            return
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: X.MXd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: X.MRC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: X.MUJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: X.MVH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.MUJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: X.MVH} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x044f, code lost:
        if (r0.A0R != false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02f9, code lost:
        if (r0.A0R != false) goto L_0x02fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r49) {
        /*
            r48 = this;
            r0 = 1748782287(0x683c4ccf, float:3.556887E24)
            int r19 = X.AnonymousClass0fD.A00(r0)
            r0 = r48
            r5 = r49
            super.onCreate(r5)
            X.AnonymousClass1GD.A01(r0)
            r1 = 2130971249(0x7f040a71, float:1.7551231E38)
            int r1 = X.2Yu.A0F(r0, r1)
            X.2db.A02(r0, r1)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "tagged_seller_ids"
            java.util.ArrayList r1 = r2.getStringArrayListExtra(r1)
            if (r1 != 0) goto L_0x002b
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
        L_0x002b:
            r0.A0O = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "mentioned_seller_ids"
            java.util.ArrayList r1 = r2.getStringArrayListExtra(r1)
            if (r1 != 0) goto L_0x003d
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
        L_0x003d:
            r0.A0N = r1
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "should_enable_product_tagging"
            r1 = 0
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0T = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "is_exclusive_content"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0i = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "is_close_friends_content"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0h = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "is_share_to_profile_only_content"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0l = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "tag_type"
            java.io.Serializable r3 = r3.getSerializableExtra(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.tagging.model.TagType"
            X.0qQ.A0C(r3, r2)
            X.Kj1 r3 = (X.C62630Kj1) r3
            r0.A0H = r3
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "in_edit_mode"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0Q = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "is_scheduled_post"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0k = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "has_seen_OPT_tooltip"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0P = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "is_open_carousel_enabled"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A0j = r2
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "media_integrity_review_decision"
            java.lang.String r2 = r3.getStringExtra(r2)
            java.lang.Integer r2 = X.C49157EqO.A00(r2)
            r0.A0J = r2
            X.0eM r14 = r0.A0o
            X.0lg r4 = X.AnonymousClass7TF.A0L(r14, r1)
            X.0Tu r8 = X.0Tu.A05
            r2 = 36326485497296675(0x810ebf00013723, double:3.03635393128211E-306)
            boolean r6 = X.182.A06(r8, r4, r2)
            java.lang.String r4 = ""
            java.lang.String r3 = "for_post_in_group_id"
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r2 = r2.getStringExtra(r3)
            if (r6 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00e5
            r2 = r4
        L_0x00e5:
            r0.A0f = r2
            X.Kj1 r2 = r0.A0H
            java.lang.String r18 = "tagType"
            if (r2 == 0) goto L_0x01f9
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "prior_submodule"
            java.lang.String r2 = r3.getStringExtra(r2)
            if (r2 == 0) goto L_0x00fa
            r4 = r2
        L_0x00fa:
            r0.A0L = r4
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r2 = "should_enable_people_tagging"
            r3 = 1
            boolean r2 = r4.getBooleanExtra(r2, r3)
            r0.A0S = r2
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r2 = "should_enable_collaborator_tagging"
            boolean r2 = r4.getBooleanExtra(r2, r3)
            r0.A0R = r2
            boolean r2 = r0.A0T
            if (r2 == 0) goto L_0x0124
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r14)
            java.lang.String r2 = r0.getModuleName()
            X.C324476zN.A0R(r4, r0, r2)
        L_0x0124:
            java.lang.String r4 = "media_tagging_info_list"
            if (r49 == 0) goto L_0x04eb
            java.util.ArrayList r2 = r5.getParcelableArrayList(r4)
            if (r2 != 0) goto L_0x0132
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x0132:
            r0.A0M = r2
        L_0x0134:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r4 = "is_clips_entry_point"
            boolean r2 = r2.hasExtra(r4)
            if (r2 == 0) goto L_0x014a
            android.content.Intent r2 = r0.getIntent()
            boolean r2 = r2.getBooleanExtra(r4, r1)
            r0.A0g = r2
        L_0x014a:
            r2 = 2131624029(0x7f0e005d, float:1.8875226E38)
            r0.setContentView((int) r2)
            r2 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r5 = r0.findViewById(r2)
            X.0qQ.A07(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r4 = 69
            X.LXz r2 = new X.LXz
            r2.<init>(r0, r4)
            X.2dZ r2 = X.2dY.A01(r2, r5)
            r0.A0W = r2
            r2.A0X(r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r14)
            X.LyL r2 = new X.LyL
            r2.<init>(r4, r0)
            r0.A0d = r2
            r2 = 2131442489(0x7f0b3b39, float:1.850702E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.A0V = r2
            r2 = 2131442491(0x7f0b3b3b, float:1.8507023E38)
            android.view.View r17 = r0.findViewById(r2)
            X.0qQ.A07(r17)
            int r39 = A00(r0)
            java.lang.String r37 = r0.A0X()
            r2 = 2131442492(0x7f0b3b3c, float:1.8507025E38)
            android.view.View r7 = r0.findViewById(r2)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r7, r4)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 2131430408(0x7f0b0c08, float:1.8482516E38)
            android.view.View r13 = X.JTT.A0F(r0, r4, r2)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r2 = 2131442497(0x7f0b3b41, float:1.8507036E38)
            android.view.View r12 = X.JTT.A0F(r0, r4, r2)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2 = 2131442149(0x7f0b39e5, float:1.850633E38)
            android.view.View r11 = X.JTT.A0F(r0, r4, r2)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = 2131442502(0x7f0b3b46, float:1.8507046E38)
            android.view.View r6 = r0.findViewById(r2)
            r2 = 15
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.0qQ.A0C(r6, r2)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            r4 = 2131438338(0x7f0b2b02, float:1.84986E38)
            android.view.View r10 = X.JTT.A0F(r0, r2, r4)
            android.view.ViewStub r10 = (android.view.ViewStub) r10
            r4 = 2131434850(0x7f0b1d62, float:1.8491526E38)
            android.view.View r5 = X.JTT.A0F(r0, r2, r4)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            boolean r4 = A0U(r0)
            r40 = r4 ^ 1
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r4 = X.DbX.A0l(r4, r14)
            boolean r41 = r4.A1R()
            X.LyL r4 = r0.A0d
            r16 = r4
            if (r4 != 0) goto L_0x0201
            java.lang.String r18 = "tagSearchController"
        L_0x01f9:
            X.0qQ.A0F(r18)
        L_0x01fc:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0201:
            com.instagram.common.session.UserSession r31 = X.AnonymousClass7TE.A0l(r14)
            X.Kj1 r15 = r0.A0H
            if (r15 == 0) goto L_0x01f9
            java.util.ArrayList r9 = r0.A0M
            if (r9 == 0) goto L_0x04e7
            boolean r4 = r9 instanceof java.util.Collection
            r42 = 1
            if (r4 == 0) goto L_0x027e
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x027e
        L_0x0219:
            r42 = 0
        L_0x021b:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r4 = r0.A0D
            boolean r43 = X.AnonymousClass7TF.A1V(r4)
            java.lang.Integer r4 = r0.A0J
            r36 = r4
            boolean r4 = r0.A0g
            java.lang.Boolean r35 = java.lang.Boolean.valueOf(r4)
            java.util.ArrayList r4 = r0.A0M
            if (r4 == 0) goto L_0x04e7
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r4 = X.JTT.A0i(r0, r4)
            java.lang.String r4 = r4.A07
            r38 = r4
            boolean r4 = r0.A0S
            r44 = r4
            boolean r4 = r0.A0R
            r21 = r4
            boolean r4 = r0.A0Q
            r20 = r4
            boolean r9 = r0.A0k
            X.LSN r4 = new X.LSN
            r22 = r6
            r23 = r10
            r24 = r5
            r25 = r7
            r26 = r13
            r27 = r12
            r28 = r11
            r29 = r0
            r30 = r0
            r32 = r0
            r33 = r16
            r34 = r15
            r45 = r21
            r46 = r20
            r47 = r9
            r20 = r4
            r21 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r0.A0E = r4
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r14)
            X.JbO r4 = X.JZM.A00(r4)
            r0.A06 = r4
            if (r4 != 0) goto L_0x0299
            java.lang.String r18 = "creationLogger"
            goto L_0x01f9
        L_0x027e:
            java.util.Iterator r9 = r9.iterator()
        L_0x0282:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0219
            java.lang.Object r4 = r9.next()
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r4 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r4
            java.util.ArrayList r4 = r4.A0D
            if (r4 == 0) goto L_0x0282
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x021b
            goto L_0x0282
        L_0x0299:
            java.lang.String r4 = r4.A02
            if (r4 != 0) goto L_0x02a4
            java.lang.String r4 = X.AnonymousClass6SR.A02()
            X.0qQ.A07(r4)
        L_0x02a4:
            r0.A0K = r4
            boolean r5 = A0U(r0)
            java.lang.String r11 = "helpTextController"
            r4 = 176(0xb0, float:2.47E-43)
            java.lang.String r6 = X.AnonymousClass000.A00(r4)
            java.lang.String r10 = "mediaTaggingInfos"
            if (r5 == 0) goto L_0x03e8
            java.util.ArrayList r4 = r0.A0M
            if (r4 == 0) goto L_0x04e2
            java.lang.Object r9 = X.DbZ.A0g(r4, r1)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r9 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r9
            X.1iA r5 = r9.A03
            X.1iA r4 = X.1iA.A0Q
            if (r5 != r4) goto L_0x03b4
            r4 = 2131442454(0x7f0b3b16, float:1.8506948E38)
            android.view.View r4 = X.JTT.A0F(r0, r2, r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
            X.0qQ.A07(r4)
            X.Ka8 r10 = new X.Ka8
            r10.<init>(r4)
            r0.A0F = r10
            r0.A0e = r10
            X.Kj1 r7 = r0.A0H
            if (r7 == 0) goto L_0x01f9
            com.instagram.common.session.UserSession r21 = X.AnonymousClass7TE.A0l(r14)
            java.util.Map r5 = r0.A0m
            boolean r28 = A0S(r0)
            boolean r29 = A0T(r0)
            boolean r4 = r0.A0S
            if (r4 == 0) goto L_0x02fb
            boolean r4 = r0.A0R
            r30 = 1
            if (r4 == 0) goto L_0x02fd
        L_0x02fb:
            r30 = 0
        L_0x02fd:
            r20 = r0
            r22 = r10
            r23 = r9
            r24 = r7
            r25 = r0
            r26 = r0
            r27 = r5
            X.C63456KxL.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r4 = A0W(r0, r1)
            if (r4 == 0) goto L_0x0317
            A0E(r0)
        L_0x0317:
            r4 = 2131442482(0x7f0b3b32, float:1.8507005E38)
            android.view.View r4 = X.JTT.A0F(r0, r2, r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            r4.inflate()
            X.LSN r5 = r0.A0E
            if (r5 == 0) goto L_0x04dd
            r4 = 2131442480(0x7f0b3b30, float:1.8507001E38)
            android.view.View r4 = X.JTT.A0F(r0, r6, r4)
            android.widget.ListView r4 = (android.widget.ListView) r4
            r5.A02 = r4
        L_0x0332:
            boolean r4 = A0V(r0)
            if (r4 == 0) goto L_0x034a
            r4 = 2131427751(0x7f0b01a7, float:1.8477127E38)
            android.view.View r2 = X.JTT.A0F(r0, r2, r4)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
            r0.A0U = r2
            A0G(r0)
        L_0x034a:
            r2 = 2131443348(0x7f0b3e94, float:1.8508762E38)
            android.view.View r5 = r0.findViewById(r2)
            X.0qQ.A07(r5)
            X.LMz r4 = new X.LMz
            r2 = r17
            r4.<init>(r5, r2, r0)
            r0.A0G = r4
            r2 = 2131437647(0x7f0b284f, float:1.8497199E38)
            android.view.View r2 = r0.findViewById(r2)
            com.instagram.tagging.widget.PhotoScrollView r2 = (com.instagram.tagging.widget.PhotoScrollView) r2
            r0.A0I = r2
            X.3kF r4 = X.C249713kF.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r14)
            X.KB3 r2 = r4.A0X(r2)
            r0.A0b = r2
            X.3kF r4 = X.C249713kF.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r14)
            X.L58 r2 = r4.A0G(r0, r2)
            r0.A0B = r2
            boolean r2 = r0.A0T
            if (r2 == 0) goto L_0x03ac
            r0.A07()
            A0Q(r0, r3)
        L_0x038a:
            X.3kF r6 = X.C249713kF.A00
            X.0gy r5 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r14)
            r3 = 4
            X.Lxw r2 = new X.Lxw
            r2.<init>(r0, r3)
            X.LPD r4 = r6.A0I(r0, r5, r4, r2)
            r0.A0C = r4
            java.util.ArrayList r2 = r0.A0M
            if (r2 != 0) goto L_0x050b
            X.JTO.A1L()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03ac:
            com.instagram.tagging.widget.PhotoScrollView r2 = r0.A0I
            if (r2 == 0) goto L_0x038a
            X.0nA.A0T(r2, r1)
            goto L_0x038a
        L_0x03b4:
            r4 = 2131442474(0x7f0b3b2a, float:1.8506989E38)
            android.view.View r4 = X.JTT.A0F(r0, r2, r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
            X.0qQ.A07(r4)
            X.Ka7 r10 = new X.Ka7
            r10.<init>(r4)
            r0.A0e = r10
            X.C51974G9v.A1K(r10, r9, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r10.A00
            com.instagram.common.typedurl.ImageUrl r5 = r9.A02
            java.lang.String r4 = "Required value was null."
            if (r5 == 0) goto L_0x05a9
            r7.setUrl(r5, r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = r10.A01
            float r4 = X.LTZ.A00(r9)
            r5.A00 = r4
            r4 = 66
            X.C64273LXz.A00(r5, r4, r0)
            goto L_0x0317
        L_0x03e8:
            r0.A00 = r1
            android.content.Intent r5 = r0.getIntent()
            java.lang.String r4 = "initial_page"
            java.lang.String r9 = r5.getStringExtra(r4)
            r7 = 0
            if (r9 == 0) goto L_0x040f
        L_0x03f7:
            java.util.ArrayList r5 = r0.A0M
            if (r5 == 0) goto L_0x04e2
            int r4 = r5.size()
            if (r7 >= r4) goto L_0x040f
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r4 = X.JTO.A0p(r5, r7)
            java.lang.String r4 = r4.A06
            boolean r4 = X.0qQ.A0K(r4, r9)
            if (r4 == 0) goto L_0x04d9
            r0.A00 = r7
        L_0x040f:
            r4 = 2131442437(0x7f0b3b05, float:1.8506914E38)
            android.view.View r4 = r0.findViewById(r4)
            X.0qQ.A07(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            r4.inflate()
            r4 = 2131442438(0x7f0b3b06, float:1.8506916E38)
            android.view.View r5 = r0.findViewById(r4)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r5
            r0.A05 = r5
            if (r5 == 0) goto L_0x0431
            int r4 = r0.A00
            float r4 = (float) r4
            r5.A0R(r1, r4)
        L_0x0431:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = r0.A05
            if (r5 == 0) goto L_0x0439
            r4 = 0
            r5.setPageSpacing(r4)
        L_0x0439:
            java.util.ArrayList r9 = r0.A0M
            if (r9 == 0) goto L_0x04e2
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r14)
            java.util.Map r7 = r0.A0m
            boolean r28 = A0T(r0)
            boolean r4 = r0.A0S
            if (r4 == 0) goto L_0x0451
            boolean r4 = r0.A0R
            r29 = 1
            if (r4 == 0) goto L_0x0453
        L_0x0451:
            r29 = 0
        L_0x0453:
            X.JeL r5 = new X.JeL
            r20 = r5
            r21 = r0
            r23 = r0
            r24 = r0
            r25 = r0
            r26 = r9
            r27 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.A0c = r5
            X.Kj1 r4 = r0.A0H
            if (r4 == 0) goto L_0x01f9
            r5.A00 = r4
            r4 = -1751941621(0xffffffff97937e0b, float:-9.53147E-25)
            X.0fE.A00(r5, r4)
            X.JeL r5 = r0.A0c
            if (r5 == 0) goto L_0x047e
            boolean r4 = A0S(r0)
            r5.A03 = r4
        L_0x047e:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = r0.A05
            if (r5 == 0) goto L_0x0487
            X.JeL r4 = r0.A0c
            r5.setAdapter((android.widget.Adapter) r4)
        L_0x0487:
            A0E(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = r0.A05
            if (r5 == 0) goto L_0x0496
            X.KIC r4 = new X.KIC
            r4.<init>(r0, r1)
            r5.A0P(r4)
        L_0x0496:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = r0.A05
            if (r5 == 0) goto L_0x049f
            int r4 = r0.A00
            r5.A0K(r4)
        L_0x049f:
            A0F(r0)
            java.util.ArrayList r4 = r0.A0M
            if (r4 == 0) goto L_0x04e2
            java.util.Iterator r9 = X.AnonymousClass7TE.A1G(r4)
        L_0x04aa:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0332
            java.lang.Object r4 = r9.next()
            X.0qQ.A07(r4)
            r7 = 2131442480(0x7f0b3b30, float:1.8507001E38)
            android.view.View r4 = r0.findViewById(r7)
            if (r4 != 0) goto L_0x04aa
            r4 = 2131442482(0x7f0b3b32, float:1.8507005E38)
            android.view.View r4 = X.JTT.A0F(r0, r2, r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            r4.inflate()
            X.LSN r5 = r0.A0E
            if (r5 == 0) goto L_0x04dd
            android.view.View r4 = X.JTT.A0F(r0, r6, r7)
            android.widget.ListView r4 = (android.widget.ListView) r4
            r5.A02 = r4
            goto L_0x04aa
        L_0x04d9:
            int r7 = r7 + 1
            goto L_0x03f7
        L_0x04dd:
            X.0qQ.A0F(r11)
            goto L_0x01fc
        L_0x04e2:
            X.0qQ.A0F(r10)
            goto L_0x01fc
        L_0x04e7:
            java.lang.String r18 = "mediaTaggingInfos"
            goto L_0x01f9
        L_0x04eb:
            android.content.Intent r2 = r0.getIntent()
            java.util.ArrayList r2 = r2.getParcelableArrayListExtra(r4)
            if (r2 != 0) goto L_0x04f9
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x04f9:
            r0.A0M = r2
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r2 = "tagged_collection_info"
            android.os.Parcelable r2 = r4.getParcelableExtra(r2)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r2 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r2
            r0.A0D = r2
            goto L_0x0134
        L_0x050b:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r2 = X.JTT.A0i(r0, r2)
            java.util.List r3 = r2.A0G
            if (r3 == 0) goto L_0x05a1
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x05a1
            java.lang.String r2 = X.AnonymousClass7TE.A19(r3, r1)
        L_0x051d:
            r4.A04(r2)
            r3 = 10
            X.LgJ r2 = new X.LgJ
            r2.<init>(r0, r3)
            r0.A03 = r2
            X.1Ng r4 = X.DbX.A0R(r14)
            java.lang.Class<X.8No> r3 = X.C354838No.class
            X.1wn r2 = r0.A03
            if (r2 == 0) goto L_0x05a4
            r4.A01(r2, r3)
            r2 = 11
            X.LgJ r4 = new X.LgJ
            r4.<init>(r0, r2)
            r0.A04 = r4
            X.1xC r3 = X.1xC.A01
            java.lang.Class<X.3GP> r2 = X.AnonymousClass3GP.class
            r3.A02(r4, r2)
            boolean r2 = A0T(r0)
            if (r2 == 0) goto L_0x0598
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r14)
            r2 = 200(0xc8, double:9.9E-322)
            X.0qQ.A0B(r9, r1)
            X.1Av r4 = X.1Au.A00(r9)
            X.0s0 r1 = r4.A0l
            X.0YZ[] r7 = X.1Av.A8a
            r6 = 94
            int r4 = X.DbY.A03(r4, r1, r7, r6)
            r1 = 24
            X.GNG r10 = new X.GNG
            r10.<init>(r1, r0, r9)
            r0 = 36324320834105328(0x810cc700062ff0, double:3.034984989563503E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0598
            long r4 = (long) r4
            r0 = 36605795810743617(0x820cc700051541, double:3.212990898198314E-306)
            long r11 = X.182.A01(r8, r9, r0)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0598
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.M23 r0 = new X.M23
            r0.<init>(r10)
            r1.postDelayed(r0, r2)
            X.1Av r1 = X.1Au.A00(r9)
            X.0s0 r0 = r1.A0l
            X.DbZ.A1b(r1, r0, r7, r6)
        L_0x0598:
            r1 = -1032485402(0xffffffffc27585e6, float:-61.38076)
            r0 = r19
            X.AnonymousClass0fD.A07(r1, r0)
            return
        L_0x05a1:
            r2 = 0
            goto L_0x051d
        L_0x05a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(-1208195512);
        super.onDestroy();
        this.A0I = null;
        this.A0a = null;
        C62103Ka8 ka8 = this.A0F;
        if (ka8 != null) {
            ka8.A02 = null;
            ka8.A00 = null;
            ka8.A01 = null;
        }
        1wn r2 = this.A0X;
        if (r2 != null) {
            DbX.A0R(this.A0o).A02(r2, C62153KbB.class);
        }
        1wn r22 = this.A0Y;
        if (r22 != null) {
            DbX.A0R(this.A0o).A02(r22, C62152KbA.class);
        }
        DbX.A0R(this.A0o).A02(this.A03, C354838No.class);
        1wn r23 = this.A04;
        if (r23 != null) {
            1xC.A01.A03(r23, AnonymousClass3GP.class);
        }
        AnonymousClass0fD.A07(1055104380, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-607699552);
        super.onResume();
        C71342cb.A00(DbT.A0X(this.A0o)).A0E("ig_activity", this);
        A0C(this);
        AnonymousClass0fD.A07(-1055938191, A002);
    }
}
