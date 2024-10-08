package com.instagram.tagging.widget;

import X.1Xj;
import X.AnonymousClass3W1;
import X.AnonymousClass3ZT;
import X.AnonymousClass4H4;
import X.C18274Vop;
import X.C21229XPz;
import X.C22365Y0t;
import X.C247063fi;
import X.C247763gs;
import X.C271654jN;
import X.C294975nL;
import X.C53175Gjl;
import X.C60046JeE;
import X.C61054Jvs;
import X.C62107KaE;
import X.C62108KaF;
import X.C62109KaG;
import X.C62630Kj1;
import X.C62669KkV;
import X.C63462KxR;
import X.C65711LyR;
import X.C65713LyT;
import X.C65717LyX;
import X.C65720Lya;
import X.HOH;
import X.LPG;
import X.M80;
import X.MAQ;
import X.MP8;
import X.Y8o;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.instagram.android.R;
import com.instagram.api.schemas.FBTagType;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TagsLayout extends ViewGroup {
    public Y8o A00;
    public boolean A01 = true;

    public void A05(C60046JeE jeE) {
    }

    private List getOverlaps() {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (!hashSet.contains(Integer.valueOf(i))) {
                hashSet.add(Integer.valueOf(i));
                ArrayList arrayList = new ArrayList(8);
                linkedList.add(arrayList);
                arrayList.add(getChildAt(i));
                Rect rect = new Rect(((C60046JeE) getChildAt(i)).getDrawingBounds());
                for (int i2 = i + 1; i2 < childCount; i2++) {
                    if (((C60046JeE) getChildAt(i2)).A04 && Rect.intersects(rect, ((C60046JeE) getChildAt(i2)).getDrawingBounds())) {
                        rect.union(((C60046JeE) getChildAt(i2)).getDrawingBounds());
                        hashSet.add(Integer.valueOf(i2));
                        arrayList.add(getChildAt(i2));
                    }
                }
            }
        }
        return linkedList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.KaD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.KaB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.KaG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: X.KaC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.KaB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.KaB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.KaB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.KaB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.KaB} */
    /* JADX WARNING: type inference failed for: r12v5, types: [X.JeE] */
    /* JADX WARNING: type inference failed for: r6v11, types: [X.KaF] */
    /* JADX WARNING: type inference failed for: r6v13, types: [X.KaE] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01e6, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36323105357966174L) == false) goto L_0x01e8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60046JeE A02(com.instagram.common.session.UserSession r23, X.1Xj r24, com.instagram.tagging.model.Tag r25, com.instagram.user.model.User r26, boolean r27, boolean r28, boolean r29, boolean r30) {
        /*
            r22 = this;
            r3 = r25
            android.graphics.PointF r14 = r3.A00()
            r14.getClass()
            X.Kj1 r0 = r3.A01()
            int r2 = r0.ordinal()
            r0 = 4
            r5 = r22
            r15 = r23
            r16 = r24
            r4 = r26
            if (r2 == r0) goto L_0x0229
            r1 = 2
            r0 = 0
            r21 = r28
            if (r2 == r1) goto L_0x01d8
            r1 = 5
            if (r2 == r1) goto L_0x00bf
            r1 = 6
            if (r2 == r1) goto L_0x0094
            if (r2 == r0) goto L_0x0051
            android.content.Context r1 = r5.getContext()
            X.KaE r12 = new X.KaE
            r6 = r12
            r7 = r1
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r21
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = r3
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            android.text.SpannableStringBuilder r6 = X.C18274Vop.A01(r1, r0)
        L_0x0042:
            r12.setText(r6)
        L_0x0045:
            r12.setTag(r3)
            r0 = r27
            r12.setClickable(r0)
            r5.addView(r12)
            return r12
        L_0x0051:
            android.content.Context r4 = r5.getContext()
            X.KaB r12 = new X.KaB
            r6 = r12
            r7 = r4
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r21
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r1 = X.C319886rO.A00(r15)
            r2 = 2131953233(0x7f130651, float:1.9542931E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = r4.getString(r2, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r2)
            java.lang.String r1 = r1.toString()
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r1)
            X.6Jl r4 = new X.6Jl
            r4.<init>()
            int r2 = r6.length()
            r1 = 33
            r6.setSpan(r4, r0, r2, r1)
            r12.setText(r6)
            r12.performClick()
            goto L_0x0045
        L_0x0094:
            android.content.Context r7 = r5.getContext()
            X.KaF r12 = new X.KaF
            r6 = r12
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r21
            r6.<init>(r7, r8, r9, r10, r11)
            r1 = r3
            com.instagram.model.fbusertag.FBUserTag r1 = (com.instagram.model.fbusertag.FBUserTag) r1
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r1 = r1.A02
            java.lang.String r1 = r1.A01
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r1)
            X.6Jl r4 = new X.6Jl
            r4.<init>()
            int r2 = r6.length()
            r1 = 33
            r6.setSpan(r4, r0, r2, r1)
            goto L_0x0042
        L_0x00bf:
            if (r28 != 0) goto L_0x00cf
            X.0Tu r4 = X.0Tu.A05
            r1 = 36323105357966174(0x810bac00002b5e, double:3.034216317558772E-306)
            boolean r1 = X.182.A06(r4, r15, r1)
            if (r1 == 0) goto L_0x00cf
            r0 = 1
        L_0x00cf:
            r10 = r3
            com.instagram.model.sponsored.AdTag r10 = (com.instagram.model.sponsored.AdTag) r10
            android.content.Context r8 = r5.getContext()
            java.lang.Integer r9 = r10.A01
            X.KaC r12 = new X.KaC
            r13 = r8
            r17 = r9
            r18 = r0
            r19 = r21
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.0rN r7 = r12.getTextLayoutParams()
            java.lang.String r1 = r10.A04()
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r1)
            X.6Jl r11 = new X.6Jl
            r11.<init>()
            int r2 = r6.length()
            r4 = 0
            r1 = 33
            r6.setSpan(r11, r4, r2, r1)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            java.lang.String r1 = " "
            r2.append(r1)
            android.text.SpannableStringBuilder r0 = X.W2t.A02(r8, r4, r0)
            r2.append(r0)
            if (r9 == 0) goto L_0x0164
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            java.lang.String r0 = "…"
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r0)
        L_0x011f:
            r8 = 2
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r6)
            android.text.SpannableStringBuilder r0 = r0.append(r2)
            android.text.SpannableStringBuilder r1 = r0.append(r9)
            android.text.StaticLayout r0 = r7.A00(r1)
            int r0 = r0.getLineCount()
            if (r0 <= r8) goto L_0x015f
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r6)
            android.text.SpannableStringBuilder r0 = r0.append(r2)
            android.text.SpannableStringBuilder r2 = r0.append(r9)
            android.text.StaticLayout r1 = r7.A00(r2)
            r0 = 1
            int r1 = r1.getLineEnd(r0)
            int r0 = r11.length()
            int r1 = r1 - r0
            java.lang.CharSequence r1 = r2.subSequence(r4, r1)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            android.text.SpannableStringBuilder r1 = r0.append(r11)
        L_0x015f:
            r12.setText(r1)
            goto L_0x0045
        L_0x0164:
            if (r28 != 0) goto L_0x01d3
            com.instagram.model.sponsored.AdTag$AdTagModel r10 = r10.A00
            X.3xb r0 = r10.A00
            java.lang.String r0 = r0.getSubtitle()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01d3
            X.0qQ.A0B(r15, r4)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36327743923108509(0x810fe400073a9d, double:3.0371497648327875E-306)
            boolean r0 = X.182.A06(r9, r15, r0)
            if (r0 == 0) goto L_0x01d3
            r0 = 36327743923370654(0x810fe4000b3a9e, double:3.037149764998569E-306)
            boolean r0 = X.182.A06(r9, r15, r0)
            if (r0 == 0) goto L_0x01d3
            java.lang.String r0 = "\n"
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r0)
            X.3xb r0 = r10.A00
            java.lang.String r0 = r0.getSubtitle()
            r9.append(r0)
            r10 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r0 = X.2Yu.A0H(r8, r10)
            int r0 = r8.getColor(r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r9.length()
            r9.setSpan(r1, r4, r0, r4)
            java.lang.String r0 = "…"
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r0)
            int r0 = X.2Yu.A0H(r8, r10)
            int r0 = r8.getColor(r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r11.length()
            r11.setSpan(r1, r4, r0, r4)
            goto L_0x011f
        L_0x01d3:
            android.text.SpannableStringBuilder r1 = r6.append(r2)
            goto L_0x015f
        L_0x01d8:
            if (r28 != 0) goto L_0x01e8
            X.0Tu r6 = X.0Tu.A05
            r1 = 36323105357966174(0x810bac00002b5e, double:3.034216317558772E-306)
            boolean r1 = X.182.A06(r6, r15, r1)
            r11 = 1
            if (r1 != 0) goto L_0x01e9
        L_0x01e8:
            r11 = 0
        L_0x01e9:
            com.instagram.tagging.model.TaggableModel r8 = r3.A02()
            com.instagram.user.model.Product r8 = (com.instagram.user.model.Product) r8
            android.content.Context r13 = r5.getContext()
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r29)
            if (r30 == 0) goto L_0x0227
            com.instagram.model.mediasize.ImageInfo r1 = r8.A07
        L_0x01ff:
            r18 = 0
            X.KaG r12 = new X.KaG
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0rN r7 = r12.getTextLayoutParams()
            com.instagram.tagging.model.TaggableModel r1 = r3.A02()
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            boolean r10 = X.C63462KxR.A00(r15, r1, r4)
            r9 = 1
            r6 = r13
            android.text.SpannableStringBuilder r2 = X.C18274Vop.A00(r6, r7, r8, r9, r10, r11)
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            r12.A06(r2, r1)
            r12.setVisibility(r0)
            goto L_0x0045
        L_0x0227:
            r1 = 0
            goto L_0x01ff
        L_0x0229:
            r0 = r3
            com.instagram.tagging.api.model.MediaSuggestedProductTag r0 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r0
            android.content.Context r13 = r5.getContext()
            boolean r17 = r0.A09()
            X.KaD r12 = new X.KaD
            r12.<init>(r13, r14, r15, r16, r17)
            com.instagram.tagging.model.TaggableModel r8 = r3.A02()
            com.instagram.user.model.Product r8 = (com.instagram.user.model.Product) r8
            X.0rN r7 = r12.getTextLayoutParams()
            com.instagram.tagging.model.TaggableModel r0 = r3.A02()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            boolean r10 = X.C63462KxR.A00(r15, r0, r4)
            r11 = 0
            r9 = 1
            r6 = r13
            android.text.SpannableStringBuilder r1 = X.C18274Vop.A00(r6, r7, r8, r9, r10, r11)
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            r12.A06(r1, r0)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.widget.TagsLayout.A02(com.instagram.common.session.UserSession, X.1Xj, com.instagram.tagging.model.Tag, com.instagram.user.model.User, boolean, boolean, boolean, boolean):X.JeE");
    }

    public final void A03() {
        int i;
        if (this.A01) {
            int[] iArr = new int[35];
            int[] iArr2 = new int[36];
            for (List list : getOverlaps()) {
                Collections.sort(list, new MAQ(this));
                iArr2[0] = -1;
                int i2 = 0;
                while (i2 < list.size()) {
                    int[] A002 = A00(list, i2, i2);
                    int i3 = i2;
                    while (true) {
                        i = A002[0];
                        if (i >= iArr2[i3]) {
                            break;
                        }
                        i3 = iArr[i3 - 1];
                        A002 = A00(list, i3, i2);
                    }
                    int i4 = i2 + 1;
                    iArr2[i4] = i + A002[1];
                    iArr[i2] = i3;
                    i2 = i4;
                }
            }
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            ((C60046JeE) getChildAt(i5)).A05();
        }
    }

    public void setTags(List list, C247063fi r31, AnonymousClass3W1 r32, int i, boolean z, boolean z2, UserSession userSession) {
        C60046JeE jeE;
        String str;
        List<Tag> list2 = list;
        list2.getClass();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        C247063fi r9 = r31;
        boolean z3 = r9.A08;
        if (z3) {
            for (Tag tag : list2) {
                if (tag.A01() == C62630Kj1.PRODUCT) {
                    linkedList2.add(tag);
                }
            }
        }
        AnonymousClass3W1 r8 = r32;
        int i2 = i;
        UserSession userSession2 = userSession;
        if (linkedList2.size() == 2 || linkedList2.size() == 3) {
            User user = r9.A03;
            1Xj r20 = r9.A01;
            boolean z4 = r9.A07;
            Product product = (Product) ((Tag) linkedList2.get(0)).A02();
            Context context = getContext();
            C62109KaG kaG = new C62109KaG(context, new PointF(0.0f, 1.0f), userSession2, r20, product.A07, ((Product) ((Tag) linkedList2.get(1)).A02()).A07, true, 1, z4);
            Product product2 = product;
            kaG.A06(C18274Vop.A00(context, kaG.getTextLayoutParams(), product2, linkedList2.size(), C63462KxR.A00(userSession2, product, user), true), R.color.design_dark_default_color_on_background);
            kaG.setVisibility(0);
            kaG.setClickable(true);
            kaG.setTag(linkedList2.get(0));
            addView(kaG);
            AnonymousClass3ZT r1 = r9.A02;
            if (r1 != null) {
                kaG.A03 = r1;
            }
            if (r32 != null) {
                kaG.A01 = r8;
            }
            kaG.A00 = i2;
            linkedList.add(kaG);
        }
        String str2 = userSession2.A06;
        C60046JeE jeE2 = null;
        Iterator it = list2.iterator();
        loop1:
        while (true) {
            jeE = jeE2;
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                Tag tag2 = (Tag) it.next();
                if (!(tag2.A00() == null || (((tag2 instanceof FBUserTag) && ((FBUserTag) tag2).A01 == FBTagType.WITH_TAG) || linkedList2.size() == 2 || linkedList2.size() == 3))) {
                    1Xj r13 = r9.A01;
                    boolean z5 = r9.A05;
                    jeE2 = A02(userSession2, r13, tag2, r9.A03, z5, r9.A07, z3, r9.A06);
                    if (jeE2 instanceof C62107KaE) {
                        ((C62107KaE) jeE2).A06 = new C65713LyT(this, r9);
                    } else if (jeE2 instanceof C62108KaF) {
                        ((C62108KaF) jeE2).A04 = new C65711LyR(this);
                    }
                    AnonymousClass3ZT r0 = r9.A02;
                    if (r0 != null) {
                        jeE2.A03 = r0;
                    }
                    if (r32 != null) {
                        jeE2.A01 = r8;
                    }
                    jeE2.A00 = i2;
                    linkedList.add(jeE2);
                    if ((tag2 instanceof PeopleTag) && tag2.getId().equals(str2)) {
                    }
                }
            }
        }
        if (r9.A05 && (str = r9.A04) != null) {
            ArrayList A02 = AnonymousClass4H4.A02(list2);
            if (AnonymousClass4H4.A04(A02)) {
                AnonymousClass4H4.A03((HOH) null, C62669KkV.CROSSPOST_WITH_FB_TAGS_REVEAL_CLICK, (C53175Gjl) null, userSession2, str2, str, (String) null, AnonymousClass4H4.A01(str, A02), (Map) null);
            }
        }
        if (jeE != null) {
            jeE.bringToFront();
        }
        if (z) {
            this.A00 = new C22365Y0t(this, linkedList, list2, z2);
        }
        post(new M80(this, linkedList));
    }

    public TagsLayout(Context context) {
        super(context);
    }

    private int[] A00(List list, int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        LPG A03 = ((C60046JeE) list.get(i)).A03();
        int max = Math.max(0, (((int) A03.A07.x) + A03.A05.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) - A03.A0A.width());
        LPG A032 = ((C60046JeE) list.get(i2)).A03();
        int min = (Math.min(measuredWidth - A032.A0A.width(), ((int) A032.A07.x) - A032.A05.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) + ((C60046JeE) list.get(i2)).getBubbleWidth()) - max;
        int i3 = 0;
        for (int i4 = i; i4 <= i2; i4++) {
            i3 += ((C60046JeE) list.get(i4)).getBubbleWidth();
        }
        if (i3 <= min) {
            max = ((C60046JeE) list.get(i)).getPreferredBounds().left - (((((C60046JeE) list.get(i)).getPreferredBounds().left + i3) - ((C60046JeE) list.get(i2)).getPreferredBounds().right) / 2);
            min = i3;
        }
        int max2 = Math.max(0, max);
        int i5 = 0;
        while (i <= i2) {
            int bubbleWidth = (((C60046JeE) list.get(i)).getBubbleWidth() * min) / i3;
            ((C60046JeE) list.get(i)).A03().A03(max2 + i5 + (bubbleWidth / 2));
            i5 += bubbleWidth;
            i++;
        }
        return new int[]{max2, min};
    }

    public final void A04(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C60046JeE jeE = (C60046JeE) getChildAt(i);
            if (z) {
                C65717LyX lyX = new C65717LyX(jeE, this);
                C294975nL A012 = C294975nL.A01(jeE, 1);
                if (A012.A0W()) {
                    A012.A05 = new C65720Lya(jeE, lyX, A012);
                } else {
                    C247763gs.A05(jeE, lyX);
                }
            } else {
                PointF relativeTagPosition = jeE.getRelativeTagPosition();
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, relativeTagPosition.x, relativeTagPosition.y);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation.setDuration(200);
                scaleAnimation.setAnimationListener(new C21229XPz(jeE, this));
                jeE.startAnimation(scaleAnimation);
            }
        }
        if (!z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setDuration(200);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            startAnimation(alphaAnimation);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Interpolator accelerateDecelerateInterpolator;
        A03();
        Y8o y8o = this.A00;
        if (y8o != null) {
            C22365Y0t y0t = (C22365Y0t) y8o;
            y0t.A00.A00 = null;
            for (C60046JeE jeE : y0t.A01) {
                if (y0t.A03) {
                    PointF relativeTagPosition = jeE.getRelativeTagPosition();
                    C294975nL A0C = C294975nL.A01(jeE, 1).A0D(new C271654jN()).A0C(250);
                    A0C.A0U(0.0f, 1.0f, relativeTagPosition.x);
                    A0C.A0V(0.0f, 1.0f, relativeTagPosition.y);
                    A0C.A0H();
                } else {
                    boolean z2 = false;
                    if (y0t.A02.size() < 3) {
                        z2 = true;
                    }
                    PointF relativeTagPosition2 = jeE.getRelativeTagPosition();
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, relativeTagPosition2.x, relativeTagPosition2.y);
                    if (z2) {
                        accelerateDecelerateInterpolator = new OvershootInterpolator();
                    } else {
                        accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                    }
                    scaleAnimation.setInterpolator(accelerateDecelerateInterpolator);
                    scaleAnimation.setDuration(200);
                    jeE.startAnimation(scaleAnimation);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(i, i2);
        }
        setMeasuredDimension(size, size2);
    }

    private void setTagsLayoutListener(Y8o y8o) {
        this.A00 = y8o;
    }

    public TagsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTags(List list, boolean z, UserSession userSession) {
        setTags(list, new C247063fi(new C61054Jvs((Object) new MP8((Object) null, 13), 3), (1Xj) null, (AnonymousClass3ZT) null, (User) null, (String) null, false, false, false, false), (AnonymousClass3W1) null, -1, z, false, userSession);
    }

    public TagsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
