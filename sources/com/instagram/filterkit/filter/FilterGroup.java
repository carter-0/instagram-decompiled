package com.instagram.filterkit.filter;

import X.0qQ;
import X.AE9;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.C62580KiD;
import X.LSj;
import X.W6E;
import X.X98;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.filterkit.filter.intf.IgFilter;
import com.instagram.unifiedfilter.UnifiedFilterManager;
import java.util.Map;

public class FilterGroup implements IgFilter {
    public static final Parcelable.Creator CREATOR = new W6E(46);
    public UnifiedFilterManager A00;
    public boolean A01 = false;
    public final FilterChain A02;
    public final UnifiedFilterParamCallback A03;
    public final int[] A04 = new int[2];

    public interface UnifiedFilterParamCallback extends Parcelable {
    }

    public final void AHH(X98 x98) {
    }

    public final int describeContents() {
        return 0;
    }

    private void A00(FilterModel filterModel, X98 x98, int i) {
        float[] fArr;
        float f;
        Object obj;
        float f2;
        int i2 = i;
        FilterModel filterModel2 = filterModel;
        X98 x982 = x98;
        0qQ.A0B(x982, 0);
        UnifiedFilterManager CBT = x982.CBT();
        if (filterModel2 instanceof ColorFilter) {
            CBT.setParameter(i2, "strength", new float[]{((ColorFilter) filterModel2).A00}, 1);
            return;
        }
        String str = "angle";
        if (filterModel2 instanceof TiltShiftOverlayFilter) {
            TiltShiftOverlayFilter tiltShiftOverlayFilter = (TiltShiftOverlayFilter) filterModel2;
            Integer num = tiltShiftOverlayFilter.A06;
            CBT.setParameter(i2, DatePickerDialogModule.ARG_MODE, AE9.A01(num));
            CBT.setParameter(i2, AnonymousClass000.A00(2703), 1);
            CBT.setParameter(i2, AnonymousClass000.A00(3711), new float[]{tiltShiftOverlayFilter.A00}, 1);
            if (num == AnonymousClass05K.A01) {
                PointF pointF = tiltShiftOverlayFilter.A05;
                CBT.setParameter(i2, "center", new float[]{pointF.x, pointF.y}, 2);
                CBT.setParameter(i2, "radius", new float[]{tiltShiftOverlayFilter.A01}, 1);
                return;
            } else if (num == AnonymousClass05K.A0C) {
                PointF pointF2 = tiltShiftOverlayFilter.A04;
                CBT.setParameter(i2, "center", new float[]{pointF2.x, pointF2.y}, 2);
                CBT.setParameter(i2, "radius", new float[]{tiltShiftOverlayFilter.A03}, 1);
                fArr = new float[1];
                f = -tiltShiftOverlayFilter.A02;
            } else {
                return;
            }
        } else if (filterModel2 instanceof TiltShiftFilter) {
            TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterModel2;
            Integer num2 = tiltShiftFilter.A05;
            CBT.setParameter(19, DatePickerDialogModule.ARG_MODE, AE9.A01(num2));
            if (num2 == AnonymousClass05K.A01) {
                PointF pointF3 = tiltShiftFilter.A04;
                CBT.setParameter(19, "center", new float[]{pointF3.x, pointF3.y}, 2);
                CBT.setParameter(19, "radius", new float[]{tiltShiftFilter.A00}, 1);
                return;
            } else if (num2 == AnonymousClass05K.A0C) {
                PointF pointF4 = tiltShiftFilter.A03;
                CBT.setParameter(19, "center", new float[]{pointF4.x, pointF4.y}, 2);
                CBT.setParameter(19, "radius", new float[]{tiltShiftFilter.A02}, 1);
                CBT.setParameter(19, str, new float[]{-tiltShiftFilter.A01}, 1);
                return;
            } else {
                return;
            }
        } else if (filterModel2 instanceof SurfaceCropFilterModel) {
            float[] fArr2 = ((SurfaceCropFilterModel) filterModel2).A0O;
            CBT.setParameter(i2, AnonymousClass000.A00(4653), fArr2, fArr2.length);
            return;
        } else if (filterModel2 instanceof ValueMapFilterModel) {
            ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterModel2;
            String str2 = valueMapFilterModel.A03;
            int hashCode = str2.hashCode();
            if (hashCode != -1726412436) {
                if (hashCode != -1392607189) {
                    if (hashCode == 1651896512 && str2.equals(AnonymousClass000.A00(1131))) {
                        float[] fArr3 = new float[1];
                        TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
                        Map map = typedParameterMap.A02;
                        Object obj2 = map.get("brightness");
                        if (obj2 != null) {
                            fArr3[0] = AnonymousClass7TE.A04(obj2);
                            CBT.setParameter(i2, "brightness", fArr3, 1);
                            float[] fArr4 = new float[1];
                            Object obj3 = map.get("contrast");
                            if (obj3 != null) {
                                fArr4[0] = AnonymousClass7TE.A04(obj3);
                                CBT.setParameter(i2, "contrast", fArr4, 1);
                                float[] fArr5 = new float[1];
                                Object obj4 = map.get("saturation");
                                if (obj4 != null) {
                                    fArr5[0] = AnonymousClass7TE.A04(obj4);
                                    CBT.setParameter(i2, "saturation", fArr5, 1);
                                    float[] fArr6 = new float[1];
                                    Object obj5 = map.get("temperature");
                                    if (obj5 != null) {
                                        fArr6[0] = AnonymousClass7TE.A04(obj5);
                                        CBT.setParameter(i2, "temperature", fArr6, 1);
                                        float[] fArr7 = new float[1];
                                        Object obj6 = map.get("fade");
                                        if (obj6 != null) {
                                            fArr7[0] = AnonymousClass7TE.A04(obj6);
                                            CBT.setParameter(i2, "fade", fArr7, 1);
                                            float[] fArr8 = new float[1];
                                            Object obj7 = map.get("vignette");
                                            if (obj7 != null) {
                                                fArr8[0] = AnonymousClass7TE.A04(obj7);
                                                CBT.setParameter(i2, "vignette", fArr8, 1);
                                                Map map2 = typedParameterMap.A01;
                                                Object obj8 = map2.get("tint_shadows_color");
                                                if (obj8 != null) {
                                                    C62580KiD A012 = LSj.A01((float[]) obj8);
                                                    float[] fArr9 = new float[1];
                                                    C62580KiD kiD = C62580KiD.A06;
                                                    float f3 = 0.0f;
                                                    if (A012 != kiD) {
                                                        Object obj9 = map.get("tint_shadows_intensity");
                                                        if (obj9 != null) {
                                                            f2 = AnonymousClass7TE.A04(obj9);
                                                        } else {
                                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                                        }
                                                    } else {
                                                        f2 = 0.0f;
                                                    }
                                                    fArr9[0] = f2;
                                                    CBT.setParameter(i2, "tint_shadows_intensity", fArr9, 1);
                                                    float[] fArr10 = A012.A00;
                                                    0qQ.A07(fArr10);
                                                    CBT.setParameter(i2, "tint_shadows_color", fArr10, 3);
                                                    Object obj10 = map2.get("tint_highlights_color");
                                                    if (obj10 != null) {
                                                        C62580KiD A022 = LSj.A02((float[]) obj10);
                                                        float[] fArr11 = new float[1];
                                                        if (A022 != kiD) {
                                                            Object obj11 = map.get("tint_highlights_intensity");
                                                            if (obj11 != null) {
                                                                f3 = AnonymousClass7TE.A04(obj11);
                                                            } else {
                                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                                            }
                                                        }
                                                        fArr11[0] = f3;
                                                        CBT.setParameter(i2, "tint_highlights_intensity", fArr11, 1);
                                                        float[] fArr12 = A022.A00;
                                                        0qQ.A07(fArr12);
                                                        CBT.setParameter(i2, "tint_highlights_color", fArr12, 3);
                                                        i2 = 13;
                                                        float[] fArr13 = new float[1];
                                                        Object obj12 = map.get("highlights");
                                                        if (obj12 != null) {
                                                            fArr13[0] = AnonymousClass7TE.A04(obj12);
                                                            CBT.setParameter(13, "highlights", fArr13, 1);
                                                            float[] fArr14 = new float[1];
                                                            Object obj13 = map.get("shadows");
                                                            if (obj13 != null) {
                                                                fArr14[0] = AnonymousClass7TE.A04(obj13);
                                                                CBT.setParameter(13, "shadows", fArr14, 1);
                                                                fArr = new float[1];
                                                                str = "sharpen";
                                                                obj = map.get(str);
                                                                if (obj == null) {
                                                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                                                }
                                                            } else {
                                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                                            }
                                                        } else {
                                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                                        }
                                                    } else {
                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                    }
                                                } else {
                                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                                }
                                            } else {
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                        } else {
                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        return;
                    }
                } else if (str2.equals("gaussian_blur")) {
                    float[] fArr15 = new float[1];
                    Map map3 = valueMapFilterModel.A01.A02;
                    Object obj14 = map3.get("sigma");
                    if (obj14 != null) {
                        fArr15[0] = AnonymousClass7TE.A04(obj14);
                        CBT.setParameter(i2, "sigma", fArr15, 1);
                        fArr = new float[1];
                        str = "kernel_size";
                        obj = map3.get(str);
                        if (obj == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    return;
                }
                f = AnonymousClass7TE.A04(obj);
            } else if (str2.equals("image_overlay")) {
                Object obj15 = valueMapFilterModel.A01.A05.get("overlay");
                if (obj15 != null) {
                    CBT.addOverlay(i2, (String) obj15, false, valueMapFilterModel.A05, 12);
                    CBT.setFilter(26, (String) null);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else {
                return;
            }
        } else {
            return;
        }
        fArr[0] = f;
        CBT.setParameter(i2, str, fArr, 1);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.VY1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        if (r2 == false) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void EEs(X.X98 r20, X.C365358my r21, X.XBw r22) {
        /*
            r19 = this;
            r14 = r19
            monitor-enter(r14)
            com.instagram.unifiedfilter.UnifiedFilterManager r0 = r14.A00     // Catch:{ all -> 0x0158 }
            r15 = r20
            if (r0 != 0) goto L_0x000f
            com.instagram.unifiedfilter.UnifiedFilterManager r0 = r15.CBT()     // Catch:{ all -> 0x0158 }
            r14.A00 = r0     // Catch:{ all -> 0x0158 }
        L_0x000f:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r14.A02     // Catch:{ all -> 0x0158 }
            android.util.SparseArray r13 = r0.A01     // Catch:{ all -> 0x0158 }
            int r5 = r13.size()     // Catch:{ all -> 0x0158 }
            r17 = 0
            r4 = 0
        L_0x001a:
            r12 = 1
            if (r4 >= r5) goto L_0x0041
            int r3 = r13.keyAt(r4)     // Catch:{ all -> 0x0158 }
            java.lang.Object r2 = r13.valueAt(r4)     // Catch:{ all -> 0x0158 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r2     // Catch:{ all -> 0x0158 }
            if (r2 == 0) goto L_0x003e
            boolean r0 = r2.isEnabled()     // Catch:{ all -> 0x0158 }
            if (r0 != 0) goto L_0x0030
            r12 = 0
        L_0x0030:
            com.instagram.unifiedfilter.UnifiedFilterManager r1 = r14.A00     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = r2.getFilterName()     // Catch:{ all -> 0x0158 }
            r1.setFilter(r3, r0)     // Catch:{ all -> 0x0158 }
            com.instagram.unifiedfilter.UnifiedFilterManager r0 = r14.A00     // Catch:{ all -> 0x0158 }
            r0.setFilterEnabled(r3, r12)     // Catch:{ all -> 0x0158 }
        L_0x003e:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0041:
            X.7v0 r0 = r21.getTexture()     // Catch:{ all -> 0x0158 }
            com.instagram.unifiedfilter.UnifiedFilterManager r4 = r14.A00     // Catch:{ all -> 0x0158 }
            int r3 = r21.getTextureId()     // Catch:{ all -> 0x0158 }
            int r2 = r0.A01     // Catch:{ all -> 0x0158 }
            int r1 = r21.getWidth()     // Catch:{ all -> 0x0158 }
            int r0 = r21.getHeight()     // Catch:{ all -> 0x0158 }
            boolean r0 = r4.setInputTexture(r3, r2, r1, r0)     // Catch:{ all -> 0x0158 }
            if (r0 != 0) goto L_0x0064
            java.lang.String r1 = "FilterGroup"
            java.lang.String r0 = "Load input texture failed"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0158 }
            goto L_0x0156
        L_0x0064:
            r2 = r22
            X.Lrb r2 = (X.C65336Lrb) r2     // Catch:{ all -> 0x0158 }
            com.instagram.unifiedfilter.UnifiedFilterManager r1 = r14.A00     // Catch:{ all -> 0x0158 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0158 }
            r1.setIsOnscreenRender(r0)     // Catch:{ all -> 0x0158 }
            X.VY1 r3 = new X.VY1     // Catch:{ all -> 0x0158 }
            r3.<init>()     // Catch:{ all -> 0x0158 }
            r2.CFQ(r3)     // Catch:{ all -> 0x0158 }
            int r2 = r3.A02     // Catch:{ all -> 0x0158 }
            int r1 = r3.A03     // Catch:{ all -> 0x0158 }
            int r0 = r3.A01     // Catch:{ all -> 0x0158 }
            int r5 = r3.A00     // Catch:{ all -> 0x0158 }
            int[] r4 = new int[]{r2, r1, r0, r5}     // Catch:{ all -> 0x0158 }
            com.instagram.unifiedfilter.UnifiedFilterManager r3 = r14.A00     // Catch:{ all -> 0x0158 }
            r2 = r4[r17]     // Catch:{ all -> 0x0158 }
            r1 = r4[r12]     // Catch:{ all -> 0x0158 }
            r0 = 2
            r0 = r4[r0]     // Catch:{ all -> 0x0158 }
            r3.setOutput(r2, r1, r0, r5)     // Catch:{ all -> 0x0158 }
            int r11 = r21.getWidth()     // Catch:{ all -> 0x0158 }
            int r10 = r21.getHeight()     // Catch:{ all -> 0x0158 }
            int r9 = r13.size()     // Catch:{ all -> 0x0158 }
            r8 = 0
        L_0x009c:
            if (r8 >= r9) goto L_0x0146
            int r7 = r13.keyAt(r8)     // Catch:{ all -> 0x0158 }
            r0 = 18
            boolean r1 = X.JTQ.A1O(r7, r0)
            java.lang.String r0 = "POSITION_FILTER_INTERMEDIATE is not supported in FU"
            X.17k.A0G(r1, r0)     // Catch:{ all -> 0x0158 }
            java.lang.Object r1 = r13.valueAt(r8)     // Catch:{ all -> 0x0158 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r1     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x0140
            boolean r0 = r1.isEnabled()     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x0140
            r0 = 22
            if (r7 == r0) goto L_0x00ca
            r0 = 26
            if (r7 == r0) goto L_0x00ca
            r14.A00(r1, r15, r7)     // Catch:{ all -> 0x0158 }
            r0 = 5
            if (r7 <= r0) goto L_0x0140
            goto L_0x00cf
        L_0x00ca:
            r0 = 17
            r14.A00(r1, r15, r0)     // Catch:{ all -> 0x0158 }
        L_0x00cf:
            int r2 = r21.getWidth()     // Catch:{ all -> 0x0158 }
            int r0 = r21.getHeight()     // Catch:{ all -> 0x0158 }
            int r6 = r22.getWidth()     // Catch:{ all -> 0x0158 }
            int r1 = r22.getHeight()     // Catch:{ all -> 0x0158 }
            r16 = 1
            boolean r2 = X.C51970G9q.A1W(r2, r0)
            boolean r0 = X.C51970G9q.A1W(r6, r1)
            if (r2 != r0) goto L_0x00ed
            r16 = 0
        L_0x00ed:
            r5 = 8
            java.lang.Object r0 = r13.get(r5)     // Catch:{ all -> 0x0144 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r0     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x00ff
            boolean r2 = r0.isEnabled()     // Catch:{ all -> 0x0158 }
            r0 = 8
            if (r2 != 0) goto L_0x0101
        L_0x00ff:
            r0 = 17
        L_0x0101:
            boolean r4 = r14.A01     // Catch:{ all -> 0x0158 }
            int[] r3 = r14.A04     // Catch:{ all -> 0x0158 }
            r18 = r1
            X.0qQ.A0B(r3, r5)     // Catch:{ all -> 0x0158 }
            if (r7 >= r0) goto L_0x0120
            if (r16 == 0) goto L_0x0111
            r18 = r6
            r6 = r1
        L_0x0111:
            float r2 = (float) r6     // Catch:{ all -> 0x0158 }
            r0 = r18
            float r0 = (float) r0     // Catch:{ all -> 0x0158 }
            float r2 = r2 / r0
            float r1 = (float) r11     // Catch:{ all -> 0x0158 }
            float r0 = (float) r10     // Catch:{ all -> 0x0158 }
            float r1 = r1 / r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0120
            if (r4 == 0) goto L_0x0120
            goto L_0x0123
        L_0x0120:
            r11 = r6
            r10 = r18
        L_0x0123:
            r3[r17] = r11     // Catch:{ all -> 0x0158 }
            r3[r12] = r10     // Catch:{ all -> 0x0158 }
            if (r7 == r5) goto L_0x013c
            r1 = r3[r17]     // Catch:{ all -> 0x0158 }
            int r0 = r22.getWidth()     // Catch:{ all -> 0x0158 }
            if (r1 != r0) goto L_0x0137
            int r0 = r22.getHeight()     // Catch:{ all -> 0x0158 }
            if (r10 == r0) goto L_0x013c
        L_0x0137:
            com.instagram.unifiedfilter.UnifiedFilterManager r0 = r14.A00     // Catch:{ all -> 0x0158 }
            r0.setFilterOutputSize(r7, r1, r10)     // Catch:{ all -> 0x0158 }
        L_0x013c:
            r11 = r3[r17]     // Catch:{ all -> 0x0158 }
            r10 = r3[r12]     // Catch:{ all -> 0x0158 }
        L_0x0140:
            int r8 = r8 + 1
            goto L_0x009c
        L_0x0144:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0146:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ all -> 0x0158 }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x0158 }
            com.instagram.unifiedfilter.UnifiedFilterManager r0 = r14.A00     // Catch:{ all -> 0x0158 }
            r0.render(r12)     // Catch:{ all -> 0x0158 }
        L_0x0156:
            monitor-exit(r14)
            return
        L_0x0158:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.filterkit.filter.FilterGroup.EEs(X.X98, X.8my, X.XBw):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    public FilterGroup(Parcel parcel) {
        Parcelable A032 = C41847B3o.A03(parcel, FilterChain.class);
        A032.getClass();
        this.A02 = (FilterChain) A032;
        Parcelable A033 = C41847B3o.A03(parcel, UnifiedFilterParamCallback.class);
        A033.getClass();
        this.A03 = (UnifiedFilterParamCallback) A033;
    }

    public FilterGroup(FilterChain filterChain, UnifiedFilterParamCallback unifiedFilterParamCallback) {
        this.A02 = filterChain;
        this.A03 = unifiedFilterParamCallback;
    }
}
