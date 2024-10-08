package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;

/* renamed from: X.Lkg  reason: case insensitive filesystem */
public final class C64941Lkg implements C66534MVo, X96 {
    public Integer A00;
    public Integer A01;
    public final L96 A02 = new Object();
    public final List A03 = AnonymousClass7TE.A1C();
    public final UserSession A04;
    public final U02 A05;
    public final String A06;

    public final View AZq(Context context) {
        0qQ.A0B(context, 0);
        RadioGroup radioGroup = new RadioGroup(context);
        radioGroup.setBackgroundResource(2Yu.A0C(context));
        radioGroup.setOrientation(0);
        radioGroup.setGravity(17);
        radioGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        List list = this.A03;
        list.clear();
        Integer[] A002 = AnonymousClass05K.A00(3);
        int length = A002.length;
        int i = 0;
        while (i < length) {
            Integer num = A002[i];
            0qQ.A0B(num, 0);
            C62586KiJ[] values = C62586KiJ.values();
            int length2 = values.length;
            int i2 = 0;
            while (i2 < length2) {
                C62586KiJ kiJ = values[i2];
                if (kiJ.A00 == AE9.A00(num)) {
                    String A0d = AnonymousClass7TF.A0d(context.getResources(), kiJ.A01);
                    int A003 = AE9.A00(num);
                    C64944Lkj lkj = new C64944Lkj((C66534MVo) null, A0d, A003, kiJ.A02);
                    C60060Jeb jeb = new C60060Jeb(context);
                    jeb.setContentDescription(A0d);
                    jeb.setConfig(C62592KiP.TOOL);
                    jeb.A03(lkj, true);
                    jeb.setPadding(0, 0, 0, 0);
                    AnonymousClass0fU.A00(LYG.A01(this, jeb, 41), jeb);
                    list.add(jeb);
                    radioGroup.addView(jeb, layoutParams);
                    if (AE9.A00(this.A01) == A003) {
                        jeb.setChecked(true);
                    }
                    i++;
                } else {
                    i2++;
                }
            }
            throw new IndexOutOfBoundsException();
        }
        return radioGroup;
    }

    public final boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        Integer num;
        AnonymousClass7TF.A1H(jeb, filterGroupModel);
        TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterGroupModel.B5u(19);
        if (tiltShiftFilter != null) {
            num = tiltShiftFilter.A05;
        } else {
            num = null;
        }
        jeb.setChecked(C51969G9p.A1a(num, AnonymousClass05K.A00));
        return false;
    }

    public final boolean Dij(View view, ViewGroup viewGroup, C353998Kg r7, FilterGroupModel filterGroupModel) {
        0qQ.A0B(view, 0);
        DbZ.A0t(1, viewGroup, filterGroupModel, r7);
        L96 l96 = this.A02;
        l96.A00 = view;
        l96.A04 = filterGroupModel;
        l96.A03 = r7;
        l96.A01 = viewGroup;
        LGM lgm = new LGM(filterGroupModel);
        l96.A02 = lgm;
        this.A05.A02 = this;
        TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterGroupModel.B5u(19);
        if (tiltShiftFilter != null) {
            Integer num = tiltShiftFilter.A05;
            this.A01 = num;
            if (num != AnonymousClass05K.A00) {
                lgm.A02(r7);
            }
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DsP(boolean z) {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    private final void A00(float f, float f2) {
        PointF pointF;
        PointF pointF2;
        L96 l96 = this.A02;
        ViewGroup viewGroup = l96.A01;
        if (viewGroup != null) {
            float A022 = f / AnonymousClass7TE.A02(viewGroup);
            ViewGroup viewGroup2 = l96.A01;
            if (viewGroup2 != null) {
                float f3 = f2 / (-AnonymousClass7TE.A03(viewGroup2));
                FilterGroupModel filterGroupModel = l96.A04;
                if (filterGroupModel != null) {
                    TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterGroupModel.B5u(19);
                    if (tiltShiftFilter != null) {
                        int intValue = tiltShiftFilter.A05.intValue();
                        if (intValue == 1) {
                            pointF2 = tiltShiftFilter.A04;
                        } else if (intValue == 2) {
                            pointF2 = tiltShiftFilter.A03;
                        }
                        tiltShiftFilter.A00(pointF2.x + A022, pointF2.y + f3);
                    }
                    FilterGroupModel filterGroupModel2 = l96.A04;
                    if (filterGroupModel2 != null) {
                        TiltShiftOverlayFilter A002 = C64002LIe.A00(filterGroupModel2);
                        int intValue2 = A002.A06.intValue();
                        if (intValue2 == 1) {
                            pointF = A002.A05;
                        } else if (intValue2 == 2) {
                            pointF = A002.A04;
                        } else {
                            return;
                        }
                        A002.A00(pointF.x + A022, pointF.y + f3);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void CuZ(boolean z) {
        int i;
        Integer num = this.A00;
        if (z) {
            this.A01 = num;
        } else {
            Integer num2 = this.A01;
            if (num != num2) {
                this.A00 = num2;
                FilterGroupModel filterGroupModel = this.A02.A04;
                if (filterGroupModel != null) {
                    C64002LIe.A01(filterGroupModel, num2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        L96 l96 = this.A02;
        View view = l96.A00;
        if (view != null) {
            if (view instanceof C60060Jeb) {
                0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame");
                ((C60060Jeb) view).setChecked(C51969G9p.A1a(this.A01, AnonymousClass05K.A00));
            } else if (view instanceof ImageView) {
                0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) view;
                Integer num3 = this.A01;
                AnonymousClass7TG.A1N(imageView, num3);
                if (num3 == AnonymousClass05K.A00) {
                    i = R.drawable.edit_glyph_dof;
                } else {
                    Integer num4 = AnonymousClass05K.A0C;
                    i = R.drawable.edit_glyph_dof_radial;
                    if (num3 == num4) {
                        i = R.drawable.edit_glyph_dof_linear;
                    }
                }
                imageView.setImageResource(i);
            }
            this.A05.A02();
            l96.A00 = null;
            l96.A04 = null;
            l96.A03 = null;
            l96.A01 = null;
            l96.A02 = null;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DHm(float f, float f2) {
        if (this.A00 != AnonymousClass05K.A00) {
            L96 l96 = this.A02;
            LGM lgm = l96.A02;
            if (lgm != null) {
                C353998Kg r0 = l96.A03;
                if (r0 != null) {
                    lgm.A03(r0);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DHq() {
        if (this.A00 != AnonymousClass05K.A00) {
            L96 l96 = this.A02;
            FilterGroupModel filterGroupModel = l96.A04;
            if (filterGroupModel != null) {
                JTT.A1M(filterGroupModel);
                LGM lgm = l96.A02;
                if (lgm != null) {
                    C353998Kg r0 = l96.A03;
                    if (r0 != null) {
                        lgm.A01(r0);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DSf(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A00 != AnonymousClass05K.A00) {
            if (!(f3 == 0.0f && f4 == 0.0f)) {
                A00(f3, f4);
            }
            if (f5 != 0.0f) {
                L96 l96 = this.A02;
                FilterGroupModel filterGroupModel = l96.A04;
                if (filterGroupModel != null) {
                    TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterGroupModel.B5u(19);
                    if (tiltShiftFilter != null) {
                        int intValue = tiltShiftFilter.A05.intValue();
                        if (intValue == 1) {
                            tiltShiftFilter.A00 = C229632nm.A02(tiltShiftFilter.A00 * f5, 0.1f, 1.0f);
                        } else if (intValue == 2) {
                            tiltShiftFilter.A02 = C229632nm.A02(tiltShiftFilter.A02 * f5, 0.1f, 1.0f);
                        }
                    }
                    FilterGroupModel filterGroupModel2 = l96.A04;
                    if (filterGroupModel2 != null) {
                        TiltShiftOverlayFilter A002 = C64002LIe.A00(filterGroupModel2);
                        int intValue2 = A002.A06.intValue();
                        if (intValue2 == 1) {
                            A002.A01 = C229632nm.A02(f5 * A002.A01, 0.1f, 1.0f);
                        } else if (intValue2 == 2) {
                            A002.A03 = C229632nm.A02(f5 * A002.A03, 0.1f, 1.0f);
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (f6 != 0.0f && this.A00 == AnonymousClass05K.A0C) {
                L96 l962 = this.A02;
                FilterGroupModel filterGroupModel3 = l962.A04;
                if (filterGroupModel3 != null) {
                    TiltShiftFilter tiltShiftFilter2 = (TiltShiftFilter) filterGroupModel3.B5u(19);
                    if (tiltShiftFilter2 != null) {
                        tiltShiftFilter2.A01 += f6;
                    }
                    FilterGroupModel filterGroupModel4 = l962.A04;
                    if (filterGroupModel4 != null) {
                        C64002LIe.A00(filterGroupModel4).A02 += f6;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            C353998Kg r0 = this.A02.A03;
            if (r0 != null) {
                r0.EEp();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Dl2(float f, float f2) {
        if (this.A00 != AnonymousClass05K.A00) {
            L96 l96 = this.A02;
            ViewGroup viewGroup = l96.A01;
            if (viewGroup != null) {
                float A022 = f / AnonymousClass7TE.A02(viewGroup);
                ViewGroup viewGroup2 = l96.A01;
                if (viewGroup2 != null) {
                    float A032 = AnonymousClass7TE.A03(viewGroup2) - f2;
                    ViewGroup viewGroup3 = l96.A01;
                    if (viewGroup3 != null) {
                        float A002 = JTP.A00(A032, viewGroup3);
                        FilterGroupModel filterGroupModel = l96.A04;
                        if (filterGroupModel != null) {
                            TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterGroupModel.B5u(19);
                            if (tiltShiftFilter != null) {
                                tiltShiftFilter.A00(A022, A002);
                            }
                            FilterGroupModel filterGroupModel2 = l96.A04;
                            if (filterGroupModel2 != null) {
                                C64002LIe.A00(filterGroupModel2).A00(A022, A002);
                                LGM lgm = l96.A02;
                                if (lgm != null) {
                                    C353998Kg r0 = l96.A03;
                                    if (r0 != null) {
                                        lgm.A02(r0);
                                        return;
                                    }
                                    throw AnonymousClass7TE.A0y();
                                }
                                throw AnonymousClass7TE.A0y();
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DlH(float f, float f2, float f3, float f4) {
        if (this.A00 != AnonymousClass05K.A00) {
            if (!(f3 == 0.0f && f4 == 0.0f)) {
                A00(f3, f4);
            }
            C353998Kg r0 = this.A02.A03;
            if (r0 != null) {
                r0.EEp();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final String getTitle() {
        return this.A06;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.L96] */
    public C64941Lkg(Resources resources, UserSession userSession) {
        this.A04 = userSession;
        Integer num = AnonymousClass05K.A00;
        this.A01 = num;
        this.A00 = num;
        this.A06 = resources.getString(2131975381);
        this.A05 = new U02();
    }

    public final boolean CIj(View view, MotionEvent motionEvent) {
        AnonymousClass7TG.A1N(view, motionEvent);
        return this.A05.onTouch(view, motionEvent);
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }
}
