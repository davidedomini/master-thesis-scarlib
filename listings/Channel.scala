def channel(
    source: Boolean, 
    destination: Boolean, 
    width: Double
): Double {
    dilate(gradient(source) + gradient(destination) 
        <= distance(source, destination), width)
}