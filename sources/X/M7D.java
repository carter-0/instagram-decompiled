package X;

import java.util.List;

public final /* synthetic */ class M7D implements Runnable {
    public final /* synthetic */ C65161LoQ A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ M7D(C65161LoQ loQ, List list) {
        this.A00 = loQ;
        this.A01 = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            X.LoQ r4 = r0.A00
            java.util.List r5 = r0.A01
            boolean r0 = r4.A00
            java.lang.String r3 = "RenderCompleteListener"
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "onRenderFinished(): render was cancelled. Returning early."
            X.0KC.A0C(r3, r0)
            return
        L_0x0012:
            X.JWG r2 = r4.A07
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r0 = r2.A0B(r1)
            if (r0 == 0) goto L_0x0360
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "onRenderFinished(): hide the processing dialog."
            X.0KC.A0C(r3, r0)
            r2.A08(r1)
        L_0x0028:
            r17 = 1
            java.util.Iterator r16 = r5.iterator()
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0386
            java.lang.Object r1 = r16.next()
            X.LEA r1 = (X.LEA) r1
            X.LAM r0 = r1.A03
            X.KgB r2 = r0.A02
            X.KgB r0 = X.C62461KgB.UPLOAD
            java.lang.String r5 = "unable_to_save_image"
            if (r2 != r0) goto L_0x034c
            java.lang.Integer r2 = r1.A07
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            if (r2 != r14) goto L_0x0332
            com.instagram.creation.base.MediaSession r10 = r4.A06
            com.instagram.model.creation.MediaCaptureConfig r8 = r4.A0A
            if (r8 == 0) goto L_0x0054
            boolean r0 = r8.A0D
            if (r0 != 0) goto L_0x005c
        L_0x0054:
            if (r10 == 0) goto L_0x005c
            java.lang.String r0 = r1.A08
            r10.EWh(r0)
            goto L_0x002e
        L_0x005c:
            java.lang.String r0 = "onRenderFinished(): rendering was successful. Post PendingMediaProvider#commitPendingMediaUpdates() to handle the upload."
            X.0KC.A0C(r3, r0)
            X.4cI r9 = r4.A0B
            r10.getClass()
            java.lang.String r2 = r10.BbR()
            if (r2 != 0) goto L_0x0073
            java.lang.String r2 = X.JTQ.A0Z()
            r10.EfV(r2)
        L_0x0073:
            X.3Q2 r6 = r9.BbQ(r2)
            if (r6 != 0) goto L_0x008e
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.3Q2 r6 = X.AnonymousClass9T3.A01(r2)
            android.content.Context r2 = r4.A03
            java.lang.Class<X.4cN> r0 = X.C267884cN.class
            java.lang.Object r0 = X.0mE.A01(r2, r0)
            X.4cN r0 = (X.C267884cN) r0
            r0.Ex2(r6)
        L_0x008e:
            com.instagram.creation.base.CropInfo r5 = r10.Asr()
            if (r5 == 0) goto L_0x0318
            int r2 = r5.A01
            int r11 = r5.A00
            java.lang.String r0 = r1.A08
            r6.A33 = r0
            int r0 = r4.A02
            r6.A0K = r0
            r6.A0H = r2
            r6.A0G = r11
            android.graphics.Point r0 = r1.A01
            r0.getClass()
            int r7 = r0.x
            int r0 = r0.y
            r6.A0C = r7
            r6.A0B = r0
            android.graphics.Point r0 = r1.A02
            r0.getClass()
            int r7 = r0.x
            int r0 = r0.y
            r6.A0S = r7
            r6.A0R = r0
            X.MRo r0 = r10.B2U()
            int r7 = r0.getValue()
            X.82q r0 = r4.A08
            X.514 r12 = r0.ANP()
            android.graphics.Rect r0 = r5.A02
            r5 = 0
            X.0qQ.A0B(r0, r5)
            int r5 = r0.left
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            int r5 = r0.top
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            int r5 = r0.right
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r0 = r0.bottom
            java.lang.Integer[] r0 = X.JTQ.A1a(r15, r13, r5, r0)
            java.util.List r0 = X.0sr.A1P(r0)
            r6.A4M = r0
            r6.A15 = r12
            java.lang.Double r0 = r1.A04
            r6.A24 = r0
            java.lang.Double r0 = r1.A05
            r6.A25 = r0
            int r0 = r1.A00
            r6.A0A = r0
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r13 = r10.B5r()
            if (r13 == 0) goto L_0x0316
            X.4nL r5 = new X.4nL
            r5.<init>()
            r0 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = r13.B5u(r0)
            boolean r0 = r1 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter
            if (r0 != 0) goto L_0x011b
            boolean r0 = r1 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter
            if (r0 == 0) goto L_0x02a6
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter r1 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter) r1
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = r1.A01
        L_0x011b:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r1 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r1
            if (r1 == 0) goto L_0x0133
            java.lang.String r0 = r1.A04
            int r0 = X.C366508p8.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0P = r0
            float r0 = r1.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.A07 = r0
        L_0x0133:
            r0 = 22
            boolean r0 = r13.CTc(r0)
            if (r0 == 0) goto L_0x0142
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0N = r0
        L_0x0142:
            r0 = 19
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r12 = r13.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter r12 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter) r12
            r12.getClass()
            java.lang.Integer r1 = r12.A05
            if (r1 == r14) goto L_0x017e
            int r0 = X.AE9.A01(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0Q = r0
            float r0 = r12.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.A0J = r0
            java.lang.Integer r0 = r12.A05
            int r14 = r0.intValue()
            r0 = 1
            if (r14 == r0) goto L_0x02a2
            r0 = 2
            if (r14 == r0) goto L_0x029e
            r0 = 0
        L_0x0170:
            r5.A02 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x017e
            float r0 = r12.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.A0I = r0
        L_0x017e:
            r1 = 10
            boolean r0 = r13.CTc(r1)
            if (r0 == 0) goto L_0x0197
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r13.B5u(r1)
            r0.getClass()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r0
            float r0 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.A0G = r0
        L_0x0197:
            r0 = 13
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r13.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r0
            r0.getClass()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r12 = r0.A01
            java.util.Map r1 = r12.A02
            java.lang.String r14 = "brightness"
            float r0 = X.JTS.A02(r14, r1)
            r15 = 0
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A03 = r0
        L_0x01b9:
            java.lang.String r14 = "contrast"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A04 = r0
        L_0x01cb:
            java.lang.String r14 = "saturation"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A0D = r0
        L_0x01dd:
            java.lang.String r14 = "temperature"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A0H = r0
        L_0x01ef:
            java.lang.String r14 = "vignette"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0201
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A0M = r0
        L_0x0201:
            java.lang.String r14 = "fade"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0213
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A06 = r0
        L_0x0213:
            java.lang.String r14 = "highlights"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A08 = r0
        L_0x0225:
            java.lang.String r14 = "shadows"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0237
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A0E = r0
        L_0x0237:
            java.lang.String r14 = "sharpen"
            float r0 = X.JTS.A02(r14, r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r1.get(r14)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A0F = r0
        L_0x0249:
            java.util.Map r12 = r12.A01
            java.lang.String r0 = "tint_shadows_color"
            java.lang.Object r0 = r12.get(r0)
            float[] r0 = (float[]) r0
            X.KiD r0 = X.LSj.A01(r0)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x026d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0S = r0
            java.lang.String r0 = "tint_shadows_intensity"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A0L = r0
        L_0x026d:
            java.lang.String r0 = "tint_highlights_color"
            java.lang.Object r0 = r12.get(r0)
            float[] r0 = (float[]) r0
            X.KiD r0 = X.LSj.A02(r0)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x028f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0R = r0
            java.lang.String r0 = "tint_highlights_intensity"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            r5.A0K = r0
        L_0x028f:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r12 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform
            r12.<init>()
            java.lang.String r0 = "FilterGroupUtil_getPhotoEdits()"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r1 = X.C395019z4.A00(r13, r0)
            if (r1 == 0) goto L_0x02c9
            monitor-enter(r1)
            goto L_0x02c1
        L_0x029e:
            android.graphics.PointF r0 = r12.A03
            goto L_0x0170
        L_0x02a2:
            android.graphics.PointF r0 = r12.A04
            goto L_0x0170
        L_0x02a6:
            if (r1 != 0) goto L_0x02bc
            java.lang.String r1 = "null"
        L_0x02aa:
            java.lang.String r0 = "FilterModel is an unexpected type: "
            java.lang.String r12 = X.002.A0R(r0, r1)
            java.lang.String r1 = "FilterGroupUtil_getFullyVisibleColorFilterModel()"
            r0 = 1
            X.0qQ.A0B(r12, r0)
            r0 = 0
            X.0kD.A0C(r1, r12, r0)
            goto L_0x0133
        L_0x02bc:
            java.lang.String r1 = X.C51968G9o.A16(r1)
            goto L_0x02aa
        L_0x02c1:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r1.A00     // Catch:{ all -> 0x0383 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x0383 }
            r12.A01(r0)     // Catch:{ all -> 0x0383 }
            monitor-exit(r1)
        L_0x02c9:
            float r13 = r12.A01
            float r0 = r12.A02
            float r1 = -r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r13, r1)
            r5.A00 = r0
            float r0 = r12.A06
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.A05 = r0
            float r1 = r12.A03
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02e9
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r5.A0A = r0
        L_0x02e9:
            float r1 = r12.A04
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02f5
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r5.A0B = r0
        L_0x02f5:
            float r1 = r12.A05
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0301
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r5.A0C = r0
        L_0x0301:
            int r0 = r12.A07
            if (r0 == 0) goto L_0x030b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0O = r0
        L_0x030b:
            float r2 = (float) r2
            float r1 = (float) r11
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r2, r1)
            r5.A01 = r0
            r6.A1a = r5
        L_0x0316:
            r6.A08 = r7
        L_0x0318:
            X.A6E r0 = r10.BsX()
            r6.A18 = r0
            r9.AIU()
            boolean r0 = r6.A5U
            if (r0 != 0) goto L_0x002e
            if (r8 == 0) goto L_0x002e
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x002e
            X.4cN r0 = r4.A09
            r0.FMZ(r6)
            goto L_0x002e
        L_0x0332:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1 = 2131975833(0x7f135e99, float:1.958877E38)
            if (r2 != r0) goto L_0x033e
            r1 = 2131975832(0x7f135e98, float:1.9588767E38)
            java.lang.String r5 = "unable_to_render_image"
        L_0x033e:
            android.content.Context r0 = r4.A03
            X.C59689JTv.A0F(r0, r5, r1)
            java.lang.String r0 = "onRenderFinished(): rendering was not successful. Show an error toast and do nothing."
            X.0KC.A0C(r3, r0)
            r17 = 0
            goto L_0x002e
        L_0x034c:
            X.KgB r0 = X.C62461KgB.GALLERY
            if (r2 != r0) goto L_0x002e
            java.lang.Integer r1 = r1.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x002e
            r1 = 2131975833(0x7f135e99, float:1.958877E38)
            android.content.Context r0 = r4.A03
            X.C59689JTv.A0F(r0, r5, r1)
            goto L_0x002e
        L_0x0360:
            boolean r0 = r2.A09()
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x0380
            java.lang.String r1 = X.LPN.A02(r0)
        L_0x036e:
            java.lang.String r0 = "Dialog still showing for type: "
            java.lang.String r2 = X.002.A0R(r0, r1)
            java.lang.String r1 = "dialog_helper"
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 0
            X.0kD.A0C(r1, r2, r0)
            goto L_0x0028
        L_0x0380:
            java.lang.String r1 = "null"
            goto L_0x036e
        L_0x0383:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0386:
            if (r17 == 0) goto L_0x03bf
            com.instagram.creation.base.MediaSession r0 = r4.A06
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r0.B5r()
            r1.getClass()
            java.lang.String r0 = "RenderCompleteListener_onRenderFinished()"
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r0 = X.C394999z2.A00(r1, r0)
            if (r0 == 0) goto L_0x03bd
            int r1 = r0.A08
        L_0x039e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.0xI r2 = X.C59882Jb5.A00(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "filter_id"
            r2.A08(r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A04
            X.DbU.A1R(r2, r0)
            java.lang.String r0 = "onRenderFinished(): rendering was successful. Attempt to navigate to the next screen."
            X.0KC.A0C(r3, r0)
            X.4mk r0 = r4.A05
            r0.AGc()
            return
        L_0x03bd:
            r1 = -1
            goto L_0x039e
        L_0x03bf:
            X.4mk r0 = r4.A05
            r0.AGe()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M7D.run():void");
    }
}
