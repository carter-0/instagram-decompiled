package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LRj  reason: case insensitive filesystem */
public final class C64167LRj {
    public ProductCollectionFeedTaggingMeta A00;
    public MediaTaggingInfo A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public ArrayList A07;
    public ArrayList A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H = true;
    public boolean A0I = true;
    public boolean A0J;
    public final C62630Kj1 A0K;
    public final Context A0L;

    public final void A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        this.A06 = userSession.A05;
    }

    public final void A04(C3499682q r20, AnonymousClass3Q2 r21) {
        AnonymousClass3Q2 r2 = r21;
        String str = r2.A35;
        ImageUrl A002 = C64175LSc.A00(r2);
        String A022 = C64175LSc.A02(r20, r2);
        1iA r5 = r2.A1G;
        ArrayList arrayList = r2.A40;
        List list = r2.A48;
        ArrayList arrayList2 = r2.A41;
        ArrayList arrayList3 = r2.A43;
        ArrayList A042 = C64175LSc.A04(r2);
        MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(A002, r5, r2.A1N, str, A022, r2.A2d, (String) null, arrayList, arrayList2, arrayList3, A042, list, r2.A4L, (List) null, (List) null);
        float f = r2.A02;
        if (f > 0.0f) {
            mediaTaggingInfo.A00 = f;
            mediaTaggingInfo.A0H = true;
        }
        this.A01 = mediaTaggingInfo;
        this.A09 = null;
        this.A03 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r3 != null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0138 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.1Xj r33, X.1Xj r34, java.lang.String r35, java.util.ArrayList r36, java.util.List r37, java.util.List r38, java.util.List r39, java.util.List r40, java.util.Map r41, java.util.Map r42, java.util.Map r43) {
        /*
            r32 = this;
            r6 = 0
            r14 = r33
            X.0qQ.A0B(r14, r6)
            boolean r0 = r14.A5D()
            if (r0 == 0) goto L_0x017d
            r7 = r32
            android.content.Context r13 = r7.A0L
            r12 = 1
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r15 = r37
            int r11 = r15.size()
            r5 = 0
        L_0x001c:
            if (r5 >= r11) goto L_0x013f
            X.1Xj r9 = X.DbZ.A0T(r15, r5)
            com.instagram.user.model.User r1 = X.C51966G9m.A11(r9)
            r0 = 0
            if (r1 == 0) goto L_0x012a
            X.1Xy r1 = r9.A0C
        L_0x002b:
            com.instagram.user.model.User r1 = r1.CCd()
            if (r1 == 0) goto L_0x0134
            java.lang.String r23 = r1.getId()
        L_0x0035:
            java.lang.String r3 = r9.getId()
            if (r3 == 0) goto L_0x0138
            java.lang.String r1 = "_"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r19 = r0
            java.util.List r1 = X.00l.A0R(r3, r1, r6)
            java.lang.Object r4 = r1.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0138
            r1 = r41
            if (r41 == 0) goto L_0x009c
            java.lang.String r3 = r9.getId()
            java.lang.Object r3 = r1.get(r3)
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            if (r3 == 0) goto L_0x0076
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r16 = r3.iterator()
        L_0x0068:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x007c
            java.lang.String r3 = X.JTU.A0Y(r16)
            r8.add(r3)
            goto L_0x0068
        L_0x0076:
            r3 = r0
        L_0x0077:
            r29 = r0
            if (r3 == 0) goto L_0x0099
            goto L_0x008c
        L_0x007c:
            java.util.Set r3 = X.00k.A0k(r8)
            r8 = r39
            if (r39 == 0) goto L_0x0077
            java.util.Set r8 = X.00k.A0l(r8, r3)
            java.util.List r29 = X.00k.A0a(r8)
        L_0x008c:
            r8 = r40
            if (r40 == 0) goto L_0x0099
            java.util.Set r3 = X.00k.A0l(r8, r3)
            java.util.List r30 = X.00k.A0a(r3)
            goto L_0x00a0
        L_0x0099:
            r30 = r0
            goto L_0x00a0
        L_0x009c:
            r29 = r0
            r30 = r0
        L_0x00a0:
            com.instagram.model.mediasize.ExtendedImageUrl r17 = X.C64175LSc.A01(r13, r9)
            java.lang.String r21 = X.C64175LSc.A03(r9)
            X.1iA r18 = r9.BR7()
            if (r41 == 0) goto L_0x00b8
            java.lang.String r2 = r9.getId()
            java.lang.Object r2 = r1.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
        L_0x00b8:
            r3 = r42
            if (r42 != 0) goto L_0x00d9
            r3 = r0
        L_0x00bd:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            if (r38 == 0) goto L_0x00e4
            java.util.Iterator r16 = r38.iterator()
        L_0x00c7:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00e4
            com.instagram.pendingmedia.model.BrandedContentTag r1 = X.JTO.A0l(r16)
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x00c7
            r8.add(r1)
            goto L_0x00c7
        L_0x00d9:
            java.lang.String r1 = r9.getId()
            java.lang.Object r3 = r3.get(r1)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            goto L_0x00bd
        L_0x00e4:
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x00eb
            r8 = 0
        L_0x00eb:
            r1 = r43
            if (r43 == 0) goto L_0x00f9
            java.lang.String r0 = r9.getId()
            java.lang.Object r0 = r1.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
        L_0x00f9:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r1 = new com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo
            r22 = r35
            r28 = r36
            r24 = r2
            r25 = r3
            r26 = r19
            r27 = r8
            r31 = r0
            r20 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.A01 = r5
            float r2 = r9.A0l()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0123
            float r0 = r9.A0l()
            r1.A00 = r0
            r1.A0H = r12
        L_0x0123:
            r10.add(r1)
            int r5 = r5 + 1
            goto L_0x001c
        L_0x012a:
            com.instagram.user.model.User r1 = X.C51966G9m.A11(r14)
            if (r1 == 0) goto L_0x0134
            X.1Xy r1 = r14.A0C
            goto L_0x002b
        L_0x0134:
            r23 = r0
            goto L_0x0035
        L_0x0138:
            java.lang.String r0 = "media id cannot be null, and it must conform to the 111111_22222 format."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x013f:
            r3 = 0
            if (r34 == 0) goto L_0x0172
            java.lang.String r1 = r34.getId()
            if (r1 == 0) goto L_0x0172
            java.lang.String r0 = "_"
            java.util.List r2 = X.DbW.A0o(r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x017a
            java.util.ListIterator r1 = X.C51968G9o.A18(r2)
        L_0x0158:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x017a
            int r0 = X.DbX.A06(r1)
            if (r0 == 0) goto L_0x0158
            java.util.List r0 = X.DbX.A0y(r2, r1)
        L_0x0168:
            if (r0 == 0) goto L_0x0172
            java.lang.String[] r0 = X.DbU.A1b(r0, r6)
            if (r0 == 0) goto L_0x0172
            r3 = r0[r6]
        L_0x0172:
            r0 = 0
            r7.A01 = r0
            r7.A09 = r10
            r7.A03 = r3
            return
        L_0x017a:
            X.0sn r0 = X.0sn.A00
            goto L_0x0168
        L_0x017d:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64167LRj.A06(X.1Xj, X.1Xj, java.lang.String, java.util.ArrayList, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map, java.util.Map):void");
    }

    public final void A07(1Xj r21, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list, List list2, List list3) {
        User A11;
        1Xj r3 = r21;
        0qQ.A0B(r3, 0);
        if (!r3.A5D()) {
            Context context = this.A0L;
            String id = r3.getId();
            if (id != null) {
                String str2 = null;
                if (!(C51966G9m.A11(r3) == null || (A11 = C51966G9m.A11(r3)) == null)) {
                    str2 = A11.getId();
                }
                ExtendedImageUrl A012 = C64175LSc.A01(context, r3);
                String A032 = C64175LSc.A03(r3);
                1iA BR7 = r3.BR7();
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str3 = JTO.A0l(it).A01;
                        if (str3 != null) {
                            A1C.add(str3);
                        }
                    }
                }
                if (A1C.isEmpty()) {
                    A1C = null;
                }
                MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(A012, BR7, (ClipInfo) null, id, A032, str, str2, arrayList, arrayList3, (ArrayList) null, A1C, arrayList2, list2, list3, arrayList4);
                if (r3.A0l() > 0.0f) {
                    mediaTaggingInfo.A00 = r3.A0l();
                    mediaTaggingInfo.A0H = true;
                }
                this.A01 = mediaTaggingInfo;
                this.A09 = null;
                this.A03 = null;
                return;
            }
            throw AnonymousClass7TE.A0w("Media id cannot be null.");
        }
        throw DbT.A0m();
    }

    public static void A00(EditMediaInfoFragment editMediaInfoFragment, C64167LRj lRj) {
        editMediaInfoFragment.A0J.getClass();
        1Xj r1 = editMediaInfoFragment.A0I;
        List list = editMediaInfoFragment.A1B;
        HashMap hashMap = editMediaInfoFragment.A0d;
        ArrayList arrayList = editMediaInfoFragment.A0W;
        HashMap hashMap2 = editMediaInfoFragment.A0e;
        C64167LRj lRj2 = lRj;
        lRj2.A06(r1, (1Xj) list.get(editMediaInfoFragment.A0J.A03), editMediaInfoFragment.A0V, arrayList, list, editMediaInfoFragment.A0g, editMediaInfoFragment.A0Y, editMediaInfoFragment.A0X, hashMap, hashMap2, editMediaInfoFragment.A0c);
    }

    public static void A01(EditMediaInfoFragment editMediaInfoFragment, C64167LRj lRj) {
        lRj.A0D = editMediaInfoFragment.A0I.A1t().equals(AnonymousClass3QO.FAN_CLUB);
        lRj.A0C = editMediaInfoFragment.A0I.A1t().equals(AnonymousClass3QO.CLOSE_FRIENDS);
        lRj.A0G = editMediaInfoFragment.A0I.A5u();
        lRj.A0E = editMediaInfoFragment.A0I.A6H();
    }

    public final Intent A02() {
        ArrayList A1D;
        if (this.A06 == null) {
            throw AnonymousClass7TE.A0y();
        } else if (AnonymousClass7TF.A1V(this.A01) ^ AnonymousClass7TF.A1V(this.A09)) {
            Intent intent = new Intent(this.A0L, TaggingActivity.class);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable("tag_type", this.A0K);
            A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A06);
            A0a.putBoolean("in_edit_mode", this.A0B);
            A0a.putBoolean("is_scheduled_post", this.A0F);
            A0a.putBoolean("has_seen_OPT_tooltip", this.A0A);
            A0a.putString("for_post_in_group_id", (String) null);
            A0a.putString("prior_submodule", this.A05);
            A0a.putBoolean("is_open_carousel_enabled", this.A0E);
            Boolean bool = this.A02;
            if (bool != null) {
                A0a.putBoolean("is_clips_entry_point", bool.booleanValue());
            }
            ArrayList arrayList = this.A07;
            if (arrayList != null) {
                A0a.putStringArrayList("mentioned_seller_ids", arrayList);
            }
            ArrayList arrayList2 = this.A08;
            if (arrayList2 != null) {
                A0a.putStringArrayList("tagged_seller_ids", arrayList2);
            }
            MediaTaggingInfo mediaTaggingInfo = this.A01;
            if (AnonymousClass7TF.A1V(mediaTaggingInfo)) {
                A1D = DbS.A0v(1);
                if (mediaTaggingInfo != null) {
                    A1D.add(mediaTaggingInfo);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                A1D = AnonymousClass7TE.A1D(this.A09);
            }
            A0a.putParcelableArrayList("media_tagging_info_list", A1D);
            A0a.putParcelable("tagged_collection_info", this.A00);
            String str = this.A03;
            if (str != null) {
                A0a.putString("initial_page", str);
            }
            A0a.putBoolean("should_enable_product_tagging", this.A0J);
            A0a.putBoolean("is_exclusive_content", this.A0D);
            A0a.putBoolean("is_close_friends_content", this.A0C);
            A0a.putBoolean("is_share_to_profile_only_content", this.A0G);
            A0a.putString("media_integrity_review_decision", this.A04);
            A0a.putBoolean("should_enable_people_tagging", this.A0I);
            A0a.putBoolean("should_enable_collaborator_tagging", this.A0H);
            intent.putExtras(A0a);
            return intent;
        } else {
            throw DbT.A0m();
        }
    }

    public C64167LRj(Context context, C62630Kj1 kj1) {
        this.A0L = context;
        this.A0K = kj1;
    }

    public final void A05(C3499682q r28, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass3Q2 r4 = (AnonymousClass3Q2) list2.get(i);
            String str = r4.A35;
            ImageUrl A002 = C64175LSc.A00(r4);
            String A022 = C64175LSc.A02(r28, r4);
            1iA r13 = r4.A1G;
            ArrayList arrayList = r4.A40;
            List list3 = r4.A48;
            ArrayList arrayList2 = r4.A41;
            ArrayList arrayList3 = r4.A43;
            ArrayList A042 = C64175LSc.A04(r4);
            ClipInfo clipInfo = r4.A1N;
            List list4 = r4.A4L;
            String str2 = r4.A2d;
            MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(A002, r13, clipInfo, str, A022, str2, (String) null, arrayList, arrayList2, arrayList3, A042, list3, list4, (List) null, (List) null);
            mediaTaggingInfo.A01 = i;
            if (r4.A02 > 0.0f) {
                mediaTaggingInfo.A00 = r4.A02;
                mediaTaggingInfo.A0H = true;
            }
            A1C.add(mediaTaggingInfo);
        }
        this.A01 = null;
        this.A09 = A1C;
        this.A03 = null;
    }
}
