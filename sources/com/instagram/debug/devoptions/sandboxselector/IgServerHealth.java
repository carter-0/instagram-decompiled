package com.instagram.debug.devoptions.sandboxselector;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class IgServerHealth {
    public final String healthStatusString;

    public final class CheckingHealth extends IgServerHealth {
        public static final CheckingHealth INSTANCE = new CheckingHealth();

        public CheckingHealth() {
            super("CHECKING_HEALTH");
        }
    }

    public final class Healthy extends IgServerHealth {
        public static final Healthy INSTANCE = new Healthy();

        public Healthy() {
            super("HEALTHY");
        }
    }

    public final class Unhealthy extends IgServerHealth {
        public final UnhealthyReason errorStatus;

        public enum UnhealthyReason {
            BAD_GATEWAY,
            TIMED_OUT,
            DJANGO_UNHEALTHY,
            UNKNOWN;
            
            public static final Companion Companion = null;

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public final class Companion {
                public Companion() {
                }

                public final UnhealthyReason fromHttpStatusCode(int i) {
                    switch (i) {
                        case 502:
                            return UnhealthyReason.BAD_GATEWAY;
                        case 503:
                            return UnhealthyReason.TIMED_OUT;
                        case 504:
                            return UnhealthyReason.DJANGO_UNHEALTHY;
                        default:
                            return UnhealthyReason.UNKNOWN;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }
            }

            /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason$Companion] */
            /* access modifiers changed from: public */
            static {
                UnhealthyReason[] $values;
                $ENTRIES = 0oU.A00($values);
                Companion = new Object();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unhealthy(UnhealthyReason unhealthyReason) {
            super("UNHEALTHY");
            0qQ.A0B(unhealthyReason, 1);
            this.errorStatus = unhealthyReason;
        }

        public final UnhealthyReason component1() {
            return this.errorStatus;
        }

        public final Unhealthy copy(UnhealthyReason unhealthyReason) {
            0qQ.A0B(unhealthyReason, 0);
            return new Unhealthy(unhealthyReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unhealthy) && this.errorStatus == ((Unhealthy) obj).errorStatus);
        }

        public int hashCode() {
            return this.errorStatus.hashCode();
        }

        public static /* synthetic */ Unhealthy copy$default(Unhealthy unhealthy, UnhealthyReason unhealthyReason, int i, Object obj) {
            if ((i & 1) != 0) {
                unhealthyReason = unhealthy.errorStatus;
            }
            0qQ.A0B(unhealthyReason, 0);
            return new Unhealthy(unhealthyReason);
        }

        public final UnhealthyReason getErrorStatus() {
            return this.errorStatus;
        }

        public String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Unhealthy(errorStatus=");
            return AnonymousClass7TG.A0n(this.errorStatus, A1A);
        }
    }

    public /* synthetic */ IgServerHealth(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getHealthStatusString() {
        return this.healthStatusString;
    }

    public IgServerHealth(String str) {
        this.healthStatusString = str;
    }
}
