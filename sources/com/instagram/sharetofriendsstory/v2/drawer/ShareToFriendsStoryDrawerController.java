package com.instagram.sharetofriendsstory.v2.drawer;

import X.0eO;
import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass89Y;
import X.AnonymousClass9M1;
import X.C19140WMw;
import X.C227242it;
import X.C252063oV;
import X.C252243on;
import X.C314446iH;
import X.C3495780x;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class ShareToFriendsStoryDrawerController implements C252243on, C227242it, AnonymousClass89Y {
    public final UserSession A00;
    public final C314446iH A01;
    public final C3495780x A02;
    public final AnonymousClass0eM A03;
    public C252063oV drawerContainerViewStubber;
    public View postCaptureVideoContainer;

    public ShareToFriendsStoryDrawerController(View view, Fragment fragment, UserSession userSession, C252063oV r7, C314446iH r8, C3495780x r9) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r9, 4);
        0qQ.A0B(fragment, 6);
        this.A00 = userSession;
        this.drawerContainerViewStubber = r7;
        this.postCaptureVideoContainer = view;
        this.A02 = r9;
        this.A01 = r8;
        this.A03 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9M1(23, fragment, this));
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void DAU() {
    }

    public final /* synthetic */ void DAW() {
    }

    public final /* synthetic */ void DAt() {
    }

    public final /* synthetic */ void DAu() {
    }

    public final void DAw(C19140WMw wMw, float f, float f2, float f3) {
    }

    public final /* synthetic */ void Dfn() {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final /* synthetic */ boolean ABA() {
        return true;
    }

    public final /* synthetic */ boolean CV1() {
        return false;
    }

    public final /* synthetic */ boolean Es5() {
        return false;
    }

    public final /* synthetic */ boolean Esq() {
        return true;
    }

    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }

    public final /* synthetic */ boolean Dkv(MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean EsU(MotionEvent motionEvent) {
        return false;
    }
}
