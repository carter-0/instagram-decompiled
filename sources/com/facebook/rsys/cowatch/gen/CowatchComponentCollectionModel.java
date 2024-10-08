package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchComponentCollectionModel {
    public final ArrayList childrenComponentList;
    public final int componentCollectionType;
    public final String componentDescription;
    public final String componentId;
    public final String componentSubtitle;
    public final String componentTitle;
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final ArrayList mediaList;
    public final boolean needsFetchingNextPage;
    public final String parentComponentId;
    public final String renderingStyles;

    public static native CowatchComponentCollectionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchComponentCollectionModel)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = (CowatchComponentCollectionModel) obj;
            if (!this.componentId.equals(cowatchComponentCollectionModel.componentId) || !this.parentComponentId.equals(cowatchComponentCollectionModel.parentComponentId)) {
                return false;
            }
            String str = this.componentTitle;
            String str2 = cowatchComponentCollectionModel.componentTitle;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.componentSubtitle;
            String str4 = cowatchComponentCollectionModel.componentSubtitle;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.componentDescription;
            String str6 = cowatchComponentCollectionModel.componentDescription;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.mediaList.equals(cowatchComponentCollectionModel.mediaList) || !this.childrenComponentList.equals(cowatchComponentCollectionModel.childrenComponentList) || this.componentCollectionType != cowatchComponentCollectionModel.componentCollectionType || this.hasPerformedFirstFetch != cowatchComponentCollectionModel.hasPerformedFirstFetch || this.hasNextPage != cowatchComponentCollectionModel.hasNextPage || this.isUpdating != cowatchComponentCollectionModel.isUpdating) {
                return false;
            }
            String str7 = this.logInfo;
            String str8 = cowatchComponentCollectionModel.logInfo;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (this.needsFetchingNextPage != cowatchComponentCollectionModel.needsFetchingNextPage) {
                return false;
            }
            String str9 = this.renderingStyles;
            String str10 = cowatchComponentCollectionModel.renderingStyles;
            if (str9 != null) {
                return str9.equals(str10);
            }
            if (str10 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int A06 = C66583MXo.A06(this.componentId);
        return ((((((((((((AnonymousClass7TF.A07(this.childrenComponentList, AnonymousClass7TF.A07(this.mediaList, (((((AnonymousClass7TF.A08(this.parentComponentId, A06) + AnonymousClass7TG.A0E(this.componentTitle)) * 31) + AnonymousClass7TG.A0E(this.componentSubtitle)) * 31) + AnonymousClass7TG.A0E(this.componentDescription)) * 31)) + this.componentCollectionType) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.logInfo)) * 31) + (this.needsFetchingNextPage ? 1 : 0)) * 31) + C41845B3m.A00(this.renderingStyles);
    }

    public CowatchComponentCollectionModel(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, int i, boolean z, boolean z2, boolean z3, String str6, boolean z4, String str7) {
        C66581MXm.A1R(str, str2, arrayList);
        arrayList2.getClass();
        this.componentId = str;
        this.parentComponentId = str2;
        this.componentTitle = str3;
        this.componentSubtitle = str4;
        this.componentDescription = str5;
        this.mediaList = arrayList;
        this.childrenComponentList = arrayList2;
        this.componentCollectionType = i;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.logInfo = str6;
        this.needsFetchingNextPage = z4;
        this.renderingStyles = str7;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchComponentCollectionModel{componentId=");
        A1A.append(this.componentId);
        A1A.append(",parentComponentId=");
        A1A.append(this.parentComponentId);
        A1A.append(",componentTitle=");
        A1A.append(this.componentTitle);
        A1A.append(",componentSubtitle=");
        A1A.append(this.componentSubtitle);
        A1A.append(",componentDescription=");
        A1A.append(this.componentDescription);
        A1A.append(",mediaList=");
        A1A.append(this.mediaList);
        A1A.append(",childrenComponentList=");
        A1A.append(this.childrenComponentList);
        A1A.append(",componentCollectionType=");
        A1A.append(this.componentCollectionType);
        A1A.append(",hasPerformedFirstFetch=");
        A1A.append(this.hasPerformedFirstFetch);
        A1A.append(",hasNextPage=");
        A1A.append(this.hasNextPage);
        A1A.append(",isUpdating=");
        A1A.append(this.isUpdating);
        A1A.append(",logInfo=");
        A1A.append(this.logInfo);
        A1A.append(",needsFetchingNextPage=");
        A1A.append(this.needsFetchingNextPage);
        A1A.append(",renderingStyles=");
        return C66584MXp.A0a(this.renderingStyles, A1A);
    }
}
