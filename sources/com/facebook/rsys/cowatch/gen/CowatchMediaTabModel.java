package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchMediaTabModel {
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final boolean needsFetchingNextPage;
    public final String query;
    public final CowatchComponentCollectionModel secondaryComponent;
    public final int source;
    public final ArrayList tabSections;
    public final String title;

    public static native CowatchMediaTabModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaTabModel)) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel = (CowatchMediaTabModel) obj;
            String str = this.title;
            String str2 = cowatchMediaTabModel.title;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.tabSections.equals(cowatchMediaTabModel.tabSections)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = this.secondaryComponent;
            CowatchComponentCollectionModel cowatchComponentCollectionModel2 = cowatchMediaTabModel.secondaryComponent;
            if (cowatchComponentCollectionModel == null) {
                if (cowatchComponentCollectionModel2 != null) {
                    return false;
                }
            } else if (!cowatchComponentCollectionModel.equals(cowatchComponentCollectionModel2)) {
                return false;
            }
            if (!this.query.equals(cowatchMediaTabModel.query) || this.source != cowatchMediaTabModel.source) {
                return false;
            }
            String str3 = this.logInfo;
            String str4 = cowatchMediaTabModel.logInfo;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.hasPerformedFirstFetch == cowatchMediaTabModel.hasPerformedFirstFetch && this.hasNextPage == cowatchMediaTabModel.hasNextPage && this.isUpdating == cowatchMediaTabModel.isUpdating && this.needsFetchingNextPage == cowatchMediaTabModel.needsFetchingNextPage)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int A01 = C66583MXo.A01(AnonymousClass7TG.A0E(this.title));
        return ((((((((((AnonymousClass7TF.A08(this.query, (AnonymousClass7TF.A07(this.tabSections, A01) + AnonymousClass7TG.A0C(this.secondaryComponent)) * 31) + this.source) * 31) + C41845B3m.A00(this.logInfo)) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + (this.needsFetchingNextPage ? 1 : 0);
    }

    public CowatchMediaTabModel(String str, ArrayList arrayList, CowatchComponentCollectionModel cowatchComponentCollectionModel, String str2, int i, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        arrayList.getClass();
        str2.getClass();
        this.title = str;
        this.tabSections = arrayList;
        this.secondaryComponent = cowatchComponentCollectionModel;
        this.query = str2;
        this.source = i;
        this.logInfo = str3;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.needsFetchingNextPage = z4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchMediaTabModel{title=");
        A1A.append(this.title);
        A1A.append(",tabSections=");
        A1A.append(this.tabSections);
        A1A.append(",secondaryComponent=");
        A1A.append(this.secondaryComponent);
        A1A.append(",query=");
        A1A.append(this.query);
        A1A.append(",source=");
        A1A.append(this.source);
        A1A.append(",logInfo=");
        A1A.append(this.logInfo);
        A1A.append(",hasPerformedFirstFetch=");
        A1A.append(this.hasPerformedFirstFetch);
        A1A.append(",hasNextPage=");
        A1A.append(this.hasNextPage);
        A1A.append(",isUpdating=");
        A1A.append(this.isUpdating);
        A1A.append(",needsFetchingNextPage=");
        return C66584MXp.A0b(A1A, this.needsFetchingNextPage);
    }
}
