package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;
import java.util.ArrayList;

/* renamed from: X.Jdf  reason: case insensitive filesystem */
public final class C60029Jdf extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TagsInteractiveLayout A00;

    public C60029Jdf(TagsInteractiveLayout tagsInteractiveLayout) {
        this.A00 = tagsInteractiveLayout;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C60046JeE jeE;
        boolean z;
        ImageView imageView;
        TagsInteractiveLayout tagsInteractiveLayout = this.A00;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int childCount = tagsInteractiveLayout.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                jeE = null;
                break;
            }
            jeE = (C60046JeE) tagsInteractiveLayout.getChildAt(childCount);
            if (jeE.A04) {
                LPG A01 = C60046JeE.A01(jeE);
                Rect rect = A01.A09;
                if (A01.A05(x - rect.left, y - rect.top)) {
                    break;
                }
            }
        }
        tagsInteractiveLayout.A04 = jeE;
        if (jeE != null) {
            jeE.bringToFront();
            boolean z2 = false;
            if (tagsInteractiveLayout.A04.getTag() == null || !tagsInteractiveLayout.A09.contains(tagsInteractiveLayout.A04.getTaggedId()) ? !(tagsInteractiveLayout.A0E || tagsInteractiveLayout.A04.A07()) : !(tagsInteractiveLayout.A0D || tagsInteractiveLayout.A04.A07())) {
                z2 = true;
            }
            tagsInteractiveLayout.A0I = z2;
            C60046JeE jeE2 = tagsInteractiveLayout.A04;
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!(jeE2 instanceof C62106KaD)) {
                LPG A012 = C60046JeE.A01(jeE2);
                if (A012.A0I.A04 && (imageView = A012.A02) != null && imageView.getVisibility() == 0) {
                    Rect A0W = AnonymousClass7TE.A0W();
                    LPG.A00(A012).getHitRect(A0W);
                    Rect rect2 = A012.A09;
                    z = A0W.contains(x2 - rect2.left, y2 - rect2.top);
                    tagsInteractiveLayout.A0F = z;
                    tagsInteractiveLayout.A04 = (C60046JeE) tagsInteractiveLayout.getChildAt(tagsInteractiveLayout.getChildCount() - 1);
                    tagsInteractiveLayout.invalidate();
                }
            }
            z = false;
            tagsInteractiveLayout.A0F = z;
            tagsInteractiveLayout.A04 = (C60046JeE) tagsInteractiveLayout.getChildAt(tagsInteractiveLayout.getChildCount() - 1);
            tagsInteractiveLayout.invalidate();
        }
        int i = 0;
        while (true) {
            if (i < tagsInteractiveLayout.getChildCount()) {
                C60046JeE jeE3 = (C60046JeE) tagsInteractiveLayout.getChildAt(i);
                if (null != jeE3 && jeE3.A07()) {
                    jeE3.A04();
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d5, code lost:
        if (r2.A06[0].A00 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0110, code lost:
        if (r2.A06[1].A00 != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0130, code lost:
        if (r1[3].A00 != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014b, code lost:
        if (r2.A06[2].A00 != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016a, code lost:
        if (r5.A00 != false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0187, code lost:
        if (r2.A06[3].A00 != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (((com.instagram.tagging.api.model.MediaSuggestedProductTag) r3).A09() == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r36, android.view.MotionEvent r37, float r38, float r39) {
        /*
            r35 = this;
            r0 = r35
            com.instagram.tagging.widget.TagsInteractiveLayout r0 = r0.A00
            X.JeE r1 = r0.A04
            r16 = 1
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r1.getTag()
            if (r1 == 0) goto L_0x0029
            X.JeE r1 = r0.A04
            java.lang.Object r3 = r1.getTag()
            com.instagram.tagging.model.Tag r3 = (com.instagram.tagging.model.Tag) r3
            X.Kj1 r2 = r3.A01()
            X.Kj1 r1 = X.C62630Kj1.SUGGESTED_PRODUCT
            if (r2 != r1) goto L_0x0029
            com.instagram.tagging.api.model.MediaSuggestedProductTag r3 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r3
            boolean r1 = r3.A09()
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            return r16
        L_0x0029:
            X.JeE r4 = r0.A04
            X.LPG r1 = X.C60046JeE.A01(r4)
            android.graphics.PointF r1 = r1.A07
            float r3 = r1.x
            float r3 = r3 - r38
            float r2 = r1.y
            float r2 = r2 - r39
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r3, r2)
            r4.setPosition(r1)
            X.JeE r1 = r0.A05
            if (r1 == 0) goto L_0x01a0
            X.JeE r1 = r0.A04
            r1.A05()
            X.JeE r1 = r0.A04
            r1.invalidate()
        L_0x004f:
            boolean r1 = r0.A0G
            if (r1 == 0) goto L_0x018d
            long r3 = r37.getEventTime()
            long r1 = r0.A02
            long r3 = r3 - r1
            float r2 = (float) r3
            float r7 = r37.getX()
            float r8 = r37.getY()
            float r1 = r0.A00
            float r23 = r7 - r1
            float r23 = r23 / r2
            float r1 = r0.A01
            float r26 = r8 - r1
            float r26 = r26 / r2
            android.graphics.Rect r10 = r0.A0N
            X.JeE r1 = r0.A04
            X.LPG r1 = X.C60046JeE.A01(r1)
            android.graphics.Rect r1 = r1.A0B
            r10.set(r1)
            X.LE7 r2 = r0.A07
            r2.A00(r10)
            android.graphics.PointF r1 = r0.A0M
            r6 = 0
            X.0qQ.A0B(r1, r6)
            float r4 = r1.x
            float r3 = r1.y
            int r1 = r10.left
            float r5 = (float) r1
            int r1 = r10.right
            float r9 = (float) r1
            float r22 = r5 + r4
            float r4 = r4 + r9
            int r1 = r10.top
            float r11 = (float) r1
            int r1 = r10.bottom
            float r13 = (float) r1
            float r25 = r11 + r3
            float r32 = r13 + r3
            int r1 = r2.A01
            float r3 = (float) r1
            float r1 = X.AnonymousClass7TE.A00(r3, r7)
            r15 = 1117126656(0x42960000, float:75.0)
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            boolean r21 = X.C51970G9q.A1T(r1)
            X.8jK[] r1 = r2.A05
            r12 = r1[r6]
            r14 = 0
            boolean r10 = r12.A00
            if (r10 != 0) goto L_0x00bc
            r10 = r1[r16]
            boolean r10 = r10.A00
            if (r10 == 0) goto L_0x00bd
        L_0x00bc:
            r14 = 1
        L_0x00bd:
            r20 = r14 ^ 1
            float r24 = r5 - r3
            r18 = r3
            r19 = r5
            r17 = r12
            r17.A01(r18, r19, r20, r21, r22, r23, r24)
            r5 = r1[r6]
            if (r21 == 0) goto L_0x00d7
            X.8jN[] r3 = r2.A06
            r3 = r3[r6]
            boolean r10 = r3.A00
            r3 = 1
            if (r10 == 0) goto L_0x00d8
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            r5.A04(r3)
            int r3 = r2.A02
            float r3 = (float) r3
            float r5 = X.AnonymousClass7TE.A00(r3, r7)
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            boolean r21 = X.C51970G9q.A1T(r5)
            r5 = r1[r16]
            r7 = 0
            r6 = r1[r6]
            boolean r6 = r6.A00
            if (r6 != 0) goto L_0x00f5
            boolean r6 = r5.A00
            if (r6 == 0) goto L_0x00f6
        L_0x00f5:
            r7 = 1
        L_0x00f6:
            r20 = r7 ^ 1
            float r24 = r3 - r9
            r17 = r5
            r18 = r3
            r19 = r9
            r22 = r4
            r17.A01(r18, r19, r20, r21, r22, r23, r24)
            r5 = r1[r16]
            if (r21 == 0) goto L_0x0112
            X.8jN[] r3 = r2.A06
            r3 = r3[r16]
            boolean r4 = r3.A00
            r3 = 1
            if (r4 == 0) goto L_0x0113
        L_0x0112:
            r3 = 0
        L_0x0113:
            r5.A04(r3)
            int r3 = r2.A03
            float r6 = (float) r3
            float r3 = X.AnonymousClass7TE.A00(r6, r8)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            boolean r24 = X.C51970G9q.A1T(r3)
            r9 = 2
            r5 = r1[r9]
            boolean r3 = r5.A00
            if (r3 != 0) goto L_0x0132
            r3 = 3
            r3 = r1[r3]
            boolean r4 = r3.A00
            r3 = 0
            if (r4 == 0) goto L_0x0133
        L_0x0132:
            r3 = 1
        L_0x0133:
            r23 = r3 ^ 1
            float r27 = r11 - r6
            r20 = r5
            r21 = r6
            r22 = r11
            r20.A01(r21, r22, r23, r24, r25, r26, r27)
            r5 = r1[r9]
            if (r24 == 0) goto L_0x014d
            X.8jN[] r3 = r2.A06
            r3 = r3[r9]
            boolean r4 = r3.A00
            r3 = 1
            if (r4 == 0) goto L_0x014e
        L_0x014d:
            r3 = 0
        L_0x014e:
            r5.A04(r3)
            int r3 = r2.A00
            float r6 = (float) r3
            float r3 = X.AnonymousClass7TE.A00(r6, r8)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            boolean r31 = X.C51970G9q.A1T(r3)
            r7 = 3
            r5 = r1[r7]
            r3 = r1[r9]
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x016c
            boolean r4 = r5.A00
            r3 = 0
            if (r4 == 0) goto L_0x016d
        L_0x016c:
            r3 = 1
        L_0x016d:
            r30 = r3 ^ 1
            float r34 = r6 - r13
            r27 = r5
            r28 = r6
            r29 = r13
            r33 = r26
            r27.A01(r28, r29, r30, r31, r32, r33, r34)
            r3 = r1[r7]
            if (r31 == 0) goto L_0x0189
            X.8jN[] r1 = r2.A06
            r1 = r1[r7]
            boolean r2 = r1.A00
            r1 = 1
            if (r2 == 0) goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            r3.A04(r1)
        L_0x018d:
            float r1 = r37.getX()
            r0.A00 = r1
            float r1 = r37.getY()
            r0.A01 = r1
            long r1 = r37.getEventTime()
            r0.A02 = r1
            return r16
        L_0x01a0:
            r0.A03()
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60029Jdf.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.content.Context, java.lang.Object, com.instagram.tagging.activity.TaggingActivity, android.app.Activity] */
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PointF pointF;
        TagsInteractiveLayout tagsInteractiveLayout = this.A00;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (tagsInteractiveLayout.A05 != null) {
            tagsInteractiveLayout.AVW();
        } else {
            C60046JeE jeE = tagsInteractiveLayout.A04;
            if (jeE != null) {
                Tag tag = (Tag) jeE.getTag();
                if (tag.A01() == C62630Kj1.SUGGESTED_PRODUCT) {
                    MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) tag;
                    if (mediaSuggestedProductTag.A09()) {
                        MVH mvh = tagsInteractiveLayout.A08;
                        ArrayList arrayList = tagsInteractiveLayout.A0A;
                        ArrayList arrayList2 = tagsInteractiveLayout.A0B;
                        ? r8 = (TaggingActivity) mvh;
                        AnonymousClass7TF.A1B(arrayList, 1, arrayList2);
                        Product A07 = mediaSuggestedProductTag.A07();
                        if (A07 != null) {
                            FrameLayout frameLayout = new FrameLayout(r8);
                            C18597Vuo vuo = C18597Vuo.A01;
                            View A0A = DbU.A0A(DbV.A0D(frameLayout), frameLayout, R.layout.shopping_item, false);
                            A0A.setTag(new C17649Vbf(A0A));
                            Object tag2 = A0A.getTag();
                            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.tagging.search.ProductListItemViewBinder.Holder");
                            AnonymousClass0iw r11 = r8;
                            vuo.A00(r11, new C63665L2b(), new C65708LyO(), (C17649Vbf) tag2, A07);
                            DbT.A16(r8, A0A, 2Yu.A02(r8));
                            frameLayout.addView(A0A);
                            C46498Dg1 A002 = C46498Dg1.A00(r8, r8.A0o);
                            A002.A01 = frameLayout;
                            A002.A02(LYA.A00(tagsInteractiveLayout, mediaSuggestedProductTag, r8, 35), 2131952146);
                            A002.A04(new C64253LXf(8, arrayList, mediaSuggestedProductTag, arrayList2, r8, tagsInteractiveLayout), 2131952144);
                            A002.A04(new C64249LXb(7, A07, mediaSuggestedProductTag, tagsInteractiveLayout, r8), 2131952145);
                            new C49945FFy(A002).A03(r8);
                            return true;
                        }
                    } else {
                        if (!tagsInteractiveLayout.A06.CKU()) {
                            if (tagsInteractiveLayout.A08.Cnh(tagsInteractiveLayout, tagsInteractiveLayout.A0A, tagsInteractiveLayout.A0B)) {
                                pointF = C60046JeE.A01(jeE).A06;
                            }
                        }
                        tagsInteractiveLayout.A06.EvN();
                        return true;
                    }
                } else {
                    if (tagsInteractiveLayout.A0F) {
                        tagsInteractiveLayout.A09(tag);
                        tagsInteractiveLayout.A08.DqQ((PeopleTag) null);
                    }
                    if (tagsInteractiveLayout.A0I) {
                        jeE.A04();
                        return true;
                    }
                }
            } else {
                if (!tagsInteractiveLayout.A06.CKU()) {
                    if (tagsInteractiveLayout.A08.Cnh(tagsInteractiveLayout, tagsInteractiveLayout.A0A, tagsInteractiveLayout.A0B)) {
                        pointF = new PointF(x / AnonymousClass7TE.A02(tagsInteractiveLayout), JTP.A00(y, tagsInteractiveLayout));
                    }
                }
                tagsInteractiveLayout.A06.EvN();
                return true;
            }
            tagsInteractiveLayout.A08(pointF);
            return true;
        }
        return true;
    }
}
