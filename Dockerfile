# Use the base image
FROM ortussolutions/commandbox

# Set environment variables
ENV PORT=80 \
    SSL_PORT=443

# Expose ports
EXPOSE 81 443

# Copy files to the appropriate directories
COPY ./ /app

# Set the working directory
WORKDIR /app
