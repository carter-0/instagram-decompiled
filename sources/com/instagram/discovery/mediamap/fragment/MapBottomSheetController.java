package com.instagram.discovery.mediamap.fragment;

import X.0nA;
import X.2Yu;
import X.2db;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13989Tnp;
import X.C14664U0k;
import X.C15293UZz;
import X.C18780W1f;
import X.C20901X3s;
import X.C20906X3x;
import X.C20996X8t;
import X.C252233om;
import X.C51975G9x;
import X.DbU;
import X.DbV;
import X.JTP;
import X.VBZ;
import X.VS5;
import X.X97;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.instagram.android.R;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import org.webrtc.CameraVideoCapturer;

public class MapBottomSheetController extends C252233om implements X97, C20906X3x {
    public int A00;
    public Guideline A01;
    public float A02;
    public final float A03;
    public final Activity A04;
    public final Set A05 = Collections.newSetFromMap(new WeakHashMap());
    public final int A06;
    public final C18780W1f A07;
    public View mBottomSheet;
    public MapBottomSheetBehavior mBottomSheetBehavior;
    public View mContainer;

    public final void DhJ(MapBottomSheetBehavior mapBottomSheetBehavior, float f, float f2, float f3) {
        for (C20996X8t Cyp : this.A05) {
            Cyp.Cyp(this, f, (float) this.mBottomSheetBehavior.A0F.A01, f2, f3);
        }
    }

    public final float A00() {
        float height = ((float) this.mContainer.getHeight()) - ((float) this.A00);
        return (height - this.A03) / height;
    }

    public final float A01() {
        if (this.mContainer == null || this.mBottomSheet == null) {
            return 0.0f;
        }
        C15293UZz A032 = this.A07.A03();
        int i = this.A06;
        if (A032 instanceof LocationDetailFragment) {
            LocationDetailFragment locationDetailFragment = (LocationDetailFragment) A032;
            VS5 vs5 = locationDetailFragment.mLocationDetailRedesignExperimentHelper;
            if (vs5 == null) {
                i = 0;
            } else {
                int height = vs5.A01.getHeight();
                Resources A052 = DbV.A05(locationDetailFragment);
                i = height + A052.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + A052.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            }
        }
        return JTP.A00((float) (this.A00 + i), this.mContainer);
    }

    public final float A02() {
        C15293UZz A032 = this.A07.A03();
        if (A032 instanceof C20901X3s) {
            return ((C20901X3s) A032).BbN();
        }
        return 0.0f;
    }

    public final boolean A03() {
        return AnonymousClass7TF.A1Q((((float) this.mBottomSheetBehavior.A0F.A01) > A00() ? 1 : (((float) this.mBottomSheetBehavior.A0F.A01) == A00() ? 0 : -1)));
    }

    public final void Cxy() {
        for (C20996X8t Cyk : this.A05) {
            Cyk.Cyk(this);
        }
    }

    public final void Cyl() {
        for (C20996X8t Cym : this.A05) {
            Cym.Cym(this);
        }
    }

    public final void DCD() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void DhQ(MapBottomSheetBehavior mapBottomSheetBehavior, float f) {
        for (C20996X8t Cyq : this.A05) {
            Cyq.Cyq(this, f);
        }
    }

    public final void Dja() {
        for (C20996X8t Cyr : this.A05) {
            Cyr.Cyr(this);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Activity activity = this.A04;
        Resources resources = activity.getResources();
        this.mContainer = view;
        View requireViewById = view.requireViewById(R.id.bottom_sheet);
        this.mBottomSheet = requireViewById;
        this.mBottomSheetBehavior = VBZ.A00(requireViewById);
        this.A01 = this.mContainer.requireViewById(R.id.status_bar_adjustment_guideline);
        MapBottomSheetBehavior mapBottomSheetBehavior = this.mBottomSheetBehavior;
        mapBottomSheetBehavior.A03 = this;
        mapBottomSheetBehavior.A02 = this;
        ImageView A0F = DbU.A0F(this.mBottomSheet, R.id.shadow);
        int A0G = 2Yu.A0G(activity, R.attr.bottomSheetTopCornerRadius);
        int A0B = AnonymousClass7TE.A0B(resources);
        float[] fArr = new float[8];
        float f = (float) A0G;
        fArr[0] = f;
        C13989Tnp.A1U(fArr, f);
        fArr[4] = 0.0f;
        C51975G9x.A1L(fArr, 0.0f);
        A0F.setImageDrawable(new C14664U0k(new RoundRectShape(fArr, (RectF) null, (float[]) null), (float) A0B, Color.argb(Math.round(63.75f), 0, 0, 0), A0B));
        int A012 = 2db.A01(activity) - A0B;
        this.A00 = A012;
        this.A01.setGuidelineBegin(A012);
    }

    public MapBottomSheetController(Activity activity, C18780W1f w1f) {
        this.A04 = activity;
        this.A07 = w1f;
        this.A02 = 0nA.A04(activity, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
        Resources resources = activity.getResources();
        this.A06 = 2Yu.A0G(activity, R.attr.actionBarHeight) + resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A03 = 0nA.A04(activity, 140);
    }

    public final float AP4(float f, float f2, float f3) {
        float A022 = A02();
        if (f3 > 0.0f) {
            if ((f != A00() && (f <= A00() || f3 >= this.A02)) || f2 <= A022) {
                return A01();
            }
        } else if (f3 < 0.0f && (((double) f2) > 0.5d || Math.abs(f3) >= this.A02)) {
            return 1.0f;
        } else {
            if (f3 >= 0.0f) {
                if (f2 > A022) {
                    return 1.0f;
                }
                return A022;
            }
        }
        return A02();
    }

    public final void onDestroyView() {
        MapBottomSheetControllerLifecycleUtil.cleanupReferences(this);
    }
}
