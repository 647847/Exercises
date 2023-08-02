
class CallRating {
    String callId;
    int callDuration;
    double callQuality;
    String ratingCategory;
    int c= 1;
    public CallRating(int callDuration, double callQuality) {
        this.callId = generateCallId();
        this.callDuration = callDuration;
        this.callQuality = callQuality;
        this.ratingCategory = calculateRatingCategory();
    }
    String generateCallId() {
        return "id generated";
    }
    String calculateRatingCategory() {
        double ratingScore = callQuality / callDuration;
        if (ratingScore >= 0.08) {
            return "Excellent";
        } else if (ratingScore >= 0.05 && ratingScore < 0.08 ) {
            return "Good";
        } else {
            return "Average";
        }
    }
    public String toString() {
        return "Call ID: " + callId + ", Call Duration: " + callDuration + " minutes, Call Quality: "
                + callQuality + ", Rating Category: " + ratingCategory;
    }
}