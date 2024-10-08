package com.instagram.creation.capture.quickcapture.cameratoolmenu;

import X.00k;
import X.0nA;
import X.0qQ;
import X.0sl;
import X.A68;
import X.AnonymousClass3NG;
import X.AnonymousClass8E8;
import X.AnonymousClass8EF;
import X.AnonymousClass8EM;
import X.AnonymousClass8EP;
import X.AnonymousClass8EZ;
import X.AnonymousClass8HE;
import X.C3494680m;
import X.C3497981v;
import X.C357638Yz;
import X.C358088aL;
import X.C386339kR;
import X.C39637A3b;
import X.C40038AOu;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CameraPreCaptureUtilityMenu extends IgFrameLayout implements AnonymousClass8EM {
    public UserSession A00;
    public AnonymousClass8E8 A01;
    public AnonymousClass8HE A02;
    public AnonymousClass8EP A03;
    public Set A04;
    public ImageView A05;
    public final FrameLayout A06;
    public final A68 A07;
    public final LinkedHashMap A08;
    public final Set A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraPreCaptureUtilityMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final int BlJ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        return iArr[0] - iArr2[1];
    }

    public final float Bqg(CameraToolMenuItem cameraToolMenuItem) {
        int[] iArr = new int[2];
        cameraToolMenuItem.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        return (float) (iArr[1] - iArr2[1]);
    }

    public final void Di6() {
    }

    public View getCameraToolMenuShadow() {
        return null;
    }

    public final void setUtilityMenuCameraTools(Set set) {
        0qQ.A0B(set, 0);
        this.A04 = set;
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.A06.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        LinkedHashMap linkedHashMap = this.A08;
        linkedHashMap.clear();
        this.A04 = set;
        Iterator it = set.iterator();
        int i = 1;
        while (it.hasNext()) {
            C358088aL r7 = (C358088aL) it.next();
            Object obj = linkedHashMap.get(r7);
            CameraToolMenuItem cameraToolMenuItem = obj;
            if (obj == null) {
                AnonymousClass8EZ A022 = AnonymousClass8EF.A00.A02(this.A00, r7);
                if (A022 == null) {
                    cameraToolMenuItem = null;
                } else {
                    Context context2 = frameLayout.getContext();
                    0qQ.A07(context2);
                    Resources resources = getResources();
                    CameraToolMenuItem cameraToolMenuItem2 = new CameraToolMenuItem(context2, (AttributeSet) null, 0, Float.valueOf((float) resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width)));
                    cameraToolMenuItem2.setCameraToolResources(A022);
                    cameraToolMenuItem2.setCircularBackground(context.getColor(R.color.button_background_color));
                    cameraToolMenuItem2.setIconPaddingForUtilityToolBarItem(resources.getDimensionPixelSize(R.dimen.abc_control_corner_material));
                    frameLayout.addView(cameraToolMenuItem2);
                    0nA.A0d(cameraToolMenuItem2, (resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width)) * i);
                    AnonymousClass3NG r1 = new AnonymousClass3NG(cameraToolMenuItem2);
                    r1.A04 = new C386339kR(r7, this, cameraToolMenuItem2);
                    r1.A00();
                    cameraToolMenuItem = cameraToolMenuItem2;
                }
            }
            i++;
            linkedHashMap.put(r7, cameraToolMenuItem);
            AnonymousClass8EP r0 = this.A03;
            if (r0 != null) {
                r0.A01(r7);
            }
        }
    }

    public final void setUtilityMenuDelegateListener(AnonymousClass8HE r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    public final int Bro(C358088aL r2) {
        AnonymousClass8E8 r0 = this.A01;
        if (r0 != null) {
            return r0.A03.A04(r2);
        }
        return 0;
    }

    public final C39637A3b Brs(C358088aL r2) {
        AnonymousClass8E8 r0 = this.A01;
        if (r0 != null) {
            return (C39637A3b) C357638Yz.A01(r2, r0.A03).A00;
        }
        return null;
    }

    public final void Di7(C358088aL r2, int i) {
        AnonymousClass8E8 r0 = this.A01;
        if (r0 != null) {
            r0.A03.A0N(r2, i);
        }
    }

    public final void Di8(C358088aL r3, int i) {
        AnonymousClass8E8 r0 = this.A01;
        if (r0 != null) {
            C3494680m A012 = C357638Yz.A01(r3, r0.A03);
            C39637A3b a3b = (C39637A3b) A012.A00;
            a3b.A00 = i;
            A012.A03(a3b);
        }
    }

    public final void EBG() {
        Object A0A;
        CameraToolMenuItem cameraToolMenuItem;
        AnonymousClass8EP r0;
        Set set = this.A09;
        if ((!set.isEmpty()) && (A0A = 00k.A0A(set)) != null && (cameraToolMenuItem = (CameraToolMenuItem) this.A08.getOrDefault(A0A, (Object) null)) != null && (r0 = this.A03) != null) {
            r0.A02(cameraToolMenuItem, 0.5d, 1.0f, 1.0f);
        }
    }

    public final C3497981v getCameraFlashButton() {
        C3497981v r2 = new C3497981v(this.A05);
        A68 a68 = this.A07;
        0qQ.A0B(a68, 0);
        r2.A00 = a68;
        return r2;
    }

    public LinkedHashMap getCameraToolMenuItemMap() {
        return this.A08;
    }

    public Set getSelectedCameraTools() {
        return this.A09;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraPreCaptureUtilityMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A04 = 0sl.A00;
        this.A08 = new LinkedHashMap();
        this.A09 = new HashSet();
        LayoutInflater.from(context).inflate(R.layout.layout_camera_pre_capture_utility_menu, this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.camera_pre_capture_utility_menu);
        this.A06 = frameLayout;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.camera_utility_tool_flash_button);
        this.A05 = imageView;
        this.A07 = new A68(imageView, this);
        frameLayout.setVisibility(0);
        setOnTouchListener(new C40038AOu(this));
        this.A06.setVisibility(4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraPreCaptureUtilityMenu(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraPreCaptureUtilityMenu(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
