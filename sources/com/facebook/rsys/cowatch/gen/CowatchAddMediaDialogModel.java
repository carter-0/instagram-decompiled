package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51972G9s;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchAddMediaDialogModel {
    public final boolean amdLaunchedFromPromotion;
    public final int currentPageType;
    public final CowatchMediaTabModel fypTab;
    public final boolean hasEverBeenOpened;
    public final boolean isLoading;
    public final ArrayList logs;
    public final String requestedInitialTabId;
    public final CowatchMediaTabModel searchTab;
    public final long selectedTabIndex;
    public final ArrayList tabs;

    public static native CowatchAddMediaDialogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAddMediaDialogModel)) {
                return false;
            }
            CowatchAddMediaDialogModel cowatchAddMediaDialogModel = (CowatchAddMediaDialogModel) obj;
            if (this.hasEverBeenOpened != cowatchAddMediaDialogModel.hasEverBeenOpened || this.isLoading != cowatchAddMediaDialogModel.isLoading) {
                return false;
            }
            String str = this.requestedInitialTabId;
            String str2 = cowatchAddMediaDialogModel.requestedInitialTabId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.amdLaunchedFromPromotion != cowatchAddMediaDialogModel.amdLaunchedFromPromotion || this.selectedTabIndex != cowatchAddMediaDialogModel.selectedTabIndex) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel = this.searchTab;
            CowatchMediaTabModel cowatchMediaTabModel2 = cowatchAddMediaDialogModel.searchTab;
            if (cowatchMediaTabModel == null) {
                if (cowatchMediaTabModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaTabModel.equals(cowatchMediaTabModel2)) {
                return false;
            }
            if (!this.tabs.equals(cowatchAddMediaDialogModel.tabs)) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel3 = this.fypTab;
            CowatchMediaTabModel cowatchMediaTabModel4 = cowatchAddMediaDialogModel.fypTab;
            if (cowatchMediaTabModel3 == null) {
                if (cowatchMediaTabModel4 != null) {
                    return false;
                }
            } else if (!cowatchMediaTabModel3.equals(cowatchMediaTabModel4)) {
                return false;
            }
            if (this.currentPageType != cowatchAddMediaDialogModel.currentPageType || !this.logs.equals(cowatchAddMediaDialogModel.logs)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.selectedTabIndex;
        ArrayList arrayList = this.tabs;
        return AnonymousClass7TE.A0N(this.logs, (((AnonymousClass7TF.A07(arrayList, (C51972G9s.A07(j, (((((C66583MXo.A01(this.hasEverBeenOpened ? 1 : 0) + (this.isLoading ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.requestedInitialTabId)) * 31) + (this.amdLaunchedFromPromotion ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.searchTab)) * 31) + AnonymousClass7TE.A0L(this.fypTab)) * 31) + this.currentPageType) * 31);
    }

    public CowatchAddMediaDialogModel(boolean z, boolean z2, String str, boolean z3, long j, CowatchMediaTabModel cowatchMediaTabModel, ArrayList arrayList, CowatchMediaTabModel cowatchMediaTabModel2, int i, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.hasEverBeenOpened = z;
        this.isLoading = z2;
        this.requestedInitialTabId = str;
        this.amdLaunchedFromPromotion = z3;
        this.selectedTabIndex = j;
        this.searchTab = cowatchMediaTabModel;
        this.tabs = arrayList;
        this.fypTab = cowatchMediaTabModel2;
        this.currentPageType = i;
        this.logs = arrayList2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchAddMediaDialogModel{hasEverBeenOpened=");
        A1A.append(this.hasEverBeenOpened);
        A1A.append(",isLoading=");
        A1A.append(this.isLoading);
        A1A.append(",requestedInitialTabId=");
        A1A.append(this.requestedInitialTabId);
        A1A.append(",amdLaunchedFromPromotion=");
        A1A.append(this.amdLaunchedFromPromotion);
        A1A.append(",selectedTabIndex=");
        A1A.append(this.selectedTabIndex);
        A1A.append(",searchTab=");
        A1A.append(this.searchTab);
        A1A.append(",tabs=");
        A1A.append(this.tabs);
        A1A.append(",fypTab=");
        A1A.append(this.fypTab);
        A1A.append(",currentPageType=");
        A1A.append(this.currentPageType);
        A1A.append(",logs=");
        return C66582MXn.A0v(this.logs, A1A);
    }
}
