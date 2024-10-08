package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ac  reason: invalid class name and case insensitive filesystem */
public abstract class C244083ac {
    public static final SparseArray A00(C244063aa r2) {
        SparseArray sparseArray = new SparseArray(1);
        sparseArray.append(R.id.post_impression_view_tracking_node, r2);
        return sparseArray;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0242, code lost:
        r0 = r7.get("has_fully_rendered");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0248, code lost:
        if (r0 == null) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024a, code lost:
        r3.A03("has_fully_rendered", (java.lang.Boolean) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024f, code lost:
        r0 = r7.get("index_of_card");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0255, code lost:
        if (r0 == null) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0257, code lost:
        r3.A06("index_of_card", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x025e, code lost:
        r0 = r7.get("carousel_media_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0264, code lost:
        if (r0 == null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0266, code lost:
        r3.A06("carousel_media_id", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026d, code lost:
        r1 = "carousel_media_type";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026f, code lost:
        r0 = r7.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0273, code lost:
        if (r0 == null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0275, code lost:
        r3.A06(r1, r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x027c, code lost:
        r0 = r7.get("view_rendering_component_type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0280, code lost:
        if (r0 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0282, code lost:
        r3.A06("view_rendering_component_type", r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashMap A02(java.lang.String r10) {
        /*
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r0 = X.AnonymousClass59A.A06
            java.lang.Object r0 = r0.get(r10)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x0293
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x001b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r4 = r5.get(r6)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x003e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x003e:
            java.util.Collection r0 = r0.values()
            java.util.Iterator r9 = r0.iterator()
        L_0x0046:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x028e
            java.lang.Object r0 = r9.next()
            X.0qQ.A07(r0)
            X.59E r0 = (X.AnonymousClass59E) r0
            X.5mO r3 = new X.5mO
            r3.<init>()
            java.util.Map r7 = r0.A01
            java.lang.String r2 = "component_type"
            java.lang.Object r0 = r7.get(r2)
            if (r0 == 0) goto L_0x028b
            java.lang.String r8 = r0.toString()
        L_0x0068:
            java.lang.String r1 = "view_tracking_node_name"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0075
            X.3aa r0 = (X.C244063aa) r0
            r3.A01(r0, r1)
        L_0x0075:
            if (r8 == 0) goto L_0x007a
            r3.A06(r2, r8)
        L_0x007a:
            java.lang.String r1 = "x_pos"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0087
            java.lang.Double r0 = (java.lang.Double) r0
            r3.A04(r1, r0)
        L_0x0087:
            java.lang.String r1 = "y_pos"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0094
            java.lang.Double r0 = (java.lang.Double) r0
            r3.A04(r1, r0)
        L_0x0094:
            java.lang.String r1 = "width"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x00a1
            java.lang.Double r0 = (java.lang.Double) r0
            r3.A04(r1, r0)
        L_0x00a1:
            java.lang.String r1 = "height"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x00ae
            java.lang.Double r0 = (java.lang.Double) r0
            r3.A04(r1, r0)
        L_0x00ae:
            java.lang.String r1 = "background_color"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x00bd:
            java.lang.String r1 = "background_color_alpha"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x00cc:
            java.lang.String r2 = "view_rendering_component_type"
            java.lang.Object r0 = r7.get(r2)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = r0.toString()
            r3.A06(r2, r0)
        L_0x00db:
            java.lang.String r1 = "is_tappable"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x00e8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r3.A03(r1, r0)
        L_0x00e8:
            if (r8 == 0) goto L_0x00f1
            int r0 = r8.hashCode()
            switch(r0) {
                case 115704: goto L_0x00f6;
                case 2908512: goto L_0x012c;
                case 3556653: goto L_0x015f;
                case 100313435: goto L_0x01ce;
                case 112202875: goto L_0x01e6;
                default: goto L_0x00f1;
            }
        L_0x00f1:
            r4.add(r3)
            goto L_0x0046
        L_0x00f6:
            java.lang.String r0 = "ufi"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "is_like_button_visible"
            java.lang.Object r1 = r7.get(r0)
            if (r1 == 0) goto L_0x010d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r0 = "like_button_is_visible"
            r3.A03(r0, r1)
        L_0x010d:
            java.lang.String r0 = "is_comment_button_visible"
            java.lang.Object r1 = r7.get(r0)
            if (r1 == 0) goto L_0x011c
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r0 = "comment_button_is_visible"
            r3.A03(r0, r1)
        L_0x011c:
            java.lang.String r0 = "is_direct_share_button_visible"
            java.lang.Object r1 = r7.get(r0)
            if (r1 == 0) goto L_0x00f1
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r0 = "direct_share_button_is_visible"
            r3.A03(r0, r1)
            goto L_0x00f1
        L_0x012c:
            java.lang.String r0 = "carousel"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = "index_of_card"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x0143:
            java.lang.String r1 = "number_of_cards"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0150
            java.lang.Long r0 = (java.lang.Long) r0
            r3.A05(r1, r0)
        L_0x0150:
            java.lang.String r1 = "is_progress_bar"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x027c
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r3.A03(r1, r0)
            goto L_0x027c
        L_0x015f:
            java.lang.String r0 = "text"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = "text_string"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x0176:
            java.lang.String r1 = "font_size"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0183
            java.lang.Long r0 = (java.lang.Long) r0
            r3.A05(r1, r0)
        L_0x0183:
            java.lang.String r1 = "font_style"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x0192:
            java.lang.String r1 = "font_line_height"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x019f
            java.lang.Double r0 = (java.lang.Double) r0
            r3.A04(r1, r0)
        L_0x019f:
            java.lang.String r1 = "text_color"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x01ae:
            java.lang.String r1 = "text_colors"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x01bd
            java.util.List r0 = X.0u4.A01(r0)
            r3.A07(r1, r0)
        L_0x01bd:
            java.lang.String r1 = "number_lines_showed"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x01ca
            java.lang.Long r0 = (java.lang.Long) r0
            r3.A05(r1, r0)
        L_0x01ca:
            java.lang.String r1 = "index_of_card"
            goto L_0x026f
        L_0x01ce:
            java.lang.String r0 = "image"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = "media_urls"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0242
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
            goto L_0x0242
        L_0x01e6:
            java.lang.String r0 = "video"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = "media_urls"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x01fd:
            java.lang.String r1 = "has_audio"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x020a
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r3.A03(r1, r0)
        L_0x020a:
            java.lang.String r1 = "has_subtitle"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0217
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r3.A03(r1, r0)
        L_0x0217:
            java.lang.String r1 = "thumbnail_url"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0226
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x0226:
            java.lang.String r1 = "video_ids"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0235
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x0235:
            java.lang.String r1 = "video_duration_sec"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0242
            java.lang.Double r0 = (java.lang.Double) r0
            r3.A04(r1, r0)
        L_0x0242:
            java.lang.String r1 = "has_fully_rendered"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x024f
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r3.A03(r1, r0)
        L_0x024f:
            java.lang.String r1 = "index_of_card"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x025e
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x025e:
            java.lang.String r1 = "carousel_media_id"
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x026d
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x026d:
            java.lang.String r1 = "carousel_media_type"
        L_0x026f:
            java.lang.Object r0 = r7.get(r1)
            if (r0 == 0) goto L_0x027c
            java.lang.String r0 = r0.toString()
            r3.A06(r1, r0)
        L_0x027c:
            java.lang.Object r0 = r7.get(r2)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r0.toString()
            r3.A06(r2, r0)
            goto L_0x00f1
        L_0x028b:
            r8 = 0
            goto L_0x0068
        L_0x028e:
            r5.put(r6, r4)
            goto L_0x001b
        L_0x0293:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244083ac.A02(java.lang.String):java.util.LinkedHashMap");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.59F, android.widget.ImageView, android.view.View, java.lang.Object] */
    public static final List A03(View view, C244063aa r18, C244323b0 r19) {
        Drawable drawable;
        C244303ay r2;
        float[] fArr;
        List list;
        float intValue;
        C244323b0 r10 = r19;
        0qQ.A0B(r10, 1);
        List list2 = r10.A05;
        2HY A0C = C229632nm.A0C(0, list2.size());
        if (A0C.isEmpty()) {
            return 0sn.A00;
        }
        int[] iArr = new int[2];
        View view2 = view;
        Context context = view2.getContext();
        view2.getLocationOnScreen(iArr);
        ArrayList arrayList = new ArrayList();
        0sh it = A0C.iterator();
        while (it.hasNext()) {
            int A00 = it.A00();
            if (A00 < 0 || A00 >= list2.size()) {
                drawable = null;
            } else {
                drawable = (Drawable) list2.get(A00);
            }
            if ((drawable instanceof C244303ay) && (r2 = (C244303ay) drawable) != null) {
                0qQ.A0A(context);
                ? r1 = new AnonymousClass59F(context);
                r1.setId(A00);
                if (A00 >= 0) {
                    List list3 = r10.A08;
                    if (A00 < list3.size()) {
                        float f = ((float) (r10.A03 - r10.A02)) / 2.0f;
                        int intValue2 = r10.A04.intValue();
                        float f2 = 0.0f;
                        if (intValue2 == 2) {
                            list = r10.A07;
                            f2 = ((float) ((Number) list.get(A00)).intValue()) * 1.0f;
                            intValue = ((float) ((Number) list3.get(A00)).intValue()) * 1.0f;
                        } else if (intValue2 == 1) {
                            list = r10.A06;
                            f2 = ((float) ((Number) list.get(A00)).intValue()) * 1.0f;
                            intValue = ((float) ((Number) list3.get(A00)).intValue()) * 1.0f;
                        } else if (intValue2 == 3) {
                            if (A00 == list2.size() - 1) {
                                f = 0.0f;
                            }
                            intValue = ((float) ((Number) list3.get(A00)).intValue()) * 1.0f;
                            f2 = f;
                        } else if (intValue2 != 0) {
                            intValue = 0.0f;
                        } else {
                            f2 = ((float) ((Number) r10.A06.get(A00)).intValue()) * 1.0f;
                            if (A00 == list2.size() - 1) {
                                f = 0.0f;
                            }
                            intValue = f;
                        }
                        fArr = new float[]{f2, intValue};
                        Float[] fArr2 = {Float.valueOf(((float) iArr[0]) + fArr[0]), Float.valueOf(((float) iArr[1]) + fArr[1])};
                        int i = r2.A01;
                        r1.A0H(fArr2, i, i);
                        r1.setImageDrawable(r2);
                        A05(r1, r18);
                        arrayList.add(r1);
                    }
                }
                fArr = new float[]{0.0f, 0.0f};
                Float[] fArr22 = {Float.valueOf(((float) iArr[0]) + fArr[0]), Float.valueOf(((float) iArr[1]) + fArr[1])};
                int i2 = r2.A01;
                r1.A0H(fArr22, i2, i2);
                r1.setImageDrawable(r2);
                A05(r1, r18);
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public static final void A05(View view, C244063aa r2) {
        0qQ.A0B(view, 0);
        view.setTag(R.id.post_impression_view_tracking_node, r2);
    }

    public static final String A01(Integer num) {
        if (num == null) {
            return "";
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "font_style_normal";
        }
        if (intValue == 1) {
            return "font_style_bold";
        }
        if (intValue == 3) {
            return "font_style_bold_italic";
        }
        return intValue == 2 ? "font_style_italic" : "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r2.getTag(com.instagram.android.R.id.image_component_uri_tag) == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(android.view.View r2) {
        /*
            boolean r0 = r2 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x000e
            r0 = 2131434543(0x7f0b1c2f, float:1.8490903E38)
            java.lang.Object r1 = r2.getTag(r0)
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r1 = 1
            if (r0 != 0) goto L_0x0022
            boolean r0 = r2 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x001d
            r0 = r2
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0C
            if (r0 != 0) goto L_0x0022
        L_0x001d:
            boolean r0 = r2 instanceof X.AnonymousClass59F
            if (r0 != 0) goto L_0x0022
            r1 = 0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244083ac.A06(android.view.View):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.59F, android.widget.ImageView, android.view.View, java.lang.Object] */
    public static final void A04(Spanned spanned, View view, C244063aa r13, List list) {
        Layout layout;
        C2606346l[] r2 = (C2606346l[]) spanned.getSpans(0, spanned.length(), C2606346l.class);
        0qQ.A0A(r2);
        if (r2.length != 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Context context = view.getContext();
            int i = iArr[1];
            int height = view.getHeight();
            0sC r4 = new 0sC(r2);
            while (r4.hasNext()) {
                DynamicDrawableSpan dynamicDrawableSpan = (DynamicDrawableSpan) r4.next();
                int intrinsicHeight = dynamicDrawableSpan.getDrawable().getIntrinsicHeight();
                int intrinsicWidth = dynamicDrawableSpan.getDrawable().getIntrinsicWidth();
                int spanStart = spanned.getSpanStart(dynamicDrawableSpan);
                float f = 0.0f;
                if ((view instanceof TextView) && (layout = ((TextView) view).getLayout()) != null) {
                    f = layout.getPrimaryHorizontal(spanStart);
                }
                Float[] fArr = {Float.valueOf(f), Float.valueOf((((float) i) + (((float) height) / 2.0f)) - (((float) intrinsicHeight) / 2.0f))};
                0qQ.A0A(context);
                ? r1 = new AnonymousClass59F(context);
                r1.A0H(fArr, intrinsicWidth, intrinsicHeight);
                r1.setImageDrawable(dynamicDrawableSpan.getDrawable());
                A05(r1, r13);
                list.add(r1);
            }
        }
    }
}
