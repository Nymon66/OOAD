public enum Type { 

  STANDARD, MILSIM, ROLEPLAY;

  public String toString() {
    switch(this) {
      case STANDARD: return "standard";
      case MILSIM: return "milsim";
      case ROLEPLAY: return "roleplay";
      default:       return "unspecified";
    }
  }
}
