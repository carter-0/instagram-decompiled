package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.DbY;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LocalInjectionUnit implements Comparable {
    public final String filePath;
    public final InjectionUnitType injectionUnitType;
    public boolean isSelected;
    public final String unitId;
    public final String unitName;

    public enum InjectionUnitType {
        STORIES_ADS,
        STORIES_NETEGO,
        FEED_ADS,
        FEED_NETEGO,
        REELS_ADS,
        REELS_ORGANIC,
        THREADS_ADS;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            InjectionUnitType[] $values;
            $ENTRIES = 0oU.A00($values);
        }
    }

    public final class Item {
        public final String filename;
        public final String id;
        public final String name;

        public final String getFilename() {
            return this.filename;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public Item(String str, String str2, String str3) {
            AnonymousClass7TG.A1O(str, str2);
            this.name = str;
            this.filename = str2;
            this.id = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Item(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }

    public int compareTo(LocalInjectionUnit localInjectionUnit) {
        0qQ.A0B(localInjectionUnit, 0);
        int m = LocalInjectionUnit$$ExternalSyntheticBackport0.m(localInjectionUnit.isSelected, this.isSelected);
        if (m == 0) {
            return this.unitName.compareTo(localInjectionUnit.unitName);
        }
        return m;
    }

    public boolean equals(Object obj) {
        if (obj == null || !DbY.A1b(obj, this)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) obj;
        return 0qQ.A0K(localInjectionUnit.unitId, this.unitId) && 0qQ.A0K(localInjectionUnit.filePath, this.filePath) && 0qQ.A0K(localInjectionUnit.unitName, this.unitName) && localInjectionUnit.injectionUnitType == this.injectionUnitType;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getUnitId() {
        return this.unitId;
    }

    public final String getUnitName() {
        return this.unitName;
    }

    public int hashCode() {
        return this.unitId.hashCode() * this.filePath.hashCode() * this.unitName.hashCode() * this.injectionUnitType.hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return this.unitName;
    }

    public LocalInjectionUnit(String str, String str2, String str3, InjectionUnitType injectionUnitType2) {
        C51974G9v.A1P(str, str2, str3, injectionUnitType2);
        this.unitId = str;
        this.filePath = str2;
        this.unitName = str3;
        this.injectionUnitType = injectionUnitType2;
    }
}
